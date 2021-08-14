package src.ast;

import src.datastructures.compiladorVariable;

public class CommandAtribuicao extends AbstractCommand{

	private String id;
	private String expr;
	
	public CommandAtribuicao(String id, String expr) {
		this.id = id;
		this.expr = expr;
	}
	public String GetId() {
		return this.id;
	}
	
	public String GetExpr() {
		return this.expr;
	}

	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		return id + " = "+expr+";";
	}
	@Override
	public String toString() {
		return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
	}
	
	

}
