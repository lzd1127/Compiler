public class SymbolEntry {
	private String variable;
	private String type;
	private String string_value;
	
	public SymbolEntry(String variable, String type, String string_value) {
		this.variable = variable;
		this.type = type;
		this.string_value = string_value;
	}
	
	public String getName() {
		return variable;
	}
	
	public String getType() {
		return type;
	}
	
	public String getStringValue() {
		return string_value;
	}
	
	public String toString() {
		if(type.equals("STRING")) {
			return "name " + variable + " type " + type + " value " + string_value;
		}
		else {
			return "name " + variable + " type " + type;
		}
	}
	
}
