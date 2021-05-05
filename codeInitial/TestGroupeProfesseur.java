package codeInitial;

public class TestGroupeProfesseur {

    public static void main(String[] args)
    {
        Groupe groupe = new Groupe(1,"Design Patterns");
        Professeur professeur1 = new Professeur("abcd1234","Mr Professeur 1");
        Professeur professeur2 = new Professeur("bcde2345","Mr Professeur 2");

        System.out.println("Le groupe : " + groupe);
        groupe.setProfesseur(professeur1);
        System.out.println("Le groupe : " + groupe);

        groupe.setProfesseur(professeur2);
        System.out.println("Le groupe : " + groupe);

    }
}
