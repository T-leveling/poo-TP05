package fr.eni.quelMedecin.bo;

public class MedecinSpecialiste extends Medecin{

    private String specialite;
    private int tarif;

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    @Override
    public void afficher() {
        System.out.println(this.getNom().toUpperCase() + " " + this.getPrenom());
        System.out.println("Téléphone : " + this.getNumeroDeTelephone());
        System.out.println("Spécialité : " + this.specialite);
        System.out.println("Tarif : " + this.tarif + "€");
        this.afficherAdresseEtCreneaux();
    }
}
