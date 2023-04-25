package facade.main;

import facade.model.Autobuz;
import facade.model.AutobuzSimplificat;

public class Main {

	public static void main(String[] args) {
//		Autobuz autobuz = new Autobuz("B 165 ABC");
//		
//		autobuz.deschideUsaFata();
//		autobuz.deschideUsaMijloc();
//		autobuz.deschideUsaSpate();
		
		AutobuzSimplificat autobuzSimplificat = new AutobuzSimplificat("B 165 ABC");
		autobuzSimplificat.ramaneLiber();
		autobuzSimplificat.deschideUsa();
		
	}

}
