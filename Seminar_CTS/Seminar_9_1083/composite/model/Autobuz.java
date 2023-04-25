package composite.model;

public class Autobuz implements Element{

	private String producator;
	private int capacitateCilindrica;
	private int numarLocuri;
	
	public Autobuz(String producator, int capacitateCilindrica, int numarLocuri) {
		this.producator = producator;
		this.capacitateCilindrica = capacitateCilindrica;
		this.numarLocuri = numarLocuri;
	}

	@Override
	public float calculareSumaAsigurare() {
		float suma =  1.5f * this.capacitateCilindrica;
		return suma;
	}

	@Override
	public void adaugaGrup(Element generalGrup) {
		throw new IllegalArgumentException("Operatia aceasta nu este implementata");
	}

	@Override
	public void stergeGrup(Element generalGrup) {
		throw new IllegalArgumentException("Operatia aceasta nu este implementata");
	}

	@Override
	public Element getGrup(int pozitieGrup) {
		throw new IllegalArgumentException("Operatia aceasta nu este implementata");
	}

	@Override
	public void afisareSumaAsigurare() {
		System.out.println("Suma de asigurare pentru autobuzul produs de " + this.producator + " este: " + this.calculareSumaAsigurare());
	}
	
	
}
