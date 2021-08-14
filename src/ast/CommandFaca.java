package src.ast;

import java.util.ArrayList;

public class CommandFaca extends AbstractCommand {
 
	private String condition;
	private ArrayList<AbstractCommand> lista;
	
	public CommandFaca(String condition, ArrayList<AbstractCommand> l) {
		this.condition = condition;
		this.lista = l;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("do {\n");
		for (AbstractCommand cmd: lista) {
			str.append(cmd.generateJavaCode());
		}
		str.append("} while ("+condition+");\n");
		return str.toString();
	}
	@Override
	public String toString() {
		return "CommandFaca [condition=" + condition + ", lista=" + lista
				+ "]";
	}
}
