public class Node {

		String opcode;
		String operand1;
		String operand2;
	    String rst;

		public Node(String opcode, String rst) {
			this.opcode = opcode;
			this.rst = rst;
	
		}

		public Node(String opcode, String operand1, String rst) {
			this.opcode = opcode;
			this.rst = rst;
			this.operand1 = operand1;
	
		}

		public Node(String opcode) {
			this.opcode = opcode;
			
		}
		public Node(String opcode, String operand1, String operand2, String rst) {
			this.opcode = opcode;
			this.rst = rst;
			this.operand1 = operand1;
			this.operand2 = operand2;

		}
		public String toString() {
			String tmp = ";";
			if((operand1 == null) && (operand2 == null) && (rst == null)) {
				return tmp + opcode;
			} else if((operand2 == null) && (rst == null)) {
				return tmp + opcode + " " + operand1;
			} else if((rst == null) && (operand2 != null) && (operand1 != null)) {
				return tmp + opcode + " " + operand1 + " " + operand2;
			} else if((operand2 == null) && (operand1 != null) && (rst != null)){
				return tmp + opcode + " " + operand1 + " " + rst;
			}  else if((operand1 == null) && (operand2 == null) && (rst != null)) {
				return tmp + opcode + " " + rst;
			} else {
				return tmp + opcode + " " + operand1 + " " + operand2 + " " + rst;
			}
		}

}

