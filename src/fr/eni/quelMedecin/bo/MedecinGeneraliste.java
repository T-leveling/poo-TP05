package fr.eni.quelMedecin.bo;

/**
 * Classe modélisant un médecin généraliste
 * 
 * @author ENI
 * @version 2.0
 */
public class MedecinGeneraliste extends Personne {

	private Creneau[] creneaux = new Creneau[MAX_CRENEAUX];

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

		if (this.getAdresse() != null) {
			this.getAdresse().afficher();
		}
		System.out.println("Créneaux :");
		}
	

	void ajouterCreneau(Creneau creneauAAjouter) {
		if (this != creneauAAjouter.getMedecin()) {
			System.err.println("Ce créneau ne peut être associé à ce médecin car il est déjà associé à un autre");
		} else {
			int pos = 0;
			while (pos < this.creneaux.length && this.creneaux[pos] != null)
				pos++;
			if (pos == this.creneaux.length)
				System.err.println("Trop de créneaux sont affectés à ce médecin");
			else
				this.creneaux[pos] = creneauAAjouter;
		}
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



	public void afficherAdresseEtCreneaux() {
		if (this.creneaux == null) {
			System.out.println("Aucun creneau");
		} else {
			for (Creneau creneau : this.creneaux) {
				if (creneau != null){
					creneau.afficher();
				}
			}

			System.out.println("Adresse : ");
			this.getAdresse().afficher();
		}
	}
}
