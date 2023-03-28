package factory_method;

public class Asistent implements PersonalSpital{

	public String nume;
	
	protected Asistent(String nume) {
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Asistentul cu numele " + this.nume);
	}
}
