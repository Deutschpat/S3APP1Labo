package codeInitial;

public class Professeur {

    private String cip;
    private String nom;

    public Professeur(String cip, String nom) {
        this.cip = cip;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "hash code=" + this.hashCode() + " \n"+
                "cip='" + cip + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
