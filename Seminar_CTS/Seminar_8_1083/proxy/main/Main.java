package proxy.main;

import proxy.model.IRestaurant;
import proxy.model.Proxy;
import proxy.model.Restaurant;

public class Main {

	public static void main(String[] args) {
		//Daca cream obiect de tipul Restaurant nu este verificata conditia de minim 4 persoane pentru rezervare
		IRestaurant restaurant = new Restaurant("TemplePUB");
		restaurant.rezervaMasa(3);
		
		//Aici este verificata conditia
		IRestaurant proxy = new Proxy(restaurant);
		proxy.rezervaMasa(2);
		proxy.rezervaMasa(5);
	}

}
