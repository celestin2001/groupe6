import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Donner un nombre pour trouver sa table de multiplication");
        Scanner saisi=new Scanner(System.in);
        int nbr=saisi.nextInt();
        System.out.println("La table de multiplication de"+ " "+nbr+" "+"est:");
        System.out.println();
        for (int i=0; i<=10;i++){
            System.out.println(nbr +" "+ "*"+" "+ i +"="+" "+ nbr * i);
        }
    }
}