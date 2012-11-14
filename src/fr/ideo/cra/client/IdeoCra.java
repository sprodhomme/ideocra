package fr.ideo.cra.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import fr.ideo.cra.client.uibinders.layout.general.ICRootView;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class IdeoCra implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ICRootView vue = new ICRootView();
		RootPanel.get().add(vue);
		
//		DateBox dateBox = new DateBox();
//	    dateBox.setValue(new Date());
//	    RootPanel.get().add(dateBox);
		
//		final DatePicker date = new DatePicker();
//		RootPanel.get().add(date);
//		date.setVisible(true);
//		
//		RootPanel.get().add(new Label("Date : "));
//		
//		final DateLabel ldate = new DateLabel();
//		RootPanel.get().add(ldate);
//		
//		
//		date.addValueChangeHandler(new ValueChangeHandler<Date>() {
//		      public void onValueChange(ValueChangeEvent<Date> event) {
//				ldate.setValue(date.getHighlightedDate());
//			}
//		});
	}
}
