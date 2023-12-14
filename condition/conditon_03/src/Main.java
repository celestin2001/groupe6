import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nous voulons connaitre le plus grand entre trois nombre saisies");
        System.out.println("donnez le premier nombre");
        Scanner saisi=new Scanner(System.in);
        int nbr1=saisi.nextInt();
        System.out.println("donnez le deuxième nombre");
        Scanner saisi2=new Scanner(System.in);
        int nbr2=saisi2.nextInt();
        System.out.println("donnez le toixième nombre");
        Scanner saisi3=new Scanner(System.in);
        int nbr3=saisi3.nextInt();

        if (nbr2>nbr1 && nbr2>nbr3 ){
            System.out.println("le plus grand nombre de ces trois est:"+" "+ nbr2);
        } else if (nbr3>nbr1 && nbr3>nbr2) {
            System.out.println("le plus grand nombre de ces trois est:"+" "+ nbr3);
        }
        else if (nbr1>nbr2 && nbr1>nbr3) {
            System.out.println("le plus grand nombre de ces trois est:"+" "+ nbr1);
        }
        else {
            System.out.println("les trois nombres sont egaux");
        }
    }
}