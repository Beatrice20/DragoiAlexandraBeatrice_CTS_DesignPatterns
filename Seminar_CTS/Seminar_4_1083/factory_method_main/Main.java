package factory_method_main;

import java.util.ArrayList;
import java.util.List;

import factory_method.Factory;
import factory_method.FactoryAsistent;
import factory_method.FactoryMedic;
import factory_method.PersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory factoryMedici = new FactoryMedic();
		Factory factoryAsistenti = new FactoryAsistent();
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		
		listaPersonal.add(factoryAsistenti.creareObiect("Ionescu"));
		listaPersonal.add(factoryMedici.creareObiect("Gigel"));
		listaPersonal.add(factoryAsistenti.creareObiect("Marcel"));
		listaPersonal.add(factoryAsistenti.creareObiect("Calin"));
		listaPersonal.add(factoryMedici.creareObiect("Matei"));
		listaPersonal.add(factoryMedici.creareObiect("Cristian"));
		
		for(PersonalSpital p : listaPersonal) {
			p.descriere();
		}
	}
	
}