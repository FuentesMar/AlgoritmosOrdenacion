public class BubbleSort {
    public static void main(String[] args) {
    int aux,n;
    int[] a = new int[] { 5,2,3,1,4};
    n= a.length;
    //Burbuja
    for(int i=0; i<(n-1); i++){
        for(int j=0; j<(n-1); j++){
            if(a[j] > a[j+1]){
                aux = a[j];
                a[j] = a[j+1];
                a[j+1] = aux;
            }
        }
    }
    System.out.println("Burbuja");
    System.out.println("Arreglo ordenado de forma creciente:");
    for(int i=0; i<(a.length); i++){
        System.out.print("["+a[i]+"]");
    }
    System.out.println("");
}
}
