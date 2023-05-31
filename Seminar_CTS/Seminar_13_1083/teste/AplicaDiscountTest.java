package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import categorii.Categorie1;
import categorii.Categorie2;
import clase.PachetTuristic;
import dubluri.FakePersoana;

public class AplicaDiscountTest {

	//@Tag("tag1")
	@Category(Categorie1.class)
	@Test
	void poatePrimiDiscount() {
		FakePersoana persoana = new FakePersoana();
		persoana.setGetVarstaValue(66);
			
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Roma", 1000.0);
		pachetTuristic.aplicaDiscountVarstnici(20);
		assertEquals(800.0, pachetTuristic.getPret());
	}
		
	//@Tag("tag2")
	@Category(Categorie2.class)
	@Test
	void nuPoatePrimiDiscount() {
		FakePersoana persoana = new FakePersoana();
		persoana.setGetVarstaValue(40);
			
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Paris", 1000.0);
		pachetTuristic.aplicaDiscountVarstnici(50);
		assertEquals(1000.0, pachetTuristic.getPret());
	}
}

