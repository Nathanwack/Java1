import java.util.Scanner;

public class CompteVoyelles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un texte : ");
        String texte = scanner.nextLine();
        String[] voyelles = {"a","e","i","o","u","y"};
        int compteur = 0;
        for (int i = 0; i< texte.length();i++){
            char tocompare = texte.charAt(i);
            for (String voyelle : voyelles) {
                if (tocompare == (voyelle.charAt(0))) {
                    compteur++;
                }
            }
        }
        System.out.print("Il y a dans ce texte : " + compteur +  " voyelles.");
    }
}
