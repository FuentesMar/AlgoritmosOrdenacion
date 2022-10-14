
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respuesta;
        System.out.println("Que quick quieres usar");
        System.out.println("1. Central");
        System.out.println("2. Inicial");
        respuesta = sc.nextInt();

        if(respuesta == 1){
            int[] a = new int[] { 5,2,3,1,4};
            MetodoQuickSortCentral Objeto = new MetodoQuickSortCentral();
            Objeto.OrdenarCentralQuickSort(a, 0, a.length-1);
            System.out.println("QuickSort (Pivote central)");
            System.out.println("Arreglo ordenado:");
            for(int i=0; i<(a.length); i++){
                System.out.print("["+a[i]+"]");
            }
            System.out.println("");
        }
        if(respuesta == 2){
            int[] a = new int[] { 5,2,3,1,4};
            MetodoQuickSortInicial Objeto = new MetodoQuickSortInicial();
            Objeto.OrdenarQuickSort(a);
            System.out.println("QuickSort (Pivote inicial)");
            System.out.println("Arreglo ordenado de forma creciente:");
            for(int i=0; i<(a.length); i++){
                System.out.print( "["+a[i]+"]");
            }
            System.out.println("");
        }
        if(respuesta != 1 && respuesta != 2 ){
            System.out.println("La opcion que usted eligio no se encuentra disponible ");
        }
    }
}
