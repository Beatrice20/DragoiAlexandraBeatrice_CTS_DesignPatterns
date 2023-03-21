package factory_method;

public class Brancardier implements PersonalSpital{

	private String nume;
	
	protected Brancardier(String nume) {
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Brancardierul cu numele " + this.nume);
	}
	
}
