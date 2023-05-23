package cts.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import clase.ExceptieCnpInexistent;
import clase.ExceptieVarsta;
import clase.IPersoana;
import clase.Persoana;

class PersoanaTest {

	@Test
	public void testGetVarstaRight() {
		IPersoana persoana = new Persoana("Alin", "5010512412887");
		assertEquals(22, persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryNouNascut() {
		IPersoana persoana = new Persoana("Mircea", "5230523412887");
		assertEquals(0, persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAn2000() {
		IPersoana persoana = new Persoana("Ion", "6000101412887");
		assertEquals(23, persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAn1999() {
		IPersoana persoana = new Persoana("Sergiu", "1991231412887");
		assertEquals(23, persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaError() {
		IPersoana persoana = new Persoana("Marius", "6230724412887");
		assertThrows(ExceptieVarsta.class, () -> persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaPerformance() {
		IPersoana persoana = new Persoana("Mihai", "5010423412887");
		assertTimeout(Duration.ofMillis(100), ()-> persoana.getVarsta());
	}
	
	@Test
	public void testConstructorPersoanaConformance() {
		Persoana persoana = new Persoana("Ana", "5010423412887");
		assertEquals(13, persoana.CNP.length());
	}
	
	@Test
	public void testGetVarstaOrder() {
		IPersoana persoana1 = new Persoana("Maria", "5010423412887");
		IPersoana persoana2 = new Persoana("Ionut", "5020522412887");
		assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
	}
	
	@Test
	public void testGetVarstaNoCNPExistence() {
		IPersoana persoana = new Persoana(null, null);
		assertThrows(ExceptieCnpInexistent.class, () -> persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaCardinality() {
		IPersoana persoana = new Persoana("Maria", "5220523412887");
		assertEquals(1, persoana.getVarsta());
	}
}
