import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nous voulons connaitre la moyenne de trois nombres ");
        System.out.println("donner donc la valeur du premier nombre");
        Scanner saisi1=new Scanner(System.in);
        int nbr1=saisi1.nextInt();
        System.out.println("donner donc la valeur du deuxième nombre");
        Scanner saisi2=new Scanner(System.in);
        int nbr2=saisi2.nextInt();
        System.out.println("donner donc la valeur du premier nombre");
        Scanner saisi3=new Scanner(System.in);
        int nbr3=saisi1.nextInt();
        int moyenne=(nbr1 + nbr2 +nbr3)/3;
        System.out.println("la moyenne de ces trois nombres est:" +" "+ moyenne);
    }
}