package src.ast;

import java.util.ArrayList;

public class CommandEscrita extends AbstractCommand {

	private String id;
	private ArrayList<AbstractCommand> funcao = null;

	public CommandEscrita(String id) {
		this.id = id;
		this.funcao = null;

	}
	public CommandEscrita(ArrayList<AbstractCommand> funcao) {
		this.funcao = funcao;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		if(funcao!= null){
			StringBuilder str = new StringBuilder();
			for (AbstractCommand cmd: funcao) {
				str.append(cmd.generateJavaCode());
			}
			return "System.out.println("+str.toString()+");";
		}
		return "System.out.println("+id+");";
	}
	@Override
	public String toString() {
		return "CommandEscrita [id=" + id + "]";
	}
	

}
