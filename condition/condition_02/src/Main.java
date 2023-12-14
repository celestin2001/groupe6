import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nous voulons savoir si vous êtes mineur ou majeur");
        System.out.println("Entrez votre age ?");
        Scanner saisi=new Scanner(System.in);
        int age=saisi.nextInt();
        if(age<0 || age==0){
            System.out.println("Vous n'avez pas compris  merci à plus");
        } else if (age >=18) {
            System.out.println("vous êtes majeur");
        }
        else {
            System.out.println("vous êtes mineur");
        }
    }
}