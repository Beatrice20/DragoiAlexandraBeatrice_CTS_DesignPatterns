package factory_method;

public class FactoryBrancardier implements Factory {
	
	@Override
	public PersonalSpital creareObiect(String nume) {
		return new Brancardier(nume);
	}

}
