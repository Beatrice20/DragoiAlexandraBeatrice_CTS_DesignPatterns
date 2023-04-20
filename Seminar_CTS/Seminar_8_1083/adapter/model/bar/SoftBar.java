package adapter.model.bar;

public class SoftBar implements ISoftBar{
	private String denumire;

	public SoftBar(String denumire) {
		this.denumire = denumire;
	}

	@Override
	public void printeazaNotaBauturi(double totalPlata) {
		System.out.println("Barul " + this.denumire + " a emis nota aferenta bauturilor consumate in valoare de " + totalPlata);
	}
	
}
