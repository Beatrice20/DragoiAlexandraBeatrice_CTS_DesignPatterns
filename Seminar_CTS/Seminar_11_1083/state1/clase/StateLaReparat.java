package state1.clase;

public class StateLaReparat implements IBusState{

	@Override
	public void changeState(Autobuz autobuz) {
		if(autobuz.getState() instanceof StateLaCapatDeLinie) {
			System.out.println("Autobuzul " + autobuz.getNrImatriculare() + " este acum in service");
			autobuz.setState(this);
		}else {
			System.out.println("Auotbuzul " + autobuz.getNrImatriculare() + " nu poate intra in service");
		}
	}

}
