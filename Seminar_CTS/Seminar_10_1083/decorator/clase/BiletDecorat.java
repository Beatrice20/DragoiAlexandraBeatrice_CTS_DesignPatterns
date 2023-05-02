package decorator.clase;

public class BiletDecorat extends Decorator{
	public BiletDecorat(IBilet bilet){
        super(bilet);
    }

    @Override
    public void printeazaMesajSustinere() {
        System.out.println("Sustinem echipa " + super.getBilet().getNumeEchipa1());
    }
}
