package fr.eni.quelMedecin.bo;

/**
 * Classe modélisant un médecin généraliste
 * 
 * @author ENI
 * @version 2.0
 */
public class MedecinGeneraliste extends Medecin {

	private static int tarif = 25;

	// CONSTANTES DE CLASSE
	public static final int MAX_CRENEAUX = 15;

	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		super(nom, prenom, numeroDeTelephone, adresse);
	}

	@Override
	public void afficher() {
		System.out.println(this.getNom().toUpperCase() + " " + this.getPrenom());
		System.out.println("Téléphone : " + this.getNumeroDeTelephone());
		this.afficherAdresseEtCreneaux();
		}
	



	/**
	 * Getter pour tarif.
	 * 
	 * @return le tarif de la consultation
	 * @see MedecinGeneraliste#setTarif(int)
	 */
	public static int getTarif() {
		return MedecinGeneraliste.tarif;
	}

	/**
	 * Setter pour tarif.
	 * 
	 * @param tarif - le tarif de la consultation
	 * @see MedecinGeneraliste#getTarif()
	 */
	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}




}
