package fr.eni.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe modélisant un patient
 * 
 * @author ENI
 * @version 2.0
 */
public class Patient extends Personne{

	private char sexe;
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	


	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu, LocalDate dateNaissance,String commentaires,Adresse adresse) {
		super(nom, prenom, numeroDeTelephone, adresse);
		this.sexe = sexe;
		this.numSecu = numSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
	}

	@Override
	public void afficher() {
		System.out.printf(
				"%s %s%nTéléphone : %s%nSexe : %s%nNuméro de Sécurité sociale : %d%nDate de naissance : %s%nCommentaires : %s%nAdresse :%n",
				this.getNom(), this.getPrenom(), this.getNumeroDeTelephone(), this.getSexe() == 'F' ? "Féminin" : "Masculin",
				this.getNumSecu(), this.getDateNaissance().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
				this.commentaires != null ? this.getCommentaires() : "[aucun commentaire]");
				if (this.getAdresse() != null) {
					this.getAdresse().afficher();
				}
	}


	public char getSexe() {
		return sexe;
	}

	
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	
	public long getNumSecu() {
		return numSecu;
	}


	public void setNumSecu(long numSecu) {
		this.numSecu = numSecu;
	}

	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	

}
