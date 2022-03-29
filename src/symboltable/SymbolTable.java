package symboltable;

import java.util.*;
import ast.definitions.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String, Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<>();
		table.add(new HashMap<>());
	}

	public void set() {
		table.add(new HashMap<>());
		scope++;
	}
	
	public void reset() {
		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		if (findInCurrentScope(definition.getName()) != null){
			return false;
		}
		table.get(scope).put(definition.getName(), definition);
		definition.setScope(scope);
		return true;
	}
	
	public Definition find(String id) {
		for (Map<String, Definition> map : table){
			if (map.containsKey(id)){
				return  map.get(id);
			}
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}
