public class SelectionSort {
    public static void main(String[] args) {
        int aux,n, minimo;
        int[] a = new int[] { 5,2,3,1,4};
        n= a.length;
        //Seleccion
        for(int i=0; i<(n-1); i++){
            minimo = i;
            for(int j=i+1; j<n; j++){
                if(a[j] < a[minimo]){
                    minimo=j;
                }
            }
            aux = a[i];
            a[i] = a[minimo];
            a[minimo] = aux;
        }
        System.out.println("SelectionSort");
        System.out.println("Arreglo ordenado de forma creciente:");
        for(int i=0; i<(a.length); i++){
            System.out.print(a[i]+" - ");
        }
        System.out.println("");
    }
}
