package builder_model;

public class BuilderPacient implements Builder{

	Pacient pacient;
	
	public BuilderPacient(String nume) {
		this.pacient = new Pacient(nume,false, false, false, false);
	}
	
	@Override
	public BuilderPacient setNume(String nume) {
		throw new IllegalArgumentException("Not Aplicable!");
	}

	@Override
	public BuilderPacient setPatRabatabil(boolean patRabatabil) {
		pacient.setPatRabatabil(patRabatabil);
		return this;
	}

	@Override
	public BuilderPacient setMicDejunInclus(boolean micDejunInclus) {
		pacient.setMicDejunInclus(micDejunInclus);
		return this;
	}

	@Override
	public BuilderPacient setPapuciDeCamera(boolean papuciDeCamera) {
		pacient.setPapuciDeCamera(papuciDeCamera);
		return this;
	}

	@Override
	public BuilderPacient setHalatPentruInterior(boolean halatPentruInterior) {
		pacient.setHalatPentruInterior(halatPentruInterior);
		return this;
	}
	
	@Override
	public Pacient build() {
		return pacient;
	}

	

}
