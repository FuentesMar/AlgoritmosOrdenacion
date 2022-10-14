public class InsertionSort {
    public static void main(String[] args) {
        int aux,n,pos;
        int[] a = new int[] { 5,2,3,1,4};
        n= a.length;
        //Inserccion
        for(int i=0; i<n; i++){
            pos = i;
            aux = a[i];

            while((pos>0) && (a[pos-1]> aux)){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos] = aux;
        }
        System.out.println("InsertionSort");
        System.out.println("Arreglo ordenado de forma creciente:");
        for(int i=0; i<(a.length); i++){
            System.out.print("["+a[i]+"]");
        }
        System.out.println("");
    }
}
