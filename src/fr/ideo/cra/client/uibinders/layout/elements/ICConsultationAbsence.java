package fr.ideo.cra.client.uibinders.layout.elements;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import fr.ideo.cra.client.classes.DemandeAbsence;

public class ICConsultationAbsence extends Composite {

	private static ICDemandeAbsenceUiBinder uiBinder = GWT.create(ICDemandeAbsenceUiBinder.class);

	public static final String FORMAT_DATE = "EEE dd/MM/yyyy";
	
	interface ICDemandeAbsenceUiBinder extends UiBinder<Widget, ICConsultationAbsence> {}

	@UiField Label absence_type;
	@UiField Label absence_datededebut;
	@UiField Label absence_bouton_datededebut;
	@UiField Label absence_datedefin;
	@UiField Label absence_bouton_datedefin;
	@UiField Label absence_commentaire;
	
	public ICConsultationAbsence() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setDemande(DemandeAbsence demande) {
		
		//TODO mettre les variables globales (avant JPA) dans une classe Globals
		String type = "";
		switch (demande.getType()) {
		case 0:
			type = "CP - Congés payés";
			break;
		case 1:
			type = "RTT - Réduction du Temps de Travail";
			break;
		case 2:
			type = "CM - Congé maternité";
			break;
		case 3:
			type = "CPA - Congé paternité";
			break;
		default:
			break;
		}
		
		absence_type.setText(type);
		absence_datededebut.setText(DateTimeFormat.getFormat(FORMAT_DATE).format(demande.getDatedebut()));
		absence_datedefin.setText(DateTimeFormat.getFormat(FORMAT_DATE).format(demande.getDatefin()));
		absence_bouton_datededebut.setText("" + (demande.getDebutmam()==0 ? "au matin" : " apres-midi"));
		absence_bouton_datedefin.setText("" + (demande.getFinmam()==0 ? "au matin" : " apres-midi"));
		absence_commentaire.setText(demande.getCommentaire());
	}

}
