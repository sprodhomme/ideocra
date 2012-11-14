package fr.ideo.cra.client.uibinders.layout.general;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ICRootView extends Composite {

	private static ICRootViewUiBinder uiBinder = GWT
			.create(ICRootViewUiBinder.class);
	
	@UiField ICContenu contenu;

	interface ICRootViewUiBinder extends UiBinder<Widget, ICRootView> {
	}

	public ICRootView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
