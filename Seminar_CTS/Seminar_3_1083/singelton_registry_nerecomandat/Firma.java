package singelton_registry_nerecomandat;

public class Firma {
	private String nume;
	private int cifraAfaceri;
	
	protected Firma(String nume, int cifraAfaceri) {
		this.nume = nume;
		this.cifraAfaceri = cifraAfaceri;
	}
	
	public void incheieContract(int sumaContract) {
		this.cifraAfaceri += sumaContract;
	}

	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", cifraAfaceri=" + cifraAfaceri + "]";
	}
	
}
