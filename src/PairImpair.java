import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args){
        System.out.println("Entrez un nombre");
        Scanner nombre = new Scanner(System.in);
        int n = nombre.nextInt();
        if (n % 2 != 0){
            System.out.print(n);
            System.out.println(" est impair");
        } else if (n % 2 == 0) {
            System.out.println(n +" est pair");
        }
    }
}
