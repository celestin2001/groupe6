public class Main {
    public static void main(String[] args) {
        int[] tableau={2,5,8,2,12,2,15,2};
        int elementRecherche=2;
        int occurence=compterOccurences(tableau,elementRecherche);
        System.out.println("le nbre d'occurence de" + elementRecherche +"dans le tqbleau est:" +occurence);

    }
    private static  int compterOccurences(int[]tableau,int elementRecherche){
        int occurence =0;
        for (int valeur : tableau){
            if (valeur == elementRecherche){
                occurence ++;
            }
        }
        return occurence;
    }
}