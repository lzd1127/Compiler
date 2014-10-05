import java.util.List;
import java.util.ArrayList;


class SymbolTableTree {
    private SymbolTable root; 
    private SymbolTable currentScope;
    private int blockNumber = 1;

    public SymbolTableTree () { 
        root = new SymbolTable("GLOBAL");
        currentScope = root;
    }

    public void enterScope() {
        enterScope("BLOCK " + blockNumber);
        blockNumber += 1;
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
