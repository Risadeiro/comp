package src.datastructures;

public class compiladorVariable extends compiladorSymbol {
	
	public static final int NUMBER=0;
	public static final int TEXT  =1;
	public static final int BOOLEAN =2;
	public static final int CHAR =3;
	public static final int INT =4;
	public static final int VECTOR =5;

	private int type;
	private String value;
	
	public compiladorVariable(String name, int type, String value) {
		super(name);
		this.type = type;
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "compiladorVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
	}
	
	public String generateJavaCode() {
       String str;
       if (type == NUMBER) {
    	   str = "double ";
       } else if (type == TEXT) {
    	   str = "String ";
       } else if (type == BOOLEAN) {
    	   str = "boolean ";
       } else if (type == CHAR) {
    	   str = "char ";
       } else if (type == VECTOR){
			str = "int[]";
		}else{
    	   str = "int ";
       }
       return str + " "+super.name+";";
	}
	
	

}
