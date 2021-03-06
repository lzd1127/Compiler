import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class IRStorage {

	LinkedList<Node> IRlist;
	LinkedList<TinyNode> tinyList;
	SymbolTableTree tree;
	private int regCount = 0;
	Map<String, String> map;

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
		for(Node IRnode : IRlist) {
			convertTiny(IRnode);
		}
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
		}

	}
	

	public void convert_compare(String opcode, String operand1, String operand2, String rst) {
		char c = opcode.charAt(opcode.length() - 1);
		if (c == 'F') {
			c = 'r';
		}
		c = Character.toLowerCase(c);
		if (map.get(operand2) == null) {
			String text = getNewRegister();			
			map.put(operand2,text);
			addTinyNode("move", operand2, text);
		}
		addTinyNode("cmp" + c, operand1, map.get(operand2));
		addTinyNode("j" + opcode.toLowerCase().substring(0, opcode.length() - 1), rst, null);	

	}
	private String getNewRegister() {
		String registerName = new String("r" + regCount);
		regCount += 1;
		return registerName;
	}

	public void convert_Ret(){
		addTinyNode("sys", "halt", null);
	}

	public void convert_Write(String opcode, String op1){
		
		String suffix = null;
		int index = opcode.length() - 1;
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

		map.put(rst, result);
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
		
		addTinyNode("sys", opcode.toLowerCase().substring(0, index) + suffix, op1);
	}

	public void convert_Label(String op){
		addTinyNode("label", op, null); 
	}

	public void convert_Jump(String op1) {
		addTinyNode("jmp", op1, null);

	}
	public void convert_Store(String op1, String op2) {
		String text = op2;
		if (op2.charAt(0) == '$'){
			text = getNewRegister();
			map.put(op2, text);
			addTinyNode("move", op1, text);
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
