package factory_method;

public class FactoryAsistent implements Factory{

	@Override
	public PersonalSpital creareObiect(String nume) {
		return new Asistent(nume);
	}
}
