package fr.ideo.cra.client.uibinders;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;

public class ICMenu extends Composite {

	private static ICMenuUiBinder uiBinder = GWT.create(ICMenuUiBinder.class);

	@UiField MenuItem absence_consultation;
	@UiField MenuItem absence_demande;
	
	@UiField MenuItem temps_passes;
	
	@UiField MenuItem page_soumission;
	
	@UiField MenuItem deconnexion;
	
	
	interface ICMenuUiBinder extends UiBinder<Widget, ICMenu> {
	}

	public ICMenu() {
		initWidget(uiBinder.createAndBindUi(this));
		initHandlers();
	}

	private void initHandlers() {
//		absence_consultation
	}

}
