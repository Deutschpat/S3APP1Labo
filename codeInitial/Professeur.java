package codeInitial;

public final class Professeur {

    private String cip;
    private String nom;
    private static Professeur professeur = null;

    private Professeur(String cip, String nom) {
        this.cip = cip;
        this.nom = nom;
    }

    public static Professeur getInstance(String cip, String nom){
        if(professeur == null){
            professeur = new Professeur(cip, nom);
        }
        return professeur;
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
