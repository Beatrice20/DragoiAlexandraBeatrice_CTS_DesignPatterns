package state1.clase;

public class Autobuz {
	private IBusState state;
	private String nrImatriculare;
	
	public Autobuz(String nrImatriculare) {
		this.state = new StateLaCapatDeLinie();
		this.nrImatriculare = nrImatriculare;
	}
	
	public IBusState getState() {
		return state;
	}
	
	public String getNrImatriculare() {
		return nrImatriculare;
	}
	
	protected void setState(IBusState state) {
		this.state = state;
	}
	
	public void pleacaInCursa() {
		IBusState route = new StateInCursa();
		route.changeState(this);
	}
	
	public void esteInService() {
		IBusState service = new StateLaReparat();
		service.changeState(this);
	}
	
	public void ajungeLaCapatDeLinie() {
		IBusState capatLinie = new StateLaCapatDeLinie();
		capatLinie.changeState(this);
	}
}
