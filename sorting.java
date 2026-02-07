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

// import java.util.*;

// public class JavaBasics {

//     public static void SelectionSort(int num[]) {
//         for (int i = 0; i <=num.length - 1; i++) {
//             int minpos = i;

//             for (int j = i + 1; j < num.length; j++) {
//                 if (num[j] < num[minpos]) {
//                     minpos = j;
//                 }
//             }

//             // swap
//             int temp = num[minpos];
//             num[minpos] = num[i];
//             num[i] = temp;
//         }
//     }

//     public static void Printarr(int num[]) {
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int num[] = {5, 4, 1, 2, 3};
//         SelectionSort(num);
//         Printarr(num);
//     }
// }


// InserTion Sort 

// import java.util.*;

// public class JavaBasics {

//     public static void InsertionSort(int num[]) {
//         for (int i = 1; i < num.length; i++) {
//             int curr = num[i];
//             int prev = i - 1;

//             // find correct position for curr
//             while (prev >= 0 && num[prev] > curr) {
//                 num[prev + 1] = num[prev];
//                 prev--;
//             }

//             // insert curr at correct position
//             num[prev + 1] = curr;
//         }
//     }

//     public static void Printarr(int num[]) {
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int num[] = {5, 4, 1, 2, 3};
//         InsertionSort(num);
//         Printarr(num);
//     }
// }


// Inbuilt Sor intThe aray...

// import java.util.Arrays;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int arr [] = {2,3,4,5,6,86,6};
//         // Sort the array 
//         // Arrays.sort(arr);
//         // Sort with respect to the indexs..
//         Arrays.sort(arr,0,4);


//         // Now to print the arrays..
//         for(int i=0 ; i<arr.length ; i++) {
//             // System.out.println(arr[i]+" ");
//             // System.out.println("Printexsssss ");

//             System.out.println(arr[i]+" ");
//         }
//     }
// }

// Collections : For reversing the array in sort function ...
// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         List<Integer> list = new ArrayList<>();

//         list.add(4);
//         list.add(3);
//         list.add(5);
//         list.add(7);
//         list.add(9);
//         list.add(1);
//         Collections.sort(list);
//         System.out.println(list);
//     }
// }


// Convertion from Array to arraylist..

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Integer arr[] = {2,3,4,5,6,86,6};

//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
//         Collections.sort(list);
//         System.out.println(list);
//     }
// }

// COunting Sort ....

// import java.util.*;

// public class JavaBasics {

//     public static void CountingSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;

        
//         for (int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

        
//         int count[] = new int[largest + 1];
//         for (int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }

       
//         int j = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

    
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};

//         CountingSort(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// Bubble sort  in Deceiding otder...
// import java.util.*;

// public class JavaBasics {

//     public static void BubbleSort(int num[]) {
        
//         for (int i = 0; i < num.length - 1; i++) {
//             for (int j = 0; j < num.length - 1 - i; j++) {
//                 if (num[j] < num[j + 1]) {
//                     int temp = num[j];
//                     num[j] = num[j + 1];
//                     num[j + 1] = temp;
//                 }
//             }
//         }
//     }    
//     public static void PrintArray(int num[]) {
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int num[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

//         BubbleSort(num);
//         PrintArray(num);
//     }
// }



// Selection Sort in Decending Order ....
// import java.util.*;

// public class JavaBasics {
//     public static void SelectionSort(int num[]) {
//         for(int i=0 ; i<num.length-1 ; i++) {
//             int minpos = i;
//             for(int j=i+1; j<num.length ; j++) {
//                 if(num[minpos]<num[j]) {
//                     minpos = j;
//                 }
//             }
//             // Swap
//             int temp = num[minpos];
//             num[minpos] = num[i];
//             num[i] = temp;
//         }

//     }

//     public static void Printarr(int num[]) {
//         for(int i=0 ; i<num.length ;i++){
//             System.out.println(num[i]);
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         SelectionSort(num);
//         Printarr(num);
//     }
// }


// Decreasing the Arrays of the sorts in Insertions...

// import java.util.*;

// public class JavaBasics {

//     public static void InsertionSort(int num[]) {

//         for (int i = 1; i < num.length; i++) {
//             int curr = num[i];
//             int prev = i - 1;

//             // Finding the correct position to insert
//             while (prev >= 0 && num[prev] < curr) {
//                 num[prev + 1] = num[prev];
//                 prev--;
//             }

//             // Insertion
//             num[prev + 1] = curr;
//         }
//     }

//     public static void Printarr(int num[]) {
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int num[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

//         InsertionSort(num);
//         Printarr(num);
//     }
// }




/ Non Parameterized COnstructors...

public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Shivam MISrha");
        Student s3 = new Student(34);

        System.out.println(s2.name);
        System.out.println(s3.roll);


    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor is called....");
    }   
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll= roll;
    }
}












