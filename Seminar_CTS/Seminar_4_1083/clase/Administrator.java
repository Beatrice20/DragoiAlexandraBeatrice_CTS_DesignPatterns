package clase;

public class Administrator {
	private String nume;
	private int varsta;
	
	//eager initialization
	private static Administrator instanta = new Administrator("Gigel",30);
	
	private Administrator(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
	
	public static Administrator getInstance() {
		return instanta;
	}

	@Override
	public String toString() {
		return "Administrator [nume=" + nume + ", varsta=" + varsta + "]";
	}
	
}
