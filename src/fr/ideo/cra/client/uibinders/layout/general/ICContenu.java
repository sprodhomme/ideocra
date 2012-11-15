package fr.ideo.cra.client.uibinders.layout.general;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class ICContenu extends Composite {

	private static ICContenuUiBinder uiBinder = GWT.create(ICContenuUiBinder.class);

	@UiField Image imageLoading;
	@UiField ScrollPanel contenu_scrollpanel;
	@UiField VerticalPanel contenu_contenu;
	@UiField VerticalPanel contenu_options;
	
	interface ICContenuUiBinder extends UiBinder<Widget, ICContenu> {
	}

	public ICContenu() {
		initWidget(uiBinder.createAndBindUi(this));
		Scheduler.get().scheduleFinally(new ScheduledCommand() {
			public void execute() {
				int height = Window.getClientHeight() - 200;
				contenu_scrollpanel.setHeight(height+"px");
				imageLoading.setVisible(false);
			}
		});
		
	}

}
