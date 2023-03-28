package prototype_main;

import prototype.Autobuz;

public class Main {
	public static void main(String[] args) {
		Autobuz autobuz1 = new Autobuz("PH01CTS", 20);
		Autobuz autobuz2 = new Autobuz("B999BIG", 40);
		
		Autobuz autobuz3 = (Autobuz)autobuz2.clone();
		Autobuz autobuz4 = (Autobuz)autobuz2.clone();
		
		autobuz3.setNrInmatriculare("CT02PKL");
		autobuz4.setNrInmatriculare("B100HHH");
		
		System.out.println(autobuz1);
		System.out.println(autobuz2);
		System.out.println(autobuz3);
		System.out.println(autobuz4);
	}
}
