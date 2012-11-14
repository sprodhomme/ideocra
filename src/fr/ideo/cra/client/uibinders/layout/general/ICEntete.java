package fr.ideo.cra.client.uibinders.layout.general;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ICEntete extends Composite {

	private static ICEnteteUiBinder uiBinder = GWT
			.create(ICEnteteUiBinder.class);

	interface ICEnteteUiBinder extends UiBinder<Widget, ICEntete> {
	}

	public ICEntete() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
