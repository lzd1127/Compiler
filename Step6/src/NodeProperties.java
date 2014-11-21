import java.util.LinkedHashMap;
import java.util.Set;

public class NodeProperties {
	public String text = null;
	public LinkedHashMap<String, String> data = new LinkedHashMap<>();

	public NodeProperties() {
	}

	public NodeProperties(String text) {
                //System.out.println(text);
		this.text = text;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		Set<String> keys = data.keySet();
		if (keys.size() > 0) {
			str.append(text);
			str.append(" - ");
			for (String key : keys) {
				str.append(key);
				str.append(": ");
				str.append(data.get(key));
				str.append(", ");
			}
		}
		return str.toString();
	}
}
