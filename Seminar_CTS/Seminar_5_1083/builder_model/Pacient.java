package builder_model;

public class Pacient {
	private String nume;
	private boolean patRabatabil;
	private boolean micDejunInclus;
	private boolean papuciDeCamera;
	private boolean halatPentruInterior;
	
	protected Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera,
			boolean halatPentruInterior) {
		this.nume = nume;
		this.patRabatabil = patRabatabil;
		this.micDejunInclus = micDejunInclus;
		this.papuciDeCamera = papuciDeCamera;
		this.halatPentruInterior = halatPentruInterior;
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	protected void setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}

	protected void setMicDejunInclus(boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
	}

	protected void setPapuciDeCamera(boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}

	protected void setHalatPentruInterior(boolean halatPentruInterior) {
		this.halatPentruInterior = halatPentruInterior;
	}

	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus
				+ ", papuciDeCamera=" + papuciDeCamera + ", halatPentruInterior=" + halatPentruInterior + "]";
	}
	
	
}
