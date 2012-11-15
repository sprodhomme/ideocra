/**
 * 
 */
package fr.ideo.cra.client.classes;

import java.util.Date;

/**
 * @author Serge Prodhomme
 *
 */
public class DemandeAbsence {
	
	private int type; // 0:CP Conges payes, 1:RTT, 2:Conge maladie, 3:Conge maternite, 4:Conge paternite 
	
	private Date datedebut = new Date();
	private Date datefin = new Date();
	
	private int debutmam = 0; // 0 : matin, 1 : apres-midi
	private int finmam = 1;
	
	private String commentaire;

	public DemandeAbsence(int type, Date datedebut, Date datefin, int debutmam, int finmam, String commentaire) {
		super();
		this.type = type;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.debutmam = debutmam;
		this.finmam = finmam;
		this.commentaire = commentaire;
	}

	// Getters and setters
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	public int getDebutmam() {
		return debutmam;
	}

	public void setDebutmam(int debutmam) {
		this.debutmam = debutmam;
	}

	public int getFinmam() {
		return finmam;
	}

	public void setFinmam(int finmam) {
		this.finmam = finmam;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
}
