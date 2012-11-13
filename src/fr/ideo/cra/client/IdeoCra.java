package fr.ideo.cra.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import fr.ideo.cra.client.uibinders.ICMenu;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class IdeoCra implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		ICMenu menu = new ICMenu();
		RootPanel.get().add(menu);
	
	}
}
