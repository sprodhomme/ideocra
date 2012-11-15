package fr.ideo.cra.client.uibinders.layout.elements;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ICConsultationAbsence extends Composite {

	private static ICDemandeAbsenceUiBinder uiBinder = GWT
			.create(ICDemandeAbsenceUiBinder.class);

	interface ICDemandeAbsenceUiBinder extends
			UiBinder<Widget, ICConsultationAbsence> {
	}

	public ICConsultationAbsence() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	@UiHandler("absence_bouton_datededebut")
	void onAbsence_bouton_datededebutClick(ClickEvent event) {
	}
}
