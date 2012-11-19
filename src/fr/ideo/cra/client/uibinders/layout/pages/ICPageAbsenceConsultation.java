package fr.ideo.cra.client.uibinders.layout.pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import fr.ideo.cra.client.classes.DemandeAbsence;
import fr.ideo.cra.client.uibinders.layout.elements.ICConsultationAbsence;

public class ICPageAbsenceConsultation extends Composite {

	private static ICPageAbsenceConsultationUiBinder uiBinder = GWT.create(ICPageAbsenceConsultationUiBinder.class);
	@UiField VerticalPanel absence_consultation_contenu;

	interface ICPageAbsenceConsultationUiBinder extends UiBinder<Widget, ICPageAbsenceConsultation> {
	}

	public ICPageAbsenceConsultation() {
		initWidget(uiBinder.createAndBindUi(this));
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			public void execute() {
				//TODO DEBUG - a venir : JPA
				DemandeAbsence d1 = new DemandeAbsence(0, new Date(), new Date(), 0, 1, "d1");
				DemandeAbsence d2 = new DemandeAbsence(0, new Date(), new Date(), 1, 1, "d2");
				DemandeAbsence d3 = new DemandeAbsence(0, new Date(), new Date(), 1, 0, "d3");
				List<DemandeAbsence> demandes = new ArrayList<DemandeAbsence>();
				demandes.add(d1);
				demandes.add(d2);
				demandes.add(d3);
				
				initData(demandes);
			}
		});
			
	}
	
	public void initData(List<DemandeAbsence> demandes) {
		for (final DemandeAbsence demande : demandes) {
			Scheduler.get().scheduleDeferred(new ScheduledCommand() {
				public void execute() {
					ICConsultationAbsence uidemande = new ICConsultationAbsence();
					uidemande.setDemande(demande);
					absence_consultation_contenu.add(uidemande);
				}
			});
		}
	}

}
