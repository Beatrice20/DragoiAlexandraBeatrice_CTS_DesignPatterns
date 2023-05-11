package state1.clase;

public class StateInCursa implements IBusState{
	
	
	@Override
	public void changeState(Autobuz autobuz) {
		if(autobuz.getState() instanceof StateLaCapatDeLinie) {
			System.out.println("Autobuzul " + autobuz.getNrImatriculare() + " a pleacat in cursa");
			autobuz.setState(this);
		}else {
			System.out.println("Autobuzul " +autobuz.getNrImatriculare() + " nu poate pleca intr-o noua cursa");
		}
	}

}
