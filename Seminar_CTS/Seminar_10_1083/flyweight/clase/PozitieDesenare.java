package flyweight.clase;

public class PozitieDesenare {

	private int rand;
	private int coloana;
	private String culoareTricou;
	
	public PozitieDesenare(int rand, int coloana, String culoareTricou) {
		this.rand = rand;
		this.coloana = coloana;
		this.culoareTricou = culoareTricou;
	}

	@Override
	public String toString() {
		return "PozitieDesenare [rand=" + rand + ", coloana=" + coloana + ", culoareTricou=" + culoareTricou + "]";
	}
}
