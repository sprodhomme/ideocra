package fr.ideo.cra.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import fr.ideo.cra.client.uibinders.layout.general.ICRootView;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class IdeoCra implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ICRootView vue = new ICRootView();
		RootPanel.get().add(vue);
		
//		String aujourdhui = new Date().toString();
//		aujourdhui.replaceAll("Thu", ICPageTempsPasses.getListeJoursSemaine().get("Thu"));
//		Window.alert(aujourdhui);
		
		/*
		
		
		
		Date today = new Date();
		
		String jour = ICPageTempsPasses.getListeJoursSemaine().get("Thu");
		Window.alert(jour);
		
		String jourTraduit = today.toString();
		jourTraduit.replace("Thu", jour);
		Window.alert(jourTraduit);

	    // prints Tue Dec 18 12:01:26 GMT-500 2007 in the default locale.
	    GWT.log(today.toString(), null);

	    // prints 12/18/07 in the default locale
	    GWT.log(DateTimeFormat.getShortDateFormat().format(today), null);

	    // prints December 18, 2007 in the default locale
	    GWT.log(DateTimeFormat.getLongDateFormat().format(today), null);

	    // prints 12:01 PM in the default locale
	    GWT.log(DateTimeFormat.getShortTimeFormat().format(today), null);

	    // prints 12:01:26 PM GMT-05:00 in the default locale
	    GWT.log(DateTimeFormat.getLongTimeFormat().format(today), null);

	    // prints Dec 18, 2007 12:01:26 PM in the default locale
	    GWT.log(DateTimeFormat.getMediumDateTimeFormat().format(today), null);
	    
	    // A custom date format
	    DateTimeFormat fmt = DateTimeFormat.getFormat("EEEE, MMMM dd, yyyy");
	    // prints Monday, December 17, 2007 in the default locale
	    GWT.log(fmt.format(today), null);
	    
	    */
	}
}
