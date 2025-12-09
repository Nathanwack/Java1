import java.util.Random;
import java.util.Scanner;

public class JeuDevinette {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        while (guess != n) {
            System.out.print("Entrez un nombre : ");
            guess = scan.nextInt();
            if (guess > n) {
                System.out.println(" -> Trop grand !");
            }
            if (guess < n) {
                System.out.println(" -> Trop petit !");
            }
        }
        System.out.println("Bonne réponse !");
        scan.close();
    }
}
