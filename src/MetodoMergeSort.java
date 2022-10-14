public class MetodoMergeSort {

    public int[] MergeSort(int a[], int prim, int ult) {
        int cen;
        if (prim < ult) {
            cen = (prim + ult) / 2;
            MergeSort(a, prim, cen);
            MergeSort(a, cen + 1, ult);
            mezclando(a, prim, cen, ult);
        }
        return a;
    }

    public void mezclando(int[] a, int izda, int med, int der) {
        int tmp[] = new int[a.length];
        int x, y, z;
        x = z = izda;
        y = med + 1;
        while (x <= med && y <= der) {
            if (a[x] <= a[y]) {
                tmp[z++] = a[x++];
            } else {
                tmp[z++] = a[y++];
            }
        }
        while (x <= med) {
            tmp[z++] = a[x++];
        }
        while (y <= der) {
            tmp[z++] = a[y++];
        }
        System.arraycopy(tmp, izda, a, izda, der - izda + 1);
    }
}
