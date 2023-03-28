package cts.s02.principii_clean_code.clase;

import java.util.Scanner;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;
	protected static Integer pragAcceptare = 80;
	
	public Aplicant() {
		super();
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public int getPunctaj() {
		return punctaj;
	}
	
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public int getNr_proiecte() {
		return nrProiecte;
	}
	
	public void setNr_proiecte(int nr_proiecte) {
		this.nrProiecte = nr_proiecte;
	}
	
	public void setDenumireProiect(String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
	}

	public void setPragAcceptare(Integer pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}

	public void afisareStatus(){
		System.out.println("Aplicantul " + this.nume + " " + this.prenume + 
				(this.punctaj > Aplicant.pragAcceptare ? " " : " nu ") + " a fost acceptat.");
	}

	public abstract void afisareFinantare();

}
