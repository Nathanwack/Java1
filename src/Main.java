import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Enseignant Burns = new Enseignant("Charles Montgomery Burns", JS);
        Enseignant Zack = new Enseignant("Zack", Gestion_projet);
        getFilieres(Burns,Zack);
        ArrayList<Etudiant> Etudiants = getEtudiants(Burns, Zack);
        ArrayList<Enseignant> Enseignants = new ArrayList<>(List.of(Joe, Jack, Averell, William));
        Enseignants.add(Burns);
        Enseignants.add(Zack);
        Scanner scanner = new Scanner(System.in);

        boolean EndChoice = false;
        while (!EndChoice) {
            switch (Menu()) {
                case "2":
                    System.out.println("Nom de la filière");
                    String nomm = scanner.nextLine();
                    for (Filiere Filiere : getFilieres(Burns, Zack)) {
                        int eleves = 0;

                        ArrayList<Etudiant> nomseleves = new ArrayList<>();
                        if (Filiere.getLibelle().equals(nomm)) {
                            System.out.println("Nom de la filière : " + nomm);
                            for (Etudiant etudiant : Etudiants) {
                                if (etudiant.getFiliere().getLibelle().equals(Filiere.getLibelle())) {
                                    eleves++;
                                    nomseleves.add(etudiant);
                                }
                            }
                            System.out.println(Filiere.getFormateur().getNom() + " anime la formation " + Filiere.getLibelle() + " avec " + nomseleves.toArray().length + " apprenants");
                            int i = 0;
                            for (Etudiant Etudiant : nomseleves) {
                                i++;
                                System.out.println("\b " + i +". "+(Etudiant.getPrenom() +" " + (Etudiant.getNom())));
                            }
                        }
                    }
                    break;
                case "1":
                    System.out.println("Nom de l'enseignant: ");
                    String nom = scanner.nextLine();
                    for (Enseignant enseignant : Enseignants) {
                        int eleves = 0;

                        ArrayList<Etudiant> nomseleves = new ArrayList<>();
                        if (enseignant.getNom().equals(nom)) {
                            System.out.println("Nom de l'enseignant : " + nom);
                            for (Etudiant etudiant : Etudiants) {
                                if (etudiant.getFiliere().getLibelle().equals(enseignant.getFiliere().getLibelle())) {
                                    eleves++;
                                    nomseleves.add(etudiant);
                                }
                            }
                            System.out.println(enseignant.getNom() + " anime la formation " + enseignant.getFiliere().getLibelle() + " avec " + nomseleves.toArray().length + " apprenants");
                            int i = 0;
                            for (Etudiant Etudiant : nomseleves) {
                                i++;
                                System.out.println("\b " + i +". "+(Etudiant.getPrenom() +" " + (Etudiant.getNom())));
                            }
                        }
                    }
                    break;
                case "3":
                    EndChoice = true;
                    break;
            }
        }
    }

    private static String Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enseignant ou 2. Filière ou 3. Quitter :");
        String input = scanner.nextLine();
        return input;
    }

    private static ArrayList<Etudiant> getEtudiants(Enseignant Burns, Enseignant Zack) {
        Filiere CDA = new Filiere("1", "CDA", Burns);
        Burns.setFiliere(CDA);
        Filiere Marketing = new Filiere("2", "Marketing", Zack);
        Zack.setFiliere(Marketing);
        Filiere Assistance = new Filiere("3", "Assistance");


        Etudiant Bart = new Etudiant("Simpson", "Bart", CDA);
        Etudiant Homer = new Etudiant("Simpson", "Homer", CDA);
        Etudiant Vanessa = new Etudiant("Sultan", "Vanessa", Marketing);
        Etudiant Marge = new Etudiant("Simpson", "Marge", Marketing);
        Etudiant Lisa = new Etudiant("Simpson", "Lisa", Marketing);

        ArrayList<Filiere> Filieres = new ArrayList<>(List.of(CDA, Marketing, Assistance));

        ArrayList<Etudiant> Etudiants = new ArrayList<>(List.of(Bart, Homer, Vanessa, Marge, Lisa));
        return Etudiants;
    }

    private static ArrayList<Filiere> getFilieres(Enseignant Burns, Enseignant Zack) {
        Filiere CDA = new Filiere("1", "CDA", Burns);
        Burns.setFiliere(CDA);
        Filiere Marketing = new Filiere("2", "Marketing", Zack);
        Zack.setFiliere(Marketing);
        Filiere Assistance = new Filiere("3", "Assistance");
        ArrayList<Filiere> Filieres = new ArrayList<>(List.of(CDA, Marketing, Assistance));
        return Filieres;
    }
/*
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
        Enseignant Burns = new Enseignant("Charles Montgomery Burns", JS);
        Enseignant Zack = new Enseignant("Zack kas", Gestion_projet);
        ArrayList<Enseignant> Enseignants = new ArrayList<>(List.of(Joe, Jack, Averell, William));
        for (Specialite specialite : Specialites) {
            boolean trouve = false;
            System.out.print("\n" + specialite.getNom() + " : ");
            for (Enseignant enseignant : Enseignants) {
                if (specialite.getNom().equals(enseignant.getSpecialite().getNom())) {
                    System.out.print(enseignant.getNom() + " ");

                    trouve = true;
                }
            }
            if (!trouve) {
                System.out.print("Aucun enseignant trouvé.");
            }
        }

        Filiere CDA = new Filiere("1", "CDA", Burns);
        Filiere Marketing = new Filiere("2", "Marketing", Zack);
        Filiere Assistance = new Filiere("3", "Assistance");

        Etudiant Bart = new Etudiant("Simpson", "Bart", CDA);
        Etudiant Homer = new Etudiant("Homer", "Simpson", CDA);
        Etudiant Vanessa = new Etudiant("Sultan", "Vanessa", Marketing);
        Etudiant Marge = new Etudiant("Simpson", "Marge", Marketing);
        Etudiant Lisa = new Etudiant("Simpson", "Lisa", Marketing);

        ArrayList<Filiere> Filieres = new ArrayList<>(List.of(CDA, Marketing, Assistance));
        ArrayList<Etudiant> Etudiants = new ArrayList<>(List.of(Bart, Homer, Vanessa, Marge, Lisa));
        System.out.println("\n");
        System.out.println("*** LISTE DES FILIERES ***");
        System.out.println();
        for (Filiere filiere : Filieres) {
            System.out.println(filiere.getLibelle());
        }
        System.out.println();
        System.out.println("*** LISTE DES ETUDIANTS PAR FILIERES ***");
        System.out.println();
        for (Filiere filiere : Filieres) {
            boolean dedans = false;
            int compteur = 0;
            System.out.println(filiere.getLibelle() + " : ");
            if (filiere.getFormateur() != null) {
                System.out.println("\nFormateur : " + filiere.getFormateur().getNom() + "\n");
            }
            for (Etudiant etudiant : Etudiants) {
                if (filiere.getLibelle().equals(etudiant.getFiliere().getLibelle())) {
                    compteur++;
                    System.out.println(compteur+". " + etudiant.getPrenom() + " " + etudiant.getNom() + " ");

                    dedans = true;
                }
            }
            if (!dedans) {
                System.out.println("Aucun élève.");
            }
            System.out.println(" ");
        }*/
}

