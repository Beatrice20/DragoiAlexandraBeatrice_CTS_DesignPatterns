package flyweight.main;

import flyweight.clase.FabricaSpectatori;
import flyweight.clase.PozitieDesenare;

public class Main {

	public static void main(String[] args) {
		FabricaSpectatori fabrica = new FabricaSpectatori();
		PozitieDesenare pozitie1 = new PozitieDesenare(20,10,"Rosu");
		PozitieDesenare pozitie2 = new PozitieDesenare(10,30,"Verde");
		PozitieDesenare pozitie3 = new PozitieDesenare(20,12,"Albastru");
		
		fabrica.getSpectator(1, 20, 10).deseneazaSpectator(pozitie3);
		fabrica.getSpectator(2, (float)13.5, 16).deseneazaSpectator(pozitie1);
		fabrica.getSpectator(1, 20, 10).deseneazaSpectator(pozitie2);
	}

}
