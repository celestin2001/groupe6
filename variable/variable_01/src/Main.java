import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("donnez la valeur de a ");
        Scanner saisia=new Scanner(System.in);
         int a=saisia.nextInt();
        System.out.println("donnez la valeur de b ");
        Scanner saisib=new Scanner(System.in);
        int b=saisib.nextInt();
        System.out.println("avant echange la valeur de a est:" +" "+ a +" "+"et la valeur de b est:"+" " +b);
        System.out.println();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("après echange la valeur de a est:" +" "+ a +" "+"et la valeur de b est:"+" " +b);

    }
}