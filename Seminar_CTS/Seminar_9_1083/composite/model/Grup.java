package composite.model;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element{

	private String numeGrup;
	private List<Element> elemente;
	
	public Grup(String numeGrup) {
		this.numeGrup = numeGrup;
		this.elemente = new ArrayList<>();
	}

	@Override
	public float calculareSumaAsigurare() {
		float suma = 0;
		for(Element g : elemente) {
			suma = suma + g.calculareSumaAsigurare();
		}
		return suma;
	}

	@Override
	public void adaugaGrup(Element generalGrup) {
		this.elemente.add(generalGrup);
	}

	@Override
	public void stergeGrup(Element generalGrup) {
		this.elemente.remove(generalGrup);
	}

	@Override
	public Element getGrup(int pozitieGrup) {
		return this.elemente.get(pozitieGrup);
	}

	@Override
	public void afisareSumaAsigurare() {
		System.out.println("Suma pentru asigurare este: " + this.calculareSumaAsigurare());
	}
	
}
