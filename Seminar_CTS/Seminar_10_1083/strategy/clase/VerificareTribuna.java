package strategy.clase;

public class VerificareTribuna implements Strategy{

	@Override
	public void modVerificareSpectator(Spectator spectator) {
		System.out.println(spectator.getNume() + " este verificat pentru intrarea in tribuna.");
	}

}
