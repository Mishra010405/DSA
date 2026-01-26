//  BUBBLE SORT
// import java.util.*;

// public class JavaBasics {
//     public static void BubbleSort(int num[]) {
//         for(int i=0 ; i<num.length-1; i++) {
//             for(int j=0 ; j<num.length-i-1 ; j++) {
//                 if(num[j] > num[j+1]) {
//                     int temp = num[j];
//                     num[j] = num[j+1];
//                     num[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void Printarr(int num[]) {
//         for(int i=0 ; i<num.length ; i++) {
//         System.out.println(num[i]+ " ");
//     }
//     System.out.println();
//     }



//     public static void main(String args[]) {
//         int num[] = {5, 4, 1, 3, 2};
//         BubbleSort(num);
//         Printarr(num);
//     }
// }


// Selection Sort 

import java.util.*;

public class JavaBasics {

    public static void SelectionSort(int num[]) {
        for (int i = 0; i <=num.length - 1; i++) {
            int minpos = i;

            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[minpos]) {
                    minpos = j;
                }
            }

            // swap
            int temp = num[minpos];
            num[minpos] = num[i];
            num[i] = temp;
        }
    }

    public static void Printarr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int num[] = {5, 4, 1, 2, 3};
        SelectionSort(num);
        Printarr(num);
    }
}
