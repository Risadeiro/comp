package src.ast;

import src.datastructures.compiladorVariable;

public class CommandAtribuicao extends AbstractCommand{

	private String id;
	private String expr;
	private int tam=-1;

	public CommandAtribuicao(String id, String expr) {
		this.id = id;
		this.expr = expr;
	}
	public CommandAtribuicao(String id, String expr, int tam) {
		this.id = id;
		this.expr = expr;
		this.tam = tam;
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
		return  id + " = "+(tam>0? "new int[]": "")+expr+";";
	}
	@Override
	public String toString() {
		return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
	}
	
	

}
