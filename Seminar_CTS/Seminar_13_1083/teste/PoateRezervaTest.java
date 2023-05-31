package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import categorii.Categorie1;
import categorii.Categorie2;
import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.StubPersoana;
import dubluri.StubPersoanaMinora;

public class PoateRezervaTest {

	@Category(Categorie2.class)
	@Test
	void testPoateRezervaPachet() {
		IPersoana persoana = new StubPersoana();
		PachetTuristic pachet = new PachetTuristic(persoana, "Maldive", 5000.0);
		assertTrue(pachet.poateRezerva());
	}
	
	@Category(Categorie1.class)
	@Test
	void testNuPoateRezervaPachet() {
		IPersoana persoana = new StubPersoanaMinora();
		PachetTuristic pachet = new PachetTuristic(persoana, "Dubai", 1800.0);
		assertFalse(pachet.poateRezerva());
	}

}
