package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.readers.ReaderAngajat;
import cts.s02.principii_clean_code.clase.readers.ReaderAplicant;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			ReaderAplicant readerAplicanti = new ReaderAngajat("angajati.txt");
			listaAngajati = readerAplicanti.readAplicanti();
			Angajat.setSumaFinantata(20);
			for(Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatus();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
