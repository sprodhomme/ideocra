package fr.ideo.cra.client.uibinders.layout.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import fr.ideo.cra.client.uibinders.layout.elements.ICDemandeAbsence;

public class ICPageDemandeAbsenceDemande extends Composite {

	private static ICPageDemandeAbsenceDemandeUiBinder uiBinder = GWT.create(ICPageDemandeAbsenceDemandeUiBinder.class);
	@UiField Button absence_demande_boutonajouter;
	@UiField VerticalPanel absence_demande_contenu;
	@UiField ScrollPanel absence_demande_scrollpanel;

	interface ICPageDemandeAbsenceDemandeUiBinder extends UiBinder<Widget, ICPageDemandeAbsenceDemande> {
	}

	public ICPageDemandeAbsenceDemande() {
		initWidget(uiBinder.createAndBindUi(this));
		String height = (Window.getClientHeight() - 250) + "px";
		absence_demande_scrollpanel.setHeight(height);
	}

	@UiHandler("absence_demande_boutonajouter")
	void onButtonClick(ClickEvent event) {
		ICDemandeAbsence demande = new ICDemandeAbsence();
		absence_demande_contenu.add(demande);
	}

}
