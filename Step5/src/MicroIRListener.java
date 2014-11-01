import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.LinkedList;
import java.util.Stack;
public class MicroIRListener extends MicroBaseListener {

    SymbolTableTree symbolTree;
    ParseTreeProperty<NodeProperties> ptp;

    // number of most recent temp register generated
    int registerNumber;
    // and of most recent label generated
    int labelNumber;

	String idList = null;
	boolean idListRecord = false;
	public static LinkedList<Node> list; 
	Stack<String> loop_stack;
	Stack<String> out_stack;    
	Stack<String> end_stack;
	boolean enterif = false;
	boolean enterwhile = false;

    public MicroIRListener(SymbolTableTree symbolTree) {
        this.symbolTree = symbolTree;
        this.ptp = new ParseTreeProperty<NodeProperties>();
        this.registerNumber = 0;
        this.labelNumber = 0;
        this.list = new LinkedList<Node>();
		loop_stack = new Stack<String>();
		out_stack = new Stack<String>();
		end_stack = new Stack<String>();
    }
    
	public static LinkedList<Node> getList() {
		return list;
	}

    private String getNewLabel() {
        labelNumber += 1;
        return getLabel();
    }

    private String getLabel() {
        return new String("label" + labelNumber);
    }

    private String getNewRegister(String type) {
        registerNumber += 1;
        String registerName = new String("$T" + registerNumber);
        symbolTree.insertVariable(registerName, type, null);
        return registerName;
    }

    private String getRegister() {
        return new String("$T" + registerNumber);
    }

	 private String storeRegister() {
        return new String("$T" + registerNumber++);
    }
    private String lookupOpcode(String operator) {
        switch (operator) {
            case "<":
                return "GE";
            case ">":
                return "LE";
            case ">=":
                return "LT";
            case "<=":
                return "GT";
            case "!=":
                return "EQ";
            case "=":
                return "NE";
            default:
                return "ERROR";
        }
    }

    private String lookupOpcode(
            String operator, String type) {
        // look up the opcode for that var type
        if (operator.equals("+")) {
            if (type.equals("INT"))
                return "ADDI";
            if (type.equals("FLOAT"))
                return "ADDF";
        }

        if (operator.equals("-")) {
            if (type.equals("INT"))
                return "SUBI";
            if (type.equals("FLOAT"))
                return "SUBF";
        }

        if (operator.equals("*")) {
            if (type.equals("INT"))
                return "MULTI";
            if (type.equals("FLOAT"))
                return "MULTF";
        }

        if (operator.equals("/")) {
            if (type.equals("INT"))
                return "DIVI";
            if (type.equals("FLOAT"))
                return "DIVF";
        }
        return "ERROR";
    }

	@Override public void enterPgm_body(MicroParser.Pgm_bodyContext ctx) { 
		//System.out.println("LABEL main");
		//list.addLast(new Node("LABEL", "main"));	
	}

	@Override public void enterProgram(MicroParser.ProgramContext ctx) {
		list.addLast(new Node("IR", "code"));
	}

	@Override public void exitPgm_body( MicroParser.Pgm_bodyContext ctx) {
		list.addLast(new Node("tiny", "code"));
	}


    public void addNodeProp(ParserRuleContext ctx, 
            String key, String value) {
        ptp.get(ctx).data.put(key, value);
    }

    public void passToParent(ParserRuleContext ctx, String str) {
        ParserRuleContext parent = ctx.getParent();
        if (parent != null) {
            NodeProperties parentNodeProps = ptp.get(ctx.getParent());
            if (str != "null") {
                parentNodeProps.text = parentNodeProps.text + " " + str;
            }
        }
    }
	/*
    @Override public void enterIf_stmt(
            MicroParser.If_stmtContext ctx) {		
        symbolTree.begin();
		enterif = true;
		
    }

    @Override public void exitIf_stmt(
            MicroParser.If_stmtContext ctx) {
		list.addLast(new Node("LABEL", end_stack.pop()));
        symbolTree.exitScope();
    }

	@Override public void enterElse_part(MicroParser.Else_partContext ctx) {
		 symbolTree.begin();
		 if(!end_stack.isEmpty()) {
			//list.addLast(new Node("JUMP", getNewLabel()));
			//list.addLast(new Node("LABEL", end_stack.pop()));
			end_stack.push(getLabel());
		 }
	}

	@Override public void exitElse_part(MicroParser.Else_partContext ctx) {
		symbolTree.exitScope(); 
	}
	*/
	
	@Override public void enterAug_if_stmt( MicroParser.Aug_if_stmtContext ctx) {
		symbolTree.begin();
		enterif = true;
	}

	@Override public void exitAug_if_stmt( MicroParser.Aug_if_stmtContext ctx) { 
		list.addLast(new Node("LABEL", end_stack.pop()));
        symbolTree.exitScope();
	}

	@Override public void enterAug_else_part(MicroParser.Aug_else_partContext ctx) {
		 symbolTree.begin();
		 if (ctx.getText().trim().length() == 0) return;

		 if(!end_stack.isEmpty()) {
			list.addLast(new Node("JUMP", getNewLabel()));
			list.addLast(new Node("LABEL", end_stack.pop()));
			end_stack.push(getLabel());
		 } 
	}

	@Override public void exitAug_else_part(MicroParser.Aug_else_partContext ctx) { 
		symbolTree.exitScope(); 
	}	

	@Override public void exitAug_stmt(MicroParser.Aug_stmtContext ctx) { 
		if (ctx.getText().startsWith("CONTINUE")) {
			list.addLast(new Node("JUMP", loop_stack.peek()));
		} else if (ctx.getText().startsWith("BREAK")) {
			list.addLast(new Node("JUMP", out_stack.peek()));
		}
	}

    @Override public void enterWhile_stmt(
            MicroParser.While_stmtContext ctx) {
        symbolTree.begin();
		enterwhile = true;
		list.addLast(new Node("LABEL", getNewLabel()));
		loop_stack.push(getLabel());
    }

    @Override public void exitWhile_stmt(
            MicroParser.While_stmtContext ctx) {
		list.addLast(new Node("JUMP", loop_stack.pop()));
		list.addLast(new Node("LABEL", out_stack.pop()));
        symbolTree.exitScope();
    }

    @Override public void enterFunc_decl(
            MicroParser.Func_declContext ctx) {
        symbolTree.begin();
		list.addLast(new Node("LABEL", "main"));
		list.addLast(new Node("LINK"));
    }
    
    @Override public void exitFunc_decl(
            MicroParser.Func_declContext ctx) {
		list.addLast(new Node("RET"));
        symbolTree.exitScope();
    }

    @Override public void enterAssign_expr(
            MicroParser.Assign_exprContext ctx) {

        ptp.get(ctx).data.put("assign_Lvalue", null);
    }

    @Override public void exitAssign_expr(
            MicroParser.Assign_exprContext ctx) {

        String Lvalue = ptp.get(ctx).data.get("assign_Lvalue");
        String storeOp = "ERROR";
        String LvalueType = symbolTree.lookup(Lvalue).getType();

        if (LvalueType.equals("INT")) {
            storeOp = "STOREI";
        } else if (LvalueType.equals("FLOAT")) {
            storeOp = "STOREF";
        }
		if (!Lvalue.contains("$") && !ptp.get(ctx).data.get("primary").contains("$")) {
			list.addLast(new Node(storeOp, ptp.get(ctx).data.get("primary"), Lvalue));
			addNodeProp(ctx, "primary", LvalueType);
			return;
		}
		if (!ptp.get(ctx).data.get("primary").contains("$")) {
				String temp = getNewRegister(LvalueType);
				//System.out.println(storeOp + " " + ptp.get(ctx).data.get("primary") + " " + temp);
				list.addLast(new Node(storeOp, ptp.get(ctx).data.get("primary"), temp));
				//System.out.println(storeOp + " " +
                 //                  temp +
                  //                  " " + Lvalue);
				list.addLast(new Node(storeOp, temp, Lvalue));				
				addNodeProp(ctx, "primary", temp);
		} else {
		//System.out.println(storeOp + " " + ptp.get(ctx).data.get("primary") + " " + Lvalue);
			list.addLast(new Node(storeOp, ptp.get(ctx).data.get("primary"), Lvalue));	
		}
	
    }

	@Override
	public void enterRead_stmt(MicroParser.Read_stmtContext ctx) { 
		idListRecord = true;
	}

	@Override
	public void exitRead_stmt(MicroParser.Read_stmtContext ctx) { 
		String [] parts = idList.split(",");
		for (int i = 0; i < parts.length; i++){
			String type =  symbolTree.lookup(parts[i]).getType();
			if (type.equals("INT")){
				//System.out.println("READI " + parts[i]);
				list.addLast(new Node("READI", parts[i]));	
			}else if(type.equals("FLOAT")){
				//System.out.println("READF " + parts[i]);
				list.addLast(new Node("READF", parts[i]));	
			}
		}
		idList = null;
		idListRecord = false;
	}

	@Override
	public void exitId_list(MicroParser.Id_listContext ctx) { 
		if (idListRecord == true){
			idList = ctx.getText();
		}
	}


	@Override
	public void enterWrite_stmt(MicroParser.Write_stmtContext ctx) {
		idListRecord = true;
	}

	@Override public void exitWrite_stmt(MicroParser.Write_stmtContext ctx) {

		String [] parts = idList.split(",");
		for (int i = 0; i < parts.length; i++){
			String type =  symbolTree.lookup(parts[i]).getType();
			if (type.equals("INT")){
				//System.out.println("WRITEI " + parts[i]);
				list.addLast(new Node("WRITEI", parts[i]));	
			}else if(type.equals("FLOAT")){
				//System.out.println("WRITEF " + parts[i]);
				list.addLast(new Node("WRITEF", parts[i]));
			}else {
				//System.out.println("WRITES " + parts[i]);
				list.addLast(new Node("WRITES", parts[i]));
			}
		}
		idList = null;
		idListRecord = false;	
	}	

    @Override public void exitId(
            MicroParser.IdContext ctx) {
        NodeProperties parentNodeProps = ptp.get(ctx.getParent());
        
        if (parentNodeProps.data.containsKey("assign_Lvalue") 
            ) {
              addNodeProp(ctx.getParent(), "assign_Lvalue", ctx.getText());
        }
    }

    @Override public void exitAddop(
            MicroParser.AddopContext ctx) {
        addNodeProp(ctx, "addop", ctx.getText()); 
    }


	@Override
	public void exitPostfix_expr(MicroParser.Postfix_exprContext ctx) {

		NodeProperties factor_prefix = ptp.get(ctx.getParent().getChild(0));

		if (!factor_prefix.toString().isEmpty()) {

			String type = symbolTree.lookup(ptp.get(ctx).data.get("primary")).getType();
			String temp = getNewRegister(type);

			String opcode = lookupOpcode(factor_prefix.data.get("mulop"), type);

			list.addLast(new Node(opcode, factor_prefix.data.get("primary"), ptp.get(ctx).data.get("primary"), temp));
			addNodeProp(ctx, "primary", temp);
		}
	}

	boolean executePrimary = true;
	@Override
	public void exitMulop(MicroParser.MulopContext ctx) {

			addNodeProp(ctx, "mulop", ctx.getText());
	
	}

    @Override public void exitPrimary(
            MicroParser.PrimaryContext ctx) {

		if (executePrimary){
			String tmp = ctx.getText();        	
			if (!symbolTree.findSymbol(ctx.getText())){
				if (!ctx.getText().contains(".")){
					//System.out.println("InT");
					//symbolTree.insertVariable(ctx.getText(), "INT", null);
					tmp = getNewRegister("INT");
					//System.out.println("STOREI" + " " + ctx.getText() + " " + tmp);
					list.addLast(new Node("STOREI", ctx.getText(), tmp));
				
				} else {
					//System.out.println("Float");
					//symbolTree.insertVariable(ctx.getText(), "FLOAT", null);
					tmp = getNewRegister("FLOAT");
					//System.out.println("STOREF" + " " + ctx.getText() + " " + tmp);
					list.addLast(new Node("STOREF", ctx.getText(), tmp));
				}
			}			
			addNodeProp(ctx, "primary", tmp);
		} else {
			executePrimary = true;
		}
    }

	@Override
	public void exitPrimary_prefix(MicroParser.Primary_prefixContext ctx) { 
		addNodeProp(ctx, "primary", "$T" + registerNumber);
		executePrimary = false;
	}

    @Override public void enterEveryRule(ParserRuleContext ctx){
        if (ctx.getText() != null) {
            ptp.put(ctx, new NodeProperties(ctx.getText()));
        }
    }

    @Override public void exitEveryRule(ParserRuleContext ctx){
        ParserRuleContext parent = ctx.getParent();
        if (parent != null) {
            NodeProperties parentNodeProps = ptp.get(ctx.getParent());
            parentNodeProps.data.putAll(ptp.get(ctx).data);
        }
    }

	private boolean checkConstant(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;

	}

    @Override public void exitFactor(
            MicroParser.FactorContext ctx) {
        NodeProperties expr_prefix = ptp.get(ctx.getParent().getChild(0));
        //System.out.println("exit factor expr_prefix: " + expr_prefix);

        if (!expr_prefix.toString().isEmpty()) {
          // generate add IR
          String type = symbolTree.lookup(
                  ptp.get(ctx).data.get("primary")).getType();
	
          String temp = getNewRegister(type);
          String opcode = lookupOpcode(
                  expr_prefix.data.get("addop"), type);

		  list.addLast(new Node(opcode, expr_prefix.data.get("primary"), ptp.get(ctx).data.get("primary"), temp));
          addNodeProp(ctx, "primary", temp);
        }
    }

    @Override public void exitExpr(MicroParser.ExprContext ctx) {
        //System.out.println("expr: " + ctx.getText());

        NodeProperties np = ptp.get(ctx);
        //System.out.println("exit expr: " + np.text);

        // pass up the last register if it exists
        if (ptp.get(ctx).data.containsKey("register")) {
          addNodeProp(ctx, "register", ptp.get(ctx).data.get("register"));
        } else {
          addNodeProp(ctx, "register", ptp.get(ctx).data.get("primary"));
        }
    }
    
    @Override public void exitExpr_prefix(
            MicroParser.Expr_prefixContext ctx) {
        NodeProperties parentProps = ptp.get(ctx.getParent());
    }

    @Override public void exitCompop(MicroParser.CompopContext ctx) {
        addNodeProp(ctx, "compop", ctx.getText());
    }

    @Override public void exitCond(MicroParser.CondContext ctx) {
		
		 String type = symbolTree.lookup(ptp.get(ctx.getChild(0)).data.get("register")).getType();
		 list.addLast(new Node(lookupOpcode(ptp.get(ctx.getChild(1)).data.get("compop")) + type.substring(0, 1),
					  ptp.get(ctx.getChild(0)).data.get("register"), ptp.get(ctx.getChild(2)).data.get("register"), getNewLabel()));
		if (enterwhile) {
			enterwhile = false;
			out_stack.push(getLabel());
		}
		if (enterif) {
			enterif = false;
			end_stack.push(getLabel());
		}	
			
    }

}

