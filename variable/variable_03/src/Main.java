import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Nous voulons connaitre le carre du nombre fourni au clavier");
        System.out.println("Pour cela donnez un nombre");
        Scanner saisi=new Scanner(System.in);
        int nombre=saisi.nextInt();
        int carre=nombre * nombre;
        System.out.println("le carre de"+ nombre+" "+" est egal à: "+" "+ carre);
    }
}