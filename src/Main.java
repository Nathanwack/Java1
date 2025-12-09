import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Specialite Java = new Specialite("JAVA/JEE");
        Specialite HTML_CSS = new Specialite("HTML/CSS");
        Specialite Gestion_projet = new Specialite("Gestion de projet");
        Specialite JS = new Specialite("Javascript");
        Specialite PHP = new Specialite("PHP");
        ArrayList<Specialite> Specialites = new ArrayList<>(List.of(Java, HTML_CSS, Gestion_projet, JS, PHP));
        Enseignant Joe = new Enseignant("Joe", Java);
        Enseignant Jack = new Enseignant("Jack", Java);
        Enseignant Averell = new Enseignant("Averell", JS);
        Enseignant William = new Enseignant("William", PHP);
        ArrayList<Enseignant> Enseignants = new ArrayList<>(List.of(Joe, Jack, Averell, William));
        for (Specialite specialite : Specialites) {
            boolean trouvé = false;
            System.out.print("\n" + specialite.getNom() + " : ");
            for (Enseignant enseignant : Enseignants) {
                if (specialite.getNom().equals(enseignant.getSpecialite().getNom())) {
                    System.out.print(enseignant.getNom() + " ");

                    trouvé = true;
                }
            }
            if (!trouvé) {
                System.out.print("Aucun enseignant trouvé.");
            }
        }

        Filiere CDA = new Filiere("1", "CDA");
        Filiere Marketing = new Filiere("2", "Marketing");
        Filiere Assistance = new Filiere("3", "Assistance");

        Etudiant Bart = new Etudiant("Simpson", "Bart", CDA);
        Etudiant Homer = new Etudiant("Homer", "Simpson", CDA);
        Etudiant Vanessa = new Etudiant("Sultan", "Vanessa", Marketing);
        Etudiant Marge = new Etudiant("Simpson", "Marge", Marketing);
        Etudiant Lisa = new Etudiant("Simpson", "Lisa", Marketing);

        ArrayList<Filiere> Filieres = new ArrayList<>(List.of(CDA, Marketing, Assistance));
        ArrayList<Etudiant> Etudiants = new ArrayList<>(List.of(Bart, Homer, Vanessa, Marge, Lisa));
        System.out.println("");
        System.out.println("*** LISTE DES FILIERES ***");
        for (Filiere filiere : Filieres) {
            System.out.println(filiere.getLibelle());
        }
        System.out.println("");
        System.out.println("*** LISTE DES ETUDIANTS PAR FILIERES ***");
        System.out.println("");
        for (Filiere filiere : Filieres) {
            Boolean dedans = false;
            int compteur = 0;
            System.out.println(filiere.getLibelle() + " : ");
            for (Etudiant etudiant : Etudiants) {
                if (filiere.getLibelle().equals(etudiant.getFiliere().getLibelle())) {
                    compteur++;
                    System.out.println(compteur+". " + etudiant.getPrenom() + " " + etudiant.getNom() + " ");

                    dedans = true;
                }
            }
            System.out.println(" ");
            if (!dedans) {
                System.out.println("Aucun élève.");
            }
        }
    }
}
