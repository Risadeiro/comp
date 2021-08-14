package src.ast;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import src.datastructures.compiladorSymbol;
import src.datastructures.compiladorSymbolTable;
import src.datastructures.compiladorVariable;
import src.exceptions.compiladorSemanticException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class compiladorProgram {
	private compiladorSymbolTable varTable;
	private ArrayList<AbstractCommand> comandos;
	private String programName;

	public void generateTarget() {
		StringBuilder str = new StringBuilder();
		str.append("import java.util.Scanner;\n");
		str.append("public class MainClass{ \n");
		str.append("  public static void main(String args[]){\n ");
		str.append("      Scanner _key = new Scanner(System.in);\n");
		for (compiladorSymbol symbol: varTable.getAll()) {
			str.append(symbol.generateJavaCode()+"\n");
		}
		for (AbstractCommand command: comandos) {
			str.append(command.generateJavaCode()+"\n");
		}
		str.append("  }");
		str.append("}");

		

		String TextoComandos = "";
		for (AbstractCommand aux : comandos) {
			TextoComandos += aux.toString();
		}

		for (compiladorSymbol aux : varTable.getAll()) {
			Pattern pattern = Pattern.compile("id="+aux.getName()+"[^a-zA-Z0-9]", Pattern.CASE_INSENSITIVE);
    		Matcher matcher = pattern.matcher(TextoComandos);
    		boolean matchFound = matcher.find();
    		if(!matchFound)
				throw new compiladorSemanticException("Symbol "+ aux.getName() +" not used");
		}

		for (AbstractCommand aux : comandos) {
			if(aux.getClass() == new CommandAtribuicao("","").getClass()){
				CommandAtribuicao cmdatr = (CommandAtribuicao) aux;
				String id = cmdatr.GetId();
				String expr = cmdatr.GetExpr();
				Pattern patternTexto = Pattern.compile("\".*\"", Pattern.CASE_INSENSITIVE);
				Pattern patternNumero = Pattern.compile("^[0-9]*.?[0-9]*$", Pattern.CASE_INSENSITIVE);
    			Matcher matcherTexto = patternTexto.matcher(expr);
    			Matcher matcherNumero = patternNumero.matcher(expr);
    			boolean matchFoundTexto = matcherTexto.find();
    			boolean matchFoundNumero = matcherNumero.find();
				int tipo = 100;
    			if(matchFoundTexto)
					tipo = 1;
				else if(matchFoundNumero)
					tipo = 0;
				else
					throw new compiladorSemanticException("Symbol "+ id +" does not support "+ expr);
				for (compiladorSymbol auxVar : varTable.getAll()) {
					compiladorVariable compVar = (compiladorVariable) auxVar;
					if(id.equals(compVar.getName()) && tipo != compVar.getType()){
						throw new compiladorSemanticException("Symbol "+ id +" does not support "+ expr);
					}
				}
			}
		}
		
		try {
			FileWriter fr = new FileWriter(new File("MainClass.java"));
			fr.write(str.toString());
			fr.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

	public compiladorSymbolTable getVarTable() {
		return varTable;
	}

	public void setVarTable(compiladorSymbolTable varTable) {
		this.varTable = varTable;
	}

	public ArrayList<AbstractCommand> getComandos() {
		return comandos;
	}

	public void setComandos(ArrayList<AbstractCommand> comandos) {
		this.comandos = comandos;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

}
