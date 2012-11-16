package fr.ideo.cra.client.uibinders.layout.elements;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

import fr.ideo.cra.client.classes.DemandeAbsence;

public class ICDemandeAbsence extends Composite {

	private static ICDemandeAbsenceUiBinder uiBinder = GWT.create(ICDemandeAbsenceUiBinder.class);
	public DemandeAbsence demande;
	@UiField ListBox absence_types;
	
	@UiField DateBox absence_demande_datededebut;
	@UiField DateBox absence_demande_datedefin;
	
	@UiField RadioButton datededebut_matin;
	@UiField RadioButton datededebut_apresmidi;
	@UiField RadioButton datedefin_matin;
	@UiField RadioButton datedefin_apresmidi;
	
	@UiField Button absence_demande_boutonsupprimer;
	
	private static int nombreDemandes = 0;
	
	interface ICDemandeAbsenceUiBinder extends UiBinder<Widget, ICDemandeAbsence> {}

	@UiConstructor
	public ICDemandeAbsence() {
		nombreDemandes++;
		
		initWidget(uiBinder.createAndBindUi(this));
		
		datededebut_matin.setName("debut-" + nombreDemandes);
		datededebut_apresmidi.setName("debut-" + nombreDemandes);
		
		datedefin_matin.setName("fin-" + nombreDemandes);
		datedefin_apresmidi.setName("fin-" + nombreDemandes);
	}
}
