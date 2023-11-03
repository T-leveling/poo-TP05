package fr.eni.quelMedecin.bo;

import static fr.eni.quelMedecin.bo.MedecinGeneraliste.MAX_CRENEAUX;

public class Medecin extends Personne {

    private Creneau[] creneaux = new Creneau[MAX_CRENEAUX];

    public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
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

    public void afficherAdresseEtCreneaux() {
        if (this.creneaux == null) {
            System.out.println("Aucun creneau");
        } else {
            System.out.println("Adresse : ");
            this.getAdresse().afficher();
            System.out.println("Créneaux : ");
            for (Creneau creneau : this.creneaux) {
                if (creneau != null) {
                    creneau.afficher();
                }
            }
        }
    }
}
