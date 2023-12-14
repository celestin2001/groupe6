import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner saisi=new Scanner(System.in);
        System.out.println("choisir l'option de conversion:\n1. celsius vers faradhe\n2. faraghe vers celsius");
        int choix= saisi.nextInt();
        if (choix ==1){
        System.out.println("entrez la temperature en degre celsius");
        double celsius=saisi.nextDouble();
        double faradhe=convertirCelsiusEnFaradhe(celsius);
        System.out.println(celsius + "degre celsius equivalent à" + faradhe + "faradhe");
    } else if (choix == 2) {

            System.out.println("entrez la temperature en faradhe");
            double faradhe=saisi.nextDouble();
            double celsius=convertirFaradheEnCelsius(faradhe);
            System.out.println(faradhe + "faradhe equivalent à" + celsius + "degre celsius");
        }
        else {
            System.out.println("option non valide");
        }
        saisi.close();
    }
    private static  double convertirCelsiusEnFaradhe(double celsius){
        return  (celsius *9 /5) +32;
    }
    private static  double convertirFaradheEnCelsius(double faradhe){
        return  (faradhe -32 ) *5 /9;
    }
}