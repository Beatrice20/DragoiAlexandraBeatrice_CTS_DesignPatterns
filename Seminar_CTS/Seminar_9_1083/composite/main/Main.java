package composite.main;

import composite.model.Autobuz;
import composite.model.Element;
import composite.model.Grup;

public class Main {

	public static void main(String[] args) {
		Element autobuz1 = new Autobuz("Mercedes", 3000, 7);
		Element autobuz2 = new Autobuz("Mercedes", 3000, 9);
		Element grupAutobuzeMici = new Grup("Autobuze mici");
		grupAutobuzeMici.adaugaGrup(autobuz1);
		grupAutobuzeMici.adaugaGrup(autobuz2);
		grupAutobuzeMici.afisareSumaAsigurare();
		
		Element autobuz3 = new Autobuz("Mercedes", 5000, 15);
		Element autobuz4 = new Autobuz("Mercedes", 4000, 20);
		Element grupAutobuzeMijlocii = new Grup("Autobuze mijlocii");
		grupAutobuzeMijlocii.adaugaGrup(autobuz3);
		grupAutobuzeMijlocii.adaugaGrup(autobuz4);
		grupAutobuzeMijlocii.afisareSumaAsigurare();
		
		//Cream flota ce contine cele doua grupuri de autobuze
		Element flota = new Grup("Flota");
		flota.adaugaGrup(grupAutobuzeMici);
		flota.adaugaGrup(grupAutobuzeMijlocii);
		//flota.afisareSumaAsigurare();
		
		//Compsite - imi permite sa am si elemente de tipul grup si elemente de tip Autobuz (sunt pe acelasi nivel)
		Element autobuzVIP = new Autobuz("Mercedes", 9000, 30);
		flota.adaugaGrup(autobuzVIP);
		flota.afisareSumaAsigurare();
	}

}
