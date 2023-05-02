package flyweight.clase;

public class Spectator implements ISpectator{
	private int id;
	private float inaltime;
	private float latimeUmeri;
	
	public Spectator(int id, float inaltime, float latimeUmeri) {
		this.id = id;
		this.inaltime = inaltime;
		this.latimeUmeri = latimeUmeri;
	}

	@Override
	public String toString() {
		return "Spectator [id=" + id + ", inaltime=" + inaltime + ", latimeUmeri=" + latimeUmeri + "]";
	}

	@Override
	public void deseneazaSpectator(PozitieDesenare pozitieDesenare) {
		System.out.println(this.toString() + pozitieDesenare.toString());
	}
	
}
