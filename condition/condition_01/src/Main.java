import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Verification si un nombre est paire ou impaire");
        System.out.println("donnez un nombre afin de verifier");
        Scanner saisi=new Scanner(System.in);
        int nbre=saisi.nextInt();
        if(nbre % 2 ==0){
            System.out.println("le nombre"+" "+nbre +" "+"est pair");
        }
        else {
            System.out.println("le nombre"+" "+nbre +" "+"est impair");
        }
    }
}