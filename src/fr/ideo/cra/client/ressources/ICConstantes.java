/**
 * 
 */
package fr.ideo.cra.client.ressources;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serge Prodhomme
 *
 */
public class ICConstantes {

	private static final List<String> typesAbsences = new ArrayList<String>();
	
	private static ICConstantes instance = null;
	
	private ICConstantes()	{
		// Recuperation des types d'absence
		typesAbsences.add("CP - Congés payés");
		typesAbsences.add("RTT - Réduction du Temps de Travail");
		typesAbsences.add("CM - Congé maternité");
		typesAbsences.add("CPA - Congé paternité");
	}
	
	public static ICConstantes get() {
		if(null == instance)
			instance = new ICConstantes();
		return instance;
	}

	public static List<String> getTypesAbsences() {
		return typesAbsences;
	}
	
	
}
