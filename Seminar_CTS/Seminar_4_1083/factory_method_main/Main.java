package factory_method_main;

import java.util.ArrayList;
import java.util.List;

import factory_method.Factory;
import factory_method.FactoryAsistent;
import factory_method.FactoryMedic;
import factory_method.PersonalSpital;


public class Main {

	public static void main(String[] args) {
		Factory factoryMedic = new FactoryMedic();
		Factory factoryAsistent = new FactoryAsistent();
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		
		listaPersonal.add(factoryAsistent.creareObiect("Ionescu"));
		listaPersonal.add(factoryMedic.creareObiect("Gigel"));
		listaPersonal.add(factoryAsistent.creareObiect("Marcel"));
		listaPersonal.add(factoryAsistent.creareObiect("Calin"));
		listaPersonal.add(factoryMedic.creareObiect("Matei"));
		listaPersonal.add(factoryMedic.creareObiect("Cristian"));
		
		for(PersonalSpital p : listaPersonal) {
			p.descriere();
		}
	}
}

