package src.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class compiladorSymbolTable {
	
	private HashMap<String, compiladorSymbol> map;
	
	public compiladorSymbolTable() {
		map = new HashMap<String, compiladorSymbol>();
		
	}
	
	public void add(compiladorSymbol symbol) {
		map.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}
	
	public compiladorSymbol get(String symbolName) {
		return map.get(symbolName);
	}
	
	public ArrayList<compiladorSymbol> getAll(){
		ArrayList<compiladorSymbol> lista = new ArrayList<compiladorSymbol>();
		for (compiladorSymbol symbol : map.values()) {
			lista.add(symbol);
		}
		return lista;
	}

	
	
}
