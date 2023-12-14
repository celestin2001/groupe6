public class Main {
    public static void main(String[] args) {
       int[]tableau={5,12,8,3,20,7};
       int PlusGrande=trouverPlusGrandeValeur(tableau);
       System.out.println("le tableau:" +java.util.Arrays.toString(tableau));
        System.out.println("la plus grande valeur dans le tableau est:" + PlusGrande);

    }
    private static  int trouverPlusGrandeValeur(int[]tableau){
        if(tableau.length ==0){
            throw new IllegalArgumentException("le tableau est vide.");

        }
        int max=tableau[0];
        for (int valeur: tableau){
            if (valeur > max){
                max =valeur;
            }
        }
        return max;
    }
}