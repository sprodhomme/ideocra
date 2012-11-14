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
	
	}
}
