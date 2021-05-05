package codeInitial;

public class TestGroupeProfesseur {

    public static void main(String[] args)
    {
        Groupe groupe = new Groupe(1,"Design Patterns");
        Professeur professeur1 = Professeur.getInstance("abcd1234","Mr Professeur 1");
        Professeur professeur2 = Professeur.getInstance("bcde2345","Mr Professeur 2");

        System.out.println("Le groupe : " + groupe);
        groupe.setProfesseur(professeur1);
        System.out.println("Le groupe : " + groupe);

        groupe.setProfesseur(professeur2);
        System.out.println("Le groupe : " + groupe);

    }
}
