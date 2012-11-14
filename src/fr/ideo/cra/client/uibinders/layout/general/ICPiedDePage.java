package fr.ideo.cra.client.uibinders.layout.general;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ICPiedDePage extends Composite {

	private static ICPiedDePageUiBinder uiBinder = GWT
			.create(ICPiedDePageUiBinder.class);

	interface ICPiedDePageUiBinder extends UiBinder<Widget, ICPiedDePage> {
	}

	public ICPiedDePage() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
