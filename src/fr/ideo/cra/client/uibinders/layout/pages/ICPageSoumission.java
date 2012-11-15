package fr.ideo.cra.client.uibinders.layout.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ICPageSoumission extends Composite {

	private static ICPageSoumissionUiBinder uiBinder = GWT
			.create(ICPageSoumissionUiBinder.class);

	interface ICPageSoumissionUiBinder extends
			UiBinder<Widget, ICPageSoumission> {
	}

	public ICPageSoumission() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
