package fr.ideo.cra.client.uibinders.layout.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import fr.ideo.cra.client.uibinders.layout.elements.ICDemandeAbsence;

public class ICPageDemandeAbsenceDemande extends Composite {

	private static ICPageDemandeAbsenceDemandeUiBinder uiBinder = GWT.create(ICPageDemandeAbsenceDemandeUiBinder.class);
	@UiField Button absence_demande_boutonajouter;
	@UiField VerticalPanel absence_demande_contenu;

	interface ICPageDemandeAbsenceDemandeUiBinder extends UiBinder<Widget, ICPageDemandeAbsenceDemande> {
	}

	public ICPageDemandeAbsenceDemande() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	@UiHandler("absence_demande_boutonajouter")
	void onButtonClick(ClickEvent event) {
		//TODO Add the corresponding list
		ICDemandeAbsence demande = new ICDemandeAbsence();
		absence_demande_contenu.add(demande);
	}

}
