import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner saisi=new Scanner(System.in);
        System.out.println("Donner un nombre pour touver son factoriel");
        int nombre =saisi.nextInt();
        long factorielle=1;
        int i=1;
        do {
            factorielle *=i;
            i++;
        } while (i <= nombre);
        System.out.println("La factorielle de" + " " + nombre +" " + "est :" +" " +factorielle);

    }
}