package state1.clase;

public class StateLaCapatDeLinie implements IBusState{

	@Override
	public void changeState(Autobuz autobuz) {
		if(autobuz.getState() instanceof StateInCursa || autobuz.getState() instanceof StateLaReparat) {
			System.out.println("Autobuzul " + autobuz.getNrImatriculare() + " a ajuns la capat de linie");
			autobuz.setState(this);
		}else {
			System.out.println("Autobuzul " +autobuz.getNrImatriculare() + " nu poate ajunge la capat de linie");
		}
	}

}
