package strategy1.main;

import strategy1.clase.Calator;
import strategy1.clase.PlataCardBancar;
import strategy1.clase.PlataCardCalatorii;
import strategy1.clase.PlataPrinSMS;

public class Main {

	public static void main(String[] args) {
		Calator calator = new Calator("Ana");
		calator.platesteBilet(5);
		
		calator.setMetodaPlata(new PlataCardBancar());
		calator.platesteBilet(10);
		
		calator.setMetodaPlata(new PlataPrinSMS());
		calator.platesteBilet(5);
		
		calator.setMetodaPlata(new PlataCardCalatorii());
	}

}
