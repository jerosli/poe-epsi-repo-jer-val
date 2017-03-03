package fr.epsi.poe.hardis.tu;

/**
 * Created by jerome on 28/02/17.
 */
public class Restaurant {
    private String nom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays.toUpperCase();
    }

    private String pays;

    private boolean ouvert;

    Restaurant(){
        setOuvert(true);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        this.nom = nom.toLowerCase();
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
        this.adresse += "FRANCE";
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (telephone != null && telephone.startsWith("+33")) {
            this.telephone = telephone;
        }
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDepartement(){
        String cp = getCodePostal().substring(0,1);
        return cp;
    }
}
