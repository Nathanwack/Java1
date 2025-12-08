import java.util.Scanner;

public class Moyenne {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Veuillez entrer trois nombres");
        System.out.print("Entrez le premier nombre : ");
        double nombreUn = scanner.nextDouble();
        System.out.print("Entrez le second nombre : ");
        double nombreDeux = scanner.nextDouble();
        System.out.print("Entrez le dernier nombre : ");
        double nombreTrois = scanner.nextDouble();
        double moyenne = (nombreTrois + nombreDeux + nombreUn) / 3;
        String Statut = "Ajourné";
        if (moyenne >= 10) {
            Statut = "Admis";
        }
        System.out.println("Moyenne : "+ moyenne);
        System.out.println("Statut : "+ Statut);
    }
}