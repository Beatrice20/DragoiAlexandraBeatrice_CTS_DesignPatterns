package adapter.model.restaurant;

public class Restaurant implements ISoftRestaurant{
	private String numeBucatar;
	
	public Restaurant(String numeBucatar) {
		this.numeBucatar = numeBucatar;
	}

	@Override
	public void printeazaNota(double totalSuma) {
		System.out.println("Bucatarul " + this.numeBucatar);
        System.out.println("Nota dumneavoastra este in valoare de " +  totalSuma);
	}

}
