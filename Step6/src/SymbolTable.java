import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap; 

class SymbolTable {

    public String scopeName;
    private SymbolTable parent;
    private List<SymbolTable> children;
    private List<SymbolEntry> table;
    private Set<String> set;
	public HashMap<String, String> param;	
	
	int paramNumer = 1;
	int localparamNumer = 1;
	int childIndex;

    public SymbolTable(String scopeName) {
    	parent = null;
    	table = new ArrayList<SymbolEntry>();
    	children = new ArrayList<SymbolTable>();
    	set = new HashSet<String>();
    	this.scopeName = scopeName;
		childIndex = 0;
		param = new HashMap<String, String>(); 

    }

    public SymbolTable(String scopeName, SymbolTable parent) {
 		this(scopeName);
    	this.parent = parent;
    }
	

	public String getPRegister() {
        return new String("$P" + paramNumer++);
    }

	public String getLRegister() {
        return new String("$L" + localparamNumer++);
    }

    public void addSymbolEntry(SymbolEntry symbol)  throws IllegalArgumentException{
    	String name = symbol.getName();
    	if (!set.contains(name)) {
    		checkShadow(name);
    		table.add(symbol);
			set.add(name);
    	} else {
    		 throw new IllegalArgumentException("DECLARATION ERROR " 
    		 	+ symbol.getName());
    	}
    }

    private void checkShadow(String name) {
    	SymbolTable s = this.parent;
    	while (s != null) {
    		if (s.getSymbolNames().contains(name)) {
    			System.out.println("SHADOW WARNING " + name);
    			break;
    		}
    		s = s.getParent();
    	}
    }

    public Set<String> getSymbolNames() {
    	return this.set;
    }

    public void setParent(SymbolTable parent) {
    	this.parent = parent;
    }

    public SymbolTable getParent() {
    	return this.parent;
    }

    public void addChildren(SymbolTable s) {
    	children.add(s);
    }

    public List<SymbolTable> getChildren() {
    	return children;
    }

    public List<SymbolEntry> getSymbols() {
    	return table;
    }

    public void printSymbolTables() {
    	System.out.println("Symbol table " + scopeName);
    	for (SymbolEntry s : table) {
    		System.out.println(s);
    	}

    	System.out.println();
    	for (SymbolTable t : children) {
    		t.printSymbolTables();
    	}
    }

 }
