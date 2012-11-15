package fr.ideo.cra.client.uibinders.layout.general;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

import fr.ideo.cra.client.ressources.ICImageBundle;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageDemandeAbsenceConsultation;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageDemandeAbsenceDemande;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageSoumission;
import fr.ideo.cra.client.uibinders.layout.pages.ICPageTempsPasses;

public class ICRootView extends Composite {

	private static ICRootViewUiBinder uiBinder = GWT.create(ICRootViewUiBinder.class);

//	public static ICImageBundle R = GWT.create(ICImageBundle.class);
//	public static final Image loading = new Image(R.chargement());
	
	public static final Image loading = new Image("http://www.ideotechnologies.com/sites/www.ideotechnologies.com/files/ideoneov_logo.jpg");
	
	@UiField ICMenu menu;
	static @UiField ICContenu contenu;

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
				showLoading();
				Scheduler.get().scheduleEntry(new ScheduledCommand() {
					public void execute() {
						contenu.contenu_contenu.add(new ICPageDemandeAbsenceConsultation());
						closeLoading();
					}
				});
			}
		});
		
		menu.absence_demande.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				showLoading();
				Scheduler.get().scheduleEntry(new ScheduledCommand() {
					public void execute() {
						contenu.contenu_contenu.add(new ICPageDemandeAbsenceDemande());
						closeLoading();
					}
				});
			}
		});
		
		menu.temps_passes.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				showLoading();
				Scheduler.get().scheduleEntry(new ScheduledCommand() {
					public void execute() {
						contenu.contenu_contenu.add(new ICPageTempsPasses());
						closeLoading();
					}
				});
			}
		});
		
		menu.page_soumission.setScheduledCommand(new ScheduledCommand() {
			public void execute() {
				showLoading();
				Scheduler.get().scheduleEntry(new ScheduledCommand() {
					public void execute() {
						contenu.contenu_contenu.add(new ICPageSoumission());
						closeLoading();
					}
				});
			}
		});
		
	}

	public static void showLoading() {
		loading.setVisible(true);
		int width = Math.max(Window.getClientWidth()/2, 1200);
		contenu.contenu_contenu.setWidth(width + "px");
		Scheduler.get().scheduleEntry(new ScheduledCommand() {
			public void execute() {
				contenu.contenu_contenu.clear();
		}
		});
	}
	
	protected static void closeLoading() {
		Scheduler.get().scheduleFinally(new ScheduledCommand() {
			public void execute() {
				loading.setVisible(false);
			}
		});
	}
}
