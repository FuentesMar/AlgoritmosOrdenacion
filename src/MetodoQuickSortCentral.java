public class MetodoQuickSortCentral {
    public void OrdenarCentralQuickSort(int[] a,int prim, int ult){
        int i, j, piv, aux;
        i = prim;
        j = ult;
        piv=a[(prim+ult)/2];
        do{
            while(a[i]<piv){
                i++;
            }
            while(a[j]>piv){
                j--;
            }
            if(i<=j){
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(prim<j){
            OrdenarCentralQuickSort(a,prim,j);
        }
        if(i<ult){
            OrdenarCentralQuickSort(a,i,ult);
        }
    }
}
