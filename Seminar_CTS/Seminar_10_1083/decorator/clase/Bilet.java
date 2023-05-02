package decorator.clase;

public class Bilet implements IBilet{
	private String numeCumparator;
    private String numeEchipa1;
    private String numeEchipa2;

    public Bilet(String numeCumparator, String numeEchipa1, String numeEchipa2) {
        this.numeCumparator = numeCumparator;
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
    }

    public String getNumeEchipa1() {
        return numeEchipa1;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeCumparator='" + numeCumparator + '\'' +
                ", numeEchipa1='" + numeEchipa1 + '\'' +
                ", numeEchipa2='" + numeEchipa2 + '\'' +
                '}';
    }

    @Override
    public void printeazaBilet() {
        System.out.println(this.toString());
    }
}
