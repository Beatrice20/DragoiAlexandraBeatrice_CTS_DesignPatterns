package simple_factory;

public class Factory {
	public PersonalSpital createObject(TipPersonalSpital tip, String nume) {
		switch(tip) {
		case MEDIC:
			return new Medic(nume);
		case ASISTENT:
			return new Asistent(nume);
		case BRANCARDIER:
			return new Brancardier(nume);
		default:
			return null;
		}
	}
	
	public PersonalSpital createObject(TipPersonalSpital tip, String nume, int nrPacienti) {
		switch(tip) {
		case ANESTEZIST:
			return new Anestezist(nume, nrPacienti);
		default:
			return this.createObject(tip, nume);
		}
	}
}
