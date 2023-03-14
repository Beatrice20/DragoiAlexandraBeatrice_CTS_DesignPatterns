package singelton_registry_nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	private static Map<String,Firma> firmeInregistrate = new HashMap<>();
	
	public static synchronized Firma getFirma(String denumireFirma) {
		if(!firmeInregistrate.containsKey(denumireFirma)) {
			Firma firma = new Firma(denumireFirma, 0);
			firmeInregistrate.put(denumireFirma, firma);
			return firma;
		}
		return firmeInregistrate.get(denumireFirma);
	}
	
}
