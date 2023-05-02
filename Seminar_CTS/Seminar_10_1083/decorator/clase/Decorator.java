package decorator.clase;

public abstract class Decorator implements IBilet{
	 private IBilet bilet;

	 public Decorator(IBilet bilet) {
	     this.bilet = bilet;
	 }

	 public IBilet getBilet() {
	    return bilet;
	 }

	 public String getNumeEchipa1(){
	    return bilet.getNumeEchipa1();
	 }


	 public abstract void printeazaMesajSustinere();

	 @Override
	 public void printeazaBilet() {
	    bilet.printeazaBilet();
	    printeazaMesajSustinere();
	  }
}
