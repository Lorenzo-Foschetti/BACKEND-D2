package esercizio2;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        System.out.println("ciao a tutti");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero!");
        int num = Integer.parseInt(sc.nextLine());
        printNumLetters(num);

    }
    public static void printNumLetters(int num) {
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                 System.out.println("ERRORE, Il numero deve essere compreso tra 0 e 3!");
        }
    }
}