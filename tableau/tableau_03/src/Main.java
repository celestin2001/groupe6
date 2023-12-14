public class Main {
    public static void main(String[] args) {
       int[] tableau ={5,12,8,3,20,7};
       trierTableauCroissant(tableau);
        System.out.println("tableau trier par ordre croissant:" + java.util.Arrays.toString(tableau) );

    }
    private static void trierTableauCroissant(int[] tableau){
        int n=tableau.length;
        boolean swapped;
        do {
             swapped=false;
             for (int i =1;i <n;i++){
                 if(tableau[i-1] > tableau[i]){
                     int temp=tableau[i- 1];
                     tableau[i -1]=tableau[i];
                     tableau[i]=temp;
                     swapped=true;
                 }
             }
             n--;
        }while (swapped);
    }
}