package adapter.model.restaurant;

import adapter.model.bar.ISoftBar;

public class AdapterRestaurantObiecte implements ISoftRestaurant{

	private ISoftBar softBar;
	
	public AdapterRestaurantObiecte(ISoftBar softBar) {
		this.softBar = softBar;
	}

	@Override
	public void printeazaNota(double totalSuma) {
		this.softBar.printeazaNotaBauturi(totalSuma);
	}

}
