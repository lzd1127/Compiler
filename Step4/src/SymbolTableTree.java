import java.util.List;
import java.util.ArrayList;


class SymbolTableTree {
    private SymbolTable root; 
    public SymbolTable currentScope;
    private int blockNumber = 1;

    public SymbolTableTree () { 
        root = new SymbolTable("GLOBAL");
        currentScope = root;
    }

    public void enterScope() {
        enterScope("BLOCK " + blockNumber);
        blockNumber += 1;
    }

	public boolean findSymbol(String name) {
		SymbolTable s = currentScope;
		while (s != null) {
			if (s.getSymbolNames().contains(name)) {
				return true;			
			} else {
				s = s.getParent();
			}
		}
		return false;

	}

	public List<SymbolEntry> findAllGlobal() {
		return root.getSymbols();
	}

	public SymbolEntry lookup(String varName) {
		return _lookup(currentScope, varName);
	}
	
	private SymbolEntry _lookup(SymbolTable scope, String varName) {
		if (scope.getSymbolNames().contains(varName)) {
			//System.out.println("looking up " + varName);
			for (SymbolEntry s : scope.getSymbols()) {
				if (s.getName().equals(varName)) {
					return s;
				}
			}
		} else {
			// recurse up to find it
			return _lookup(scope.getParent(), varName);
		}
		return _lookup(scope.getParent(), varName);
	}
	public void begin() {
		currentScope = currentScope.getChildren().get(currentScope.childIndex);
		// increment
		currentScope.childIndex += 1;
	}	

    public void enterScope(String scopeName) {
        SymbolTable newScope = new SymbolTable(scopeName, currentScope);
        currentScope.getChildren().add(newScope);
       	currentScope = newScope;
    }

    public void exitScope() {
        currentScope = currentScope.getParent();
    }

    public void insertVariables(List<String> names, String type)  
								throws IllegalArgumentException {
        for (String name : names) {
          	insertVariable(name, type, null);
        }
    }

    public void insertVariable(String name, 
			    String type, String value) throws IllegalArgumentException {
    	SymbolEntry symbol = new SymbolEntry(name, type, value);
    	currentScope.addSymbolEntry(symbol);
    }

    public void printWholeTree() {
    	root.printSymbolTables();
    }

}
