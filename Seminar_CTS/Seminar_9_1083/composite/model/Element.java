package composite.model;

public interface Element {
	public float calculareSumaAsigurare();
	public void adaugaGrup(Element generalGrup);
	public void stergeGrup(Element generalGrup);
	public Element getGrup(int pozitieGrup);
	public void afisareSumaAsigurare();
}
