package state.main;

import state.clase.Bancomat;

public class Main {

	public static void main(String[] args) {
		Bancomat bancomat = new Bancomat(1000);
		
		bancomat.introducePin();
		bancomat.retrageCard();
		bancomat.introducePin();
		bancomat.retrageBani(200);
		bancomat.introduceCard();
		bancomat.retrageBani(500);
		bancomat.introducePin();
		bancomat.retrageBani(1000);
		bancomat.retrageCard();
	}

}
