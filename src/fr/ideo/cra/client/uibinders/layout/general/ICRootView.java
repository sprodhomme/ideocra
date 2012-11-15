package fr.ideo.cra.client.uibinders.layout.general;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

import fr.ideo.cra.client.ressources.ICImageBundle;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageDemandeAbsenceConsultation;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageDemandeAbsenceDemande;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageTempsPasses;

public class ICRootView extends Composite {

	private static ICRootViewUiBinder uiBinder = GWT.create(ICRootViewUiBinder.class);

	public static ICImageBundle R = GWT.create(ICImageBundle.class);
	private Image loading = new Image(R.chargement());
	
	@UiField ICMenu menu;
	@UiField ICContenu contenu;

	interface ICRootViewUiBinder extends UiBinder<Widget, ICRootView> {
	}

	public ICRootView() {
		initWidget(uiBinder.createAndBindUi(this));
		contenu.contenu_options.add(loading);
		loading.setVisible(false);
		initHandlers();
	}

	private void initHandlers() {
		menu.absence_consultation.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				loading.setVisible(true);
//				clearEtLoading();
				Scheduler.get().scheduleEntry(new ScheduledCommand() {
					public void execute() {
						contenu.contenu_contenu.clear();
						contenu.contenu_contenu.add(new ICPageDemandeAbsenceConsultation());
						closeLoading();
					}
				});
			}
		});
		
		menu.absence_demande.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				clearEtLoading();
				contenu.contenu_contenu.add(new ICPageDemandeAbsenceDemande());
			}
		});
		
		menu.temps_passes.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				clearEtLoading();
				contenu.contenu_contenu.add(new ICPageTempsPasses());
			}
		});
		
		menu.page_soumission.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				clearEtLoading();
			}

		});
		
	}

	protected void clearEtLoading() {
		// TODO finish it
		loading.setVisible(true);
		Scheduler.get().scheduleFinally(new ScheduledCommand() {
			public void execute() {
				contenu.contenu_contenu.clear();
				loading.setVisible(false);
			}
		});
	}
	
	protected void closeLoading() {
		Scheduler.get().scheduleFinally(new ScheduledCommand() {
			public void execute() {
				loading.setVisible(false);
			}
		});
	}
}
