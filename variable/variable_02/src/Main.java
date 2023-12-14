import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Nous voulon calculez la surface du rectange*****");
        System.out.println("Donnez la longueur du rectangle");
        Scanner saisiel = new Scanner(System.in);
        int longueur = saisiel.nextInt();
        System.out.println("Donnez la largeur du rectangle");
        Scanner saisieL = new Scanner(System.in);
        int largeur=saisieL.nextInt();
        int surface=longueur * largeur;
        System.out.println("après calcul la surface du rectangle est egal à:" +" "+surface );
    }
}