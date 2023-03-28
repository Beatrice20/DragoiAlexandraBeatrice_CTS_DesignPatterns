package factory_method;

public class FactoryMedic implements Factory {

	@Override
	public PersonalSpital creareObiect(String nume) {
		return new Medic(nume);
	}

}
