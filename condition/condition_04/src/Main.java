import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrez le poids du colis");
        Scanner saisi=new Scanner(System.in);
        double poids=saisi.nextDouble();
        double FraiExpediteur;
        if (poids <=1){
            FraiExpediteur=5.0;
        } else if (poids <=5) {
            FraiExpediteur=8.0;
        }
        else if (poids <=10) {
            FraiExpediteur=12.0;
        }
        else {
            FraiExpediteur=15.0;
        }
        System.out.println("Les frais d'expéditions pour un colis de poid" +" "+ poids +"kg"+ " "+"sont de"+" "+ FraiExpediteur +"GNF");
    }
}