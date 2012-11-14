package fr.ideo.cra.client.uibinders.layout.elements;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;

import fr.ideo.cra.client.classes.DemandeAbsence;

public class ICDemandeAbsence extends Composite {

	private static ICDemandeAbsenceUiBinder uiBinder = GWT.create(ICDemandeAbsenceUiBinder.class);
	public DemandeAbsence demande;
	@UiField ListBox absence_types;
	
	@UiField DateBox absence_demande_datededebut;
	@UiField DateBox absence_demande_datedefin;
	
	@UiField Button absence_demande_boutonsupprimer;
	
	interface ICDemandeAbsenceUiBinder extends UiBinder<Widget, ICDemandeAbsence> {}

	public ICDemandeAbsence() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public ICDemandeAbsence(DemandeAbsence demande) {
		initWidget(uiBinder.createAndBindUi(this));
		this.demande = demande;
		try {absence_types.setItemSelected(demande.getType(), true);} catch (Exception e) {System.err.println("Pas d'elements dans la liste des types de conges ou liste incompatible de par son nombre d'elements");}
		absence_demande_datededebut.setValue(demande.getDatedebut());
		absence_demande_datedefin.setValue(demande.getDatefin());
	}
}
