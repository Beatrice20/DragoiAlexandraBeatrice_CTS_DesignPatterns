package state.clase;

public class Bancomat {
	private IStare stare;
	private Integer baniRamasi;
	
	public Bancomat(Integer baniRamasi) {
		this.baniRamasi = baniRamasi;
		stare = (IStare) new StareNuAreCard();
	}

	public IStare getStare() {
		return stare;
	}

	protected void setStare(IStare stare) {
		this.stare = stare;
	}
	
	public void introduceCard() {
		IStare stare = new StareAreCard();
		stare.modificaStare(this);
	}
	
	public void introducePin() {
		IStare stare = new StareArePinIntrodus();
		stare.modificaStare(this);
	}
	
	public void retrageBani(Integer suma) {
		if(stare instanceof StareArePinIntrodus) {
			if(baniRamasi >= suma) {
				System.out.println("A fost retrasa suma de " + suma);
				baniRamasi = baniRamasi - suma;
				if(baniRamasi == 0) {
					IStare stare = new StareNuAreBani();
					stare.modificaStare(this);
				}
			}
		}
	}
	
	public void retrageCard() {
		IStare stare = new StareNuAreCard();
		stare.modificaStare(this);
	}
	
	
}
