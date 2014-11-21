import java.util.HashMap;

class Function {
	
	int numOfLocal;
	HashMap<String, String> map;
	int ParamNumber;
	int regCount;
	HashMap<String, String> regMap;

	Function (int numOfLocal, HashMap<String, String> map) {
		this.numOfLocal = numOfLocal;
		this.map = map;
		this.ParamNumber = 16;
		regCount = 0;
		regMap = new HashMap<String, String>();
	}		

	public String getNewParamRegister() {
		ParamNumber++;
		return "$" + ParamNumber;
	}
	
	public String getNewRegister() {
		String registerName = new String("r" + regCount);
		regCount += 1;
		return registerName;
	}
}
