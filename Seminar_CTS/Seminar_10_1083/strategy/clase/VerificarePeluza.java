package strategy.clase;

public class VerificarePeluza implements Strategy{

	@Override
	public void modVerificareSpectator(Spectator spectator) {
		System.out.println(spectator.getNume() + " este verificat pentru intrarea in cadrul peluzei.");
	}

}
