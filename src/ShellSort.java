public class ShellSort {
    public static void main(String[] args) {
        int aux,n;
        int[] a = new int[] { 5,2,3,1,4};
        n= a.length;
        //ShellSort
        for(int increment=n/2; increment>0; increment = (increment == 2) ? 1 : (int) Math.round(increment/2.2)){
            for(int i=increment; i<n; i++){
                for(int j=i; j>=increment && a[j-increment]>a[j]; j-=increment){
                    aux = a[j];
                    a[j] = a[j-increment];
                    a[j-increment] = aux;
                }
            }
        }
        System.out.println("ShellSort");
        System.out.println("Arreglo ordenado de forma creciente:");
        for(int i=0; i<(a.length); i++){
            System.out.print(a[i]+" - ");
        }
        System.out.println("");
    }
}
