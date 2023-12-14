import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner saisi=new Scanner(System.in);
        int nombreSecret=(int)(Math.random()*100)+1;
        System.out.println("devine le nombre entre 1 et 100;");
        int tentative;
        do {
            tentative=saisi.nextInt();
            if(tentative < nombreSecret){
                System.out.println("le nombre est plus grand essaie encore !");
            } else if (tentative > nombreSecret) {
                System.out.println("le nombre est plus petit essaie encore !");
            }
            else {
                System.out.println("Bravo tu as trouve le nombre secert:" + nombreSecret);
            }
        }while (tentative != nombreSecret);
        saisi.close();

    }
}