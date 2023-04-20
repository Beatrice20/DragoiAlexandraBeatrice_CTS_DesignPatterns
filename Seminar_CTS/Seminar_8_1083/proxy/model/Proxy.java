package proxy.model;

public class Proxy implements IRestaurant{

	private IRestaurant restaurant;
	
	public Proxy(IRestaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void rezervaMasa(int numarPersoane) {
		if(numarPersoane >= 4) {
			this.restaurant.rezervaMasa(numarPersoane);
		}
		else {
			System.out.println("Rezervarea nu s-a efectuat!");
		}
	}

}
