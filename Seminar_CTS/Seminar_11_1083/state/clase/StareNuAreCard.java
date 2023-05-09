package state.clase;

public class StareNuAreCard implements IStare{

	@Override
	public void modificaStare(Bancomat bancomat) {
		if(bancomat.getStare() instanceof StareAreCard || bancomat.getStare() instanceof StareArePinIntrodus) {
			bancomat.setStare(this);
			System.out.println("A fost scos cardul din bancomat.");
		}else {
			System.out.println("Bancomatul nu are niciun card introdus.");
		}
	}

}
