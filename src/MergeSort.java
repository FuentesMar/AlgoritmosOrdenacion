public class MergeSort {
    public static void main(String[] args) {
        //Declarar el objeto.
        MetodoMergeSort objeto = new MetodoMergeSort();
        int[] a = new int[] { 5,2,3,1,4};
        //Declaracion de varibles
        int inicio=0;
        int fin=a.length-1;
        //Ejecucion con retorno de valor
        a=objeto.MergeSort(a, inicio, fin);
        //Print array
        System.out.println("MergeSort");
        System.out.println("Arreglo ordenado de forma creciente:");
        for(int i=0; i<(a.length); i++){
            System.out.print("["+a[i]+"]");
        }
        System.out.println("");
    }
}
