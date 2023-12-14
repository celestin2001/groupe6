import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]tableau1={1,2,3,4,5};
        int[]tableau2={4,5,7,9,3};
        if (tableau1.length != tableau2.length){
            System.out.println("les deux tableaux ne sont pas de la même longueur.");
            return;
        }
        int[]tableauResultat=new  int[tableau1.length];
        for (int i=0;i <tableau1.length;i++){
            tableauResultat[i]=tableau1[i] +tableau2[i];
        }
        System.out.println("tableau 1 :" + Arrays.toString(tableau1));
        System.out.println("tableau 2 :" + Arrays.toString(tableau2));
        System.out.println("tableau resultat :" + Arrays.toString(tableauResultat));
    }
}