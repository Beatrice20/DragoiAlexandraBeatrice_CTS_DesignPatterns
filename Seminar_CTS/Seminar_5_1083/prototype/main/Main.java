package prototype.main;

import java.util.HashMap;
import java.util.Map;

import prototype.model.Prototype;
import prototype.model.Reteta;

public class Main {

	public static void main(String[] args) {
		Map<String, Float> solutii = new HashMap<String, Float>();
		solutii.put("solutia 1", (float) 40);
		solutii.put("solutia 2", (float) 60);
		solutii.put("solutia 3", (float) 100);
		Reteta reteta1 = new Reteta("Reteta1", solutii, (float)200);
		
		Prototype retetaLaborator = reteta1.clonare();
		Prototype retetaPacient = reteta1.clonare();
		
		System.out.println(retetaLaborator);
		System.out.println(retetaPacient);
	}

}
