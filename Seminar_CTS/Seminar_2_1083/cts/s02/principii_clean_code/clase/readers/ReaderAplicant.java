package cts.s02.principii_clean_code.clase.readers;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	
	public String fileName="";
	public ReaderAplicant(String file){
		this.fileName=file;
	}
	
	public String getFileName() {
		return fileName;
	}

	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	public void citesteAplicant(Scanner input, Aplicant aplicant) {
		aplicant.setNume(input.next());
		aplicant.setPrenume(input.next());
		aplicant.setVarsta(input.nextInt()); 
		aplicant.setPunctaj(input.nextInt());
		aplicant.setNr_proiecte(input.nextInt());
		String[] denumiriProiecte = new String[aplicant.getNr_proiecte()];
		for (int i = 0; i < aplicant.getNr_proiecte(); i++)
			denumiriProiecte[i] = input.next();
		aplicant.setDenumireProiect(denumiriProiecte);
	}
}
