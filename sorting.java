import java.util.*;

public class JavaBasics {
    public static void BubbleSort(int num[]) {
        for(int i=0 ; i<num.length-1; i++) {
            for(int j=0 ; j<num.length-i-1 ; j++) {
                if(num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public static void Printarr(int num[]) {
        for(int i=0 ; i<num.length ; i++) {
        System.out.println(num[i]+ " ");
    }
    System.out.println();
    }



    public static void main(String args[]) {
        int num[] = {5, 4, 1, 3, 2};
        BubbleSort(num);
        Printarr(num);
    }
}
