import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nous voulons savoir si l'annee est bixetil");
        System.out.println("donner une annee");
        Scanner saisi=new Scanner(System.in);
        int annee=saisi.nextInt();
        if (annee<0 || annee==0){
            System.out.println("desole ceci n'est pas une annee valide à plus");
        }
        if (annee % 4 ==0){
            System.out.println("Ouais"+" "+annee+" "+"est une annee bixetil");
        }
        else {
            System.out.println("Nom"+" "+annee+" "+"n'est pas une annee bixetil");
        }
    }
}