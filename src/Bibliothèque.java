import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.Scanner;

public class Bibliothèque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livre> livres = new ArrayList<>();
        switch (Menu(sc)) {
            case "1" :
                Livre NouveauLivre = new Livre(sc);
                livres.add(NouveauLivre);
            break;
            case "2" :
            break;
        }
    }
    public static String Menu(Scanner sc){
        System.out.println(
                "Choisissez une option :\n" +
                        "1. Créer un livre  " +
                        "2. Supprimer un livre  " +
                        "3. Voir les livres " +
                        "4. Sortir du programme "
        );
        String retour = sc.nextLine();
        return retour;

    }
}
