package fr.ideo.cra.client.uibinders.layout.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import fr.ideo.cra.client.uibinders.layout.general.ICRootView;

public class ICPageDeconnexion extends Composite {

	private static ICPageDeconnexionUiBinder uiBinder = GWT
			.create(ICPageDeconnexionUiBinder.class);

	interface ICPageDeconnexionUiBinder extends
			UiBinder<Widget, ICPageDeconnexion> {
	}

	public ICPageDeconnexion() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("deconnexion_boutonoui")
	void onDeconnexion_boutonouiClick(ClickEvent event) {
		ICRootView.showLoading();
		// TODO deconnecter
	}
	@UiHandler("deconnexion_boutonnon")
	void onDeconnexion_boutonnonClick(ClickEvent event) {
		ICRootView.loading.setVisible(false);
		// TODO revenir a l'accueil
	}
}
