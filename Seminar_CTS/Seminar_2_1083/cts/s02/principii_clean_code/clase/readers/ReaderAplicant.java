package cts.s02.principii_clean_code.clase.readers;
import java.io.FileNotFoundException;
import java.util.List;

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
}
