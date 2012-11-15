package fr.ideo.cra.client.uibinders.layout.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ICPageTempsPasses extends Composite {

	private static ICPageTempsPassesUiBinder uiBinder = GWT
			.create(ICPageTempsPassesUiBinder.class);

	interface ICPageTempsPassesUiBinder extends
			UiBinder<Widget, ICPageTempsPasses> {
	}

	public ICPageTempsPasses() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
