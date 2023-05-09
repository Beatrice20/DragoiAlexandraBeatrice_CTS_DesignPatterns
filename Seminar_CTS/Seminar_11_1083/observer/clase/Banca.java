package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca{

	public List<IClient> observeri;
	public String nume;
	
	
	public Banca(String nume) {
		this.nume = nume;
		this.observeri = new ArrayList<>();
	}

	@Override
	public void adaugaObserver(IClient client) {
		this.observeri.add(client);
	}

	@Override
	public void stergeObserver(IClient client) {
		this.observeri.remove(client);
	}

	@Override
	public void notifica(String mesaj) {
		for(IClient client : observeri) {
			client.afiseazaMesaj(mesaj);
		}
	}
	
	public void adaugaTipCreditNou() {
		notifica(this.nume + ": Am adaugat un nou tip de credit, daca doriti sa il accesati.");
	}
	
	public void actualizeazaAplicatia() {
		notifica(this.nume + ": Aplicatia a fost actualizata.");
	}

}
