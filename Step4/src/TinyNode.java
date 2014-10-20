
public class TinyNode {
	private String opcode;
	private String oper1;
	private String oper2;
	
	public TinyNode(String opcode, String oper1, String oper2) {
		this.opcode = opcode;
		this.oper1 = oper1;
		this.oper2 = oper2;
	}
	
	public String getOpcode() {
		return opcode;
	}
	
	public String getOper1() {
		return oper1;
	}
	
	public String getOper2() {
		return oper2;
	}
	
	public String toString() {
		if((oper1 == null) && (oper2 == null)) {
			return opcode;
		}
		else if((oper2 == null) && (oper1 != null)) {
			return opcode + " " + oper1;
		}
		else if((oper2 != null) && (oper1 == null)) {
			return opcode + " " + oper2;
		} else {
			return opcode + " " + oper1 + " " + oper2;
		}
	}
}

