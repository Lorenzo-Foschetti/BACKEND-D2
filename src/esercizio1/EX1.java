package esercizio1;

public class EX1 {
    public static void main(String[] args) {
        System.out.println("ciao");
        System.out.println("test");
        System.out.println(pariDispari("epicode"));
        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(2010));
    }

    public static Boolean pariDispari(String text) {

        if (text.length() % 2 == 0) {
            return true;
        } else {
            return  false;
        }

    }

    public static Boolean annoBisestile(int num) {

        if (num % 4 == 0 && num % 100 == 0 && num % 400 == 0) {
            return  true;
        } else {
            return false;
        }
    }

}