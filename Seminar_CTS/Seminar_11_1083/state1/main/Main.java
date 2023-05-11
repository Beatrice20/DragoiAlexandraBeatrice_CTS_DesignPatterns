package state1.main;

import state1.clase.Autobuz;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("VL21BUN");
		
		autobuz.esteInService();
		autobuz.ajungeLaCapatDeLinie();
		autobuz.ajungeLaCapatDeLinie();
		autobuz.pleacaInCursa();
		autobuz.esteInService();
		autobuz.ajungeLaCapatDeLinie();
	}

}
