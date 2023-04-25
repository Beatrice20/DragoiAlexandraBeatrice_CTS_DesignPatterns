package facade.model;

public class Autobuz {
	private String nrInmatriculare;

	public Autobuz(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
	
	public void deschideUsaFata()
	{
		System.out.println("Usa din fata a fost deschisa pentru autobuzul cu numarul " + this.nrInmatriculare);
	}
	
	public void deschideUsaMijloc()
	{
		System.out.println("Usa de la mijloc a fost deschisa pentru autobuzul cu numarul " + this.nrInmatriculare);
	}
	
	public void deschideUsaSpate()
	{
		System.out.println("Usa din spate a fost deschisa pentru autobuzul cu numarul " + this.nrInmatriculare);
	}
	
	public void ramaneLiberUsaFata()
	{
		System.out.println("Usa din fata poate fi deschisa de calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
	}
	
	public void ramaneLiberUsaMijloc()
	{
		System.out.println("Usa de la mijloc poate fi deschisa de calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
	}
	
	public void ramaneLiberUsaSpate()
	{
		System.out.println("Usa din spate poate fi deschisa de calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
	}
	
}
