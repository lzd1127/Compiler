import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

//covertOperation has weird behavior
public class IRStorage {

	LinkedList<Node> IRlist;
	LinkedList<TinyNode> tinyList;
	SymbolTableTree tree;
	private int regCount = 0;
	Map<String, String> map;
	Function currFunction;
	boolean startPop = false;


	public IRStorage(SymbolTableTree tree) {
		IRlist = MicroIRListener.getList();
		tinyList = new LinkedList<TinyNode>();
		map = new HashMap<String, String>();
		this.tree = tree;
	}

	public void printIRlist() {
		for (Node n : IRlist) {
			System.out.println(n);
		}
	}

	public void addTinyNode(String opcode, String oper1, String oper2) {
		tinyList.addLast(new TinyNode(opcode, oper1, oper2));
	}

	public void pushRegister() {
		for (int i = 0; i < 15; i++) {
			addTinyNode("push", "r" + i, null);
		}	
	}
	public void convertIRToTinyCode() {
		//tinyList.addLast(new TinyNode(";tiny code", null, null));
		List<SymbolEntry> table = tree.findAllGlobal();
		for(int i = 0; i < table.size(); i++) {
			String var = table.get(i).getName();
			if (table.get(i).getStringValue() == null) {
				addTinyNode("var", var, null);
			} else {
				addTinyNode("str", var, table.get(i).getStringValue());
			}
		}
		addTinyNode("push", null, null);
		pushRegister();
		addTinyNode("jsr", "main", null);
		addTinyNode("sys", "halt", null);

		for(Node IRnode : IRlist) {
			convertTiny(IRnode);
		}
		addTinyNode("end", null, null);
	}

	public void convertTiny(Node node) {
		if (node.opcode.equals("LABEL")){
			convert_Label(node.rst);
		} else if(node.opcode.equals("STOREI") || node.opcode.equals("STOREF")){
			convert_Store(node.operand1, node.rst);
		} else if(node.opcode.equals("READI") || node.opcode.equals("READF")){
			convert_Read(node.opcode, node.rst);
		} else if(node.opcode.equals("DIVI") || node.opcode.equals("DIVF")){
			converOperation(node.opcode, node.operand1, node.operand2, node.rst);
		} else if(node.opcode.equals("MULTI") || node.opcode.equals("MULTF")){
			converOperation(node.opcode, node.operand1, node.operand2, node.rst);
		} else if(node.opcode.equals("ADDI") || node.opcode.equals("ADDF")){
			converOperation(node.opcode, node.operand1, node.operand2, node.rst);
		} else if(node.opcode.equals("SUBI") || node.opcode.equals("SUBF")){
			converOperation(node.opcode, node.operand1, node.operand2, node.rst);
		} else if(node.opcode.equals("WRITEI") || node.opcode.equals("WRITEF") || node.opcode.equals("WRITES")){
			convert_Write(node.opcode, node.rst);
		} else if(node.opcode.equals("RET")){
			convert_Ret();
		} else if (node.opcode.equals("JUMP")) {
			convert_Jump(node.rst);
		} else if (node.opcode.startsWith("GE") || node.opcode.startsWith("GT") || node.opcode.startsWith("LT")||
					node.opcode.startsWith("LE") || node.opcode.startsWith("EQ") || node.opcode.startsWith("NE")) {
			convert_compare(node.opcode, node.operand1, node.operand2, node.rst);
		} else if (node.opcode.startsWith("PUSH")) {
			convert_push(node.rst, node);
		} else if (node.opcode.startsWith("JSR")) {
			convert_jsr(node.rst);
		} else if (node.opcode.startsWith("POP")) {
			convert_pop(node.rst, node);
		}

	}
	
	public void popAll() {
		for (int i = 14; i >= 0; i--) {
			addTinyNode("pop", "r" + i, null);
		}
	}
	public void convert_pop(String op, Node node) {
		if (!startPop) {
			startPop = true;
			popAll();
		}

		if (op == null) {
			addTinyNode("pop", null, null);
		} else {
			String text;
			if (map.containsKey(op)) {
				text = map.get(op);				
			} else {
				text = currFunction.getNewRegister();
				map.put(op, text);
			}
			addTinyNode("pop", text, null);
		}
	
		int index = IRlist.indexOf(node);
		node = IRlist.get(index + 1);
		if (!node.opcode.equals("POP")) {
			startPop = false;	
		}		
		
	}
	public void convert_jsr(String op) {	
		addTinyNode("jsr", op, null);
	}

	public void convert_push(String op, Node node) {
		if (op == null) {
			addTinyNode("push", null, null);
		} else {
			checkFor(op);
			String txt = op;
			if (map.containsKey(op)) {
				txt = map.get(op);
			}
			addTinyNode("push", txt, null);

			int index = IRlist.indexOf(node);
			node = IRlist.get(index + 1);
			if (!node.opcode.equals("PUSH")) {
				pushRegister();
			}
		}
		

	}
	public void checkFor(String ops1) {
		if (ops1.startsWith("$P")) {
			if (!map.containsKey(ops1)) {
				String tmp = currFunction.getNewParamRegister();
				map.put(ops1, tmp);
			}
		}

	}
	public void convert_compare(String opcode, String operand1, String operand2, String rst) {
		char c = opcode.charAt(opcode.length() - 1);
		if (c == 'F') {
			c = 'r';
		}
		c = Character.toLowerCase(c);
		checkFor(operand1);
		checkFor(operand2);
		
		if (map.get(operand2) == null) {
			String text = getNewRegister();			
			map.put(operand2,text);
			addTinyNode("move", operand2, text);
		}
		String tmp;
		if (map.containsKey(operand1)) {
			tmp = map.get(operand1);
		} else {
			tmp = operand1;
		}
		//addTinyNode("cmp" + c, tmp, map.get(operand2));
		String more = getNewRegister();
		addTinyNode("move", map.get(operand2), more);
		addTinyNode("cmp" + c, tmp, more);
		addTinyNode("j" + opcode.toLowerCase().substring(0, opcode.length() - 1), rst, null);	

	}
	/*
	private String getNewRegister() {
		String registerName = new String("r" + regCount);
		regCount += 1;
		return registerName;
	}*/

	private String getNewRegister() {
		return currFunction.getNewRegister();
	}
	public void convert_Ret(){
		addTinyNode("unlnk", null, null);
		addTinyNode("ret", null, null);
		//addTinyNode("sys", "halt", null);
	}

	public void convert_Write(String opcode, String op1){
		
		String suffix = null;
		int index = opcode.length() - 1;
		
		if (map.containsKey(op1)) {
			op1 = map.get(op1);		
		}
	
		if (opcode.charAt(index) == 'F') {
			suffix = "r";
			addTinyNode("sys", opcode.toLowerCase().substring(0, index) + suffix, op1);					
		} else {
			index += 1;
			addTinyNode("sys", opcode.toLowerCase(), op1);	
		}
		
	}

	public void converOperation(String opcode, String op1, String op2, String rst) {
		String ops1 = op1;
		String ops2 = op2;
		String suffix = null;
		if (opcode.charAt(opcode.length() - 1) == 'I') {
			suffix = "i";
		} else {
			suffix = "r";
		}
		String operation = opcode.substring(0, 3).toLowerCase() + suffix;
		String result = getNewRegister();
		
		checkFor(ops1);
		checkFor(ops2);
		
		if (!rst.startsWith("$L")) {
			map.put(rst, result);	
		} else {
			result = map.get(rst);
		}
		if (ops1.charAt(0) == '$'){
			ops1 = map.get(op1);
		}
		if (ops2.charAt(0) == '$'){
			ops2 = map.get(op2);
		}
	
		addTinyNode("move", ops1, result);
		addTinyNode(operation, ops2, result);


	}

	public void convert_Read(String opcode, String op1){
		String suffix = null;
		int index = opcode.length() - 1;
		if (opcode.charAt(index) == 'F') {
			suffix = "r";				
		} else {
			suffix = "i";
		}
		checkFor(op1);
		
		if (map.containsKey(op1)) {
			op1 = map.get(op1);		
		}
		addTinyNode("sys", opcode.toLowerCase().substring(0, index) + suffix, op1);
	}

	public void convert_Label(String op){
		addTinyNode("label", op, null); 
		if (tree.functionMap.containsKey(op)) {
			String count = String.valueOf(tree.functionMap.get(op).numOfLocal);
			addTinyNode("link", count, null); 
			currFunction = tree.functionMap.get(op);
			map = currFunction.regMap;
			Set<String> set = currFunction.map.keySet();
			for (String s : set) {
				if (currFunction.map.get(s).startsWith("$L")) {
					//System.out.println("$-" + currFunction.map.get(s).substring(2));
					map.put(currFunction.map.get(s), "$-" + currFunction.map.get(s).substring(2));
				}
			}
		
		}
	}

	public void convert_Jump(String op1) {
		addTinyNode("jmp", op1, null);

	}
	public void convert_Store(String op1, String op2) {
		String text = op2;
		if (op2.charAt(0) == '$'){
			if (op2.startsWith("$L")) {
				text = map.get(op2);
			} else {
				if (op2.startsWith("$R")) {
					if (!map.containsKey(op2)) {
						text = currFunction.getNewParamRegister();
						map.put(op2, text);
					} else {
						text = map.get(op2);
					}	
				} else {
					text = getNewRegister();
				}
				map.put(op2, text);
			}
			if (map.containsKey(op1)) {
				addTinyNode("move", map.get(op1), text);
			} else {
				addTinyNode("move", op1, text);
			}
		} else {
			if (map.get(op1) == null) {
				text = getNewRegister();
				map.put(op1, text);
				addTinyNode("move", op1, text);
			} else {
				text = map.get(op1);

			}
			addTinyNode("move", text, op2);
		}
	}

	public void printTinyList() {
		convertIRToTinyCode();
		for (TinyNode t : tinyList) {
			System.out.println(t);		
		}
	}
}
