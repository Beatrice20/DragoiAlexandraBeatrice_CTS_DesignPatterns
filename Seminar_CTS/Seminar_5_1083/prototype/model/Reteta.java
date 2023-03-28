package prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype{
	private String numeReteta;
	private Map<String, Float> solutii;
	private Float gramajMedicament;
	
	public Reteta(String nume, Map<String, Float> solutii, Float gramajMedicament) {
		this.numeReteta = nume;
		this.gramajMedicament = gramajMedicament;
		float suma = 0;
		for  (Float valoare : solutii.values()){
			suma = suma + valoare;
		}
		if (this.gramajMedicament > suma - 0.1 && this.gramajMedicament < suma+0.1) {
			this.solutii = solutii;
		}
		else {
			throw new IllegalArgumentException("Gramaj gresit");
		}
	}
	
	private Reteta() {
		numeReteta = null;
		gramajMedicament = null;
		solutii = null;
	}

	@Override
	public Prototype clonare() {
		Reteta reteta = new Reteta();
		reteta.numeReteta = this.numeReteta;
		reteta.gramajMedicament = this.gramajMedicament;
		reteta.solutii = new HashMap<String, Float>();
		for(String val : this.solutii.keySet()) {
			reteta.solutii.put(val, this.solutii.get(val));
		}
		return reteta;
	}

	@Override
	public String toString() {
		return "Reteta [numeReteta=" + numeReteta + ", solutii=" + solutii + ", gramajMedicament=" + gramajMedicament
				+ "]";
	}
	
}
