package observer.main;

import observer.clase.Banca;
import observer.clase.Client;
import observer.clase.IClient;

public class Main {

	public static void main(String[] args) {
		Banca banca = new Banca("BCR");
		
		IClient client1 = new Client("Marcel");
		IClient client2 = new Client("Gigel");
		IClient client3 = new Client("George");
		
		banca.actualizeazaAplicatia();
		banca.adaugaObserver(client1);
		
		banca.adaugaTipCreditNou();
		
		banca.adaugaObserver(client2);
		banca.adaugaObserver(client3);
		banca.stergeObserver(client1);
		
		banca.actualizeazaAplicatia();
		
	}

}
