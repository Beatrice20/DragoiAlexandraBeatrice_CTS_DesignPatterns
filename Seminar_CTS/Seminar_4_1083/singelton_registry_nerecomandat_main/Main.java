package singelton_registry_nerecomandat_main;

import singelton_registry_nerecomandat.Firma;
import singelton_registry_nerecomandat.Registru;

public class Main {

	public static void main(String[] args) {
		Firma firma1 = Registru.getFirma("Amicii S.R.L.");
		Firma firma2 = Registru.getFirma("Amicii S.R.L.");
		Firma firma3 = Registru.getFirma("Cisco S.R.L.");
		
		firma1.incheieContract(100);
		firma2.incheieContract(200);
		firma3.incheieContract(3000);
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
	}

}
