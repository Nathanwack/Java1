import java.util.Scanner;

public class TableMultiplication {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrez un nombre entier ");
        int n = scanner.nextInt();
        int Fix = n;
        for (int x = 1; x <=10;x++) {
            System.out.println(Fix +"x"+x+"="+n);
            n = n +Fix;
        }
    }
}
