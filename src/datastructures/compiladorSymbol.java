package src.datastructures;

public abstract class compiladorSymbol {
	
	protected String name;
	
	public abstract String generateJavaCode();
	public compiladorSymbol(String name) {
		this.name = name;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "compiladorSymbol [name=" + name + "]";
	}
	
	
	

}
