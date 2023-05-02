package decorator.main;

import decorator.clase.Bilet;
import decorator.clase.BiletDecorat;
import decorator.clase.Decorator;
import decorator.clase.IBilet;

public class Main {

	public static void main(String[] args) {
		IBilet bilet1 = new Bilet("Andrei", "Romania", "Spania");
        IBilet bilet2 = new Bilet("Andrei", "Romania", "Italia");
        IBilet bilet3 = new Bilet("Andrei", "Germania", "Italia");
        bilet1.printeazaBilet();
        bilet2.printeazaBilet();
        bilet3.printeazaBilet();

        Decorator decoratorBilet = new BiletDecorat(bilet1);
        Decorator decoratorBilet1 = new BiletDecorat(bilet2);
        decoratorBilet.printeazaBilet();
        decoratorBilet1.printeazaBilet();

	}

}
