package adapter.model.restaurant;

import adapter.model.bar.SoftBar;

public class AdapterRestaurantClase extends SoftBar implements ISoftRestaurant{

	public AdapterRestaurantClase(String denumire) {
		super(denumire);
	}

	@Override
	public void printeazaNota(double totalSuma) {
		super.printeazaNotaBauturi(totalSuma);
	}

}
