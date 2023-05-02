package strategy.main;

import strategy.clase.Jandarm;
import strategy.clase.Spectator;
import strategy.clase.VerificareTribuna;
import strategy.clase.VerificareVIP;

public class Main {

	public static void main(String[] args) {
		Jandarm jandarm  = new Jandarm("Ion");
		
		Spectator s1 = new Spectator("Vasile");
		Spectator s2 = new Spectator("George");
		Spectator s3 = new Spectator("Gheorghe");
		
		jandarm.verificaSpectator(s1);
		jandarm.setModVerificare(new VerificareVIP());
		
		jandarm.verificaSpectator(s2);
		
		jandarm.setModVerificare(new VerificareTribuna());
		
		jandarm.verificaSpectator(s3);
	}

}
