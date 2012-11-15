package fr.ideo.cra.client.uibinders.layout.pages;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ICPageTempsPasses extends Composite {

	private static ICPageTempsPassesUiBinder uiBinder = GWT.create(ICPageTempsPassesUiBinder.class);
	
	private static Map<String, String> listeJoursSemaine = new HashMap<String, String>();

	interface ICPageTempsPassesUiBinder extends UiBinder<Widget, ICPageTempsPasses> {
	}

	public ICPageTempsPasses() {
		initWidget(uiBinder.createAndBindUi(this));
		initJoursSemaine();
	}

	private static void initJoursSemaine() {
		listeJoursSemaine.put("Mon", "Lundi");
		listeJoursSemaine.put("Tue", "Mardi");
		listeJoursSemaine.put("Wed", "Mercredi");
		listeJoursSemaine.put("Thu", "Jeudi");
		listeJoursSemaine.put("Fri", "Vendredi");
	}

	public static Map<String, String> getListeJoursSemaine() {
		if(listeJoursSemaine.size() < 5)
			initJoursSemaine();
		return listeJoursSemaine;
	}

}
