package src.ast;
import src.datastructures.compiladorVariable;

public class CommandTamanho extends AbstractCommand{
    private String id;
    private compiladorVariable var;

    public CommandTamanho(String id, compiladorVariable var) {
        this.id = id;
        this.var = var;
    }
    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return id +(var.getType()==compiladorVariable.VECTOR? ".length": ".length()");
    }
    @Override
    public String toString() {
        return "CommandTamanho [id=" + id + "]";
    }


}
