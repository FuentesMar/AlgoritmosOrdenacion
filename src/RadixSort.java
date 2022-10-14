import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] a = new int[] {10,8,6,7,9,5,2,3,1,4};
        final int RADIX = 10;

        ArrayList<Integer> bucketsarray[]= new ArrayList[RADIX];
        for(int count =0;count<bucketsarray.length;count++){
            bucketsarray[count]= new ArrayList();
        }
        boolean maxDigitsLengthReached = false;
        int temp=-1,placeValue=1;
        while(!maxDigitsLengthReached){
            maxDigitsLengthReached = true;
            for(Integer element:a){
                temp = element/placeValue;
                bucketsarray[temp%RADIX].add(element);
                if(maxDigitsLengthReached && temp>0){
                    maxDigitsLengthReached = false;
                }
            }
            int x = 0;
            for(int y=0;y<RADIX;y++){
                for(Integer i:bucketsarray[y]){
                    a[x++]=i;
                }
                bucketsarray[y].clear();
            }
            placeValue = placeValue * RADIX;
        }
        System.out.println("Radix");
        System.out.println("Arreglo ordenado de forma creciente:");
        Arrays.stream(a).forEach(System.out::println);
        System.out.println("");
    }
}
