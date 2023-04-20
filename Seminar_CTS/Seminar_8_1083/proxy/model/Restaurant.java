package proxy.model;

public class Restaurant implements IRestaurant{
	private String denumireRestaurant;

	public Restaurant(String denumireRestaurant) {
		this.denumireRestaurant = denumireRestaurant;
	}

	@Override
	public void rezervaMasa(int numarPersoane) {
		System.out.println("Masa a fost rezervata pentru " + numarPersoane + " persoane la restaurantul " + this.denumireRestaurant);
	}
	
}
