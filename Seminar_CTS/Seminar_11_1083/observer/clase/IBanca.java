package observer.clase;

public interface IBanca {
	public void adaugaObserver(IClient client);
	public void stergeObserver(IClient client);
	public void notifica(String mesaj);
}
