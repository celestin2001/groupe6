public class Main {
    public static void main(String[] args) {
        int[] tableau1={2,5,8,12,15};
        int[] tableau2={4,7,10,14,18};
        int[] tableauFusionne=fusionTableaTrie(tableau1,tableau2);
        System.out.println("tableau fusionne trie :" +java.util.Arrays.toString(tableauFusionne));
    }
    private static int[] fusionTableaTrie(int[] tableau1,int[] tableau2){
        int m=tableau1.length;
        int n=tableau2.length;
        int[] tableauFusionne=new int[m+n];
        int i=0,j=0,k=0;
        while (i< m && j<n){
            if (tableau1[i] <= tableau2[j]){
                tableauFusionne[k]=tableau1[i];
                i++;
            }else {
                tableauFusionne[k]=tableau2[i];
                j++;
            }
            k++;
        }
        while (j < n){
            tableauFusionne[k]=tableau2[j];
            j++;
            k++;
        }
        return  tableauFusionne;
    }
}