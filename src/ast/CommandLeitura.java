package src.ast;

import src.datastructures.compiladorVariable;

public class CommandLeitura extends AbstractCommand {

	private String id;
	private compiladorVariable var;
	
	public CommandLeitura (String id, compiladorVariable var) {
		this.id = id;
		this.var = var;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
        String next = "";
        switch (var.getType()) {
            case compiladorVariable.NUMBER:
                next = "nextDouble();";
                break;
            case compiladorVariable.TEXT:
                next = "nextLine();";
                break;
            case compiladorVariable.BOOLEAN:
                next = "nextBoolean();";
                break;
            case compiladorVariable.CHAR:
                next = "next().charAt(0);";
                break;
            default:
                next = "nextInt();";
                break;
        }
		return id +"= _key." + next;
	}
	@Override
	public String toString() {
		return "CommandLeitura [id=" + id + "]";
	}

}
