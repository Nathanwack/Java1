import java.util.Locale;
import java.util.Scanner;

public class Livre {
    private String nom;
    private String auteur;
    private Double prix;
    Scanner sc = new Scanner(System.in);

    public String getNom() {
        return nom;
    }

    public String getAuteur() {
        return auteur;
    }
    public Double getPrix() {
        return prix;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public Livre(Scanner sc) {
        System.out.print("Nom : ");
        nom = sc.nextLine();
        this.nom = nom;
        System.out.print("Auteur : ");
        auteur = sc.nextLine();
        this.auteur = auteur;
        System.out.print("Prix : ");
        prix = sc.nextDouble();
        this.prix = prix;
    }

}

