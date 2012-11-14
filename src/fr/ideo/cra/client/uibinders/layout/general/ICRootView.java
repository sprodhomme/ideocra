package fr.ideo.cra.client.uibinders.layout.general;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import fr.ideo.cra.client.uibinders.layout.pages.ICPageDemandeAbsenceConsultation;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageDemandeAbsenceDemande;

public class ICRootView extends Composite {

	private static ICRootViewUiBinder uiBinder = GWT.create(ICRootViewUiBinder.class);
	
	@UiField ICMenu menu;
	@UiField ICContenu contenu;

	interface ICRootViewUiBinder extends UiBinder<Widget, ICRootView> {
	}

	public ICRootView() {
		initWidget(uiBinder.createAndBindUi(this));
		initHandlers();
	}

	private void initHandlers() {
		menu.absence_consultation.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				contenu.contenu_contenu.clear();
				contenu.contenu_contenu.add(new ICPageDemandeAbsenceConsultation());
				//TODO 
			}
		});
		
		menu.absence_demande.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				//TODO Finish it
				contenu.contenu_contenu.clear();
				contenu.contenu_contenu.add(new ICPageDemandeAbsenceDemande());
				//TODO 
			}
		});
	}

}
