public class MetodoQuickSortInicial {
    public void OrdenarQuickSort(int[] a) {
        a = QuickSort1(a);
    }

    public int[] QuickSort1(int numeros[]) {
        return QuickSort2(numeros, 0, numeros.length - 1);
    }

    public int[] QuickSort2(int numeros[], int izq, int der) {
        if (izq >= der) {
            return numeros;
        }
        int i = izq, d = der;
        if (izq != der) {
            int pivote, aux;
            pivote = izq;
            while (izq != der) {
                while (numeros[der] >= numeros[pivote] && izq < der)
                    der--;
                while (numeros[izq] < numeros[pivote] && izq < der)
                    izq++;
                if (der != izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                }
            }
            if (izq == der) {
                QuickSort2(numeros, i, izq - 1);
                QuickSort2(numeros, izq + 1, d);
            }
        }
        else
            return numeros;
        return numeros;
    }
}
