public class Intercambio {
    public static void main(String[] args) {
        int aux,n;
        int[] a = new int[] { 5,2,3,1,4};
        n= a.length;
        //Intercambio
        for(int i=0; i<(n-1); i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        System.out.println("Intercambio");
        System.out.println("Arreglo ordenado de forma creciente:");
        for(int i=0; i<(a.length); i++){
            System.out.print("["+a[i]+"]");
        }
        System.out.println("");
    }
}
