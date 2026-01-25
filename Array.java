// Tart anan array..

// Initiallise an Array...
// datatype arrayName[] = new datatype[size];


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
// int marks[] = new int[20];

// int number[] = {23,34,45,65};
// String fruits[] = {"Banana", "Mango", "Orange"};
// System.out.println(fruits[0]);
// System.out.println(fruits[1]);
// System.out.println(fruits[2]);
// System.out.println(fruits.length);
//     }
// }

// inpurt of the array..

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         int marks[] = new int[1000];
//         Scanner Sc= new Scanner(System.in);
//         // Take Input
//         marks[0] = Sc.nextInt();
//         marks[1] = Sc.nextInt();
//         marks[2] = Sc.nextInt();
//         marks[3] = Sc.nextInt();

//         System.out.println("The Marks of First Subject is "+ marks[0]);
//         System.out.println("The Marks of First Subject is "+ marks[1]);
//         System.out.println("The Marks of First Subject is "+ marks[2]);
//         System.out.println("The Marks of First Subject is "+ marks[3]);
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void Updatemarks(int  marks[]){
//         for(int i=0 ; i<marks.length ; i++){
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = {98,99,87};
//         Updatemarks(marks);
//     // now to change the marks
//     for(int i=0 ; i<marks.length ; i++) {
//         System.out.println(marks[i]);
//     }
//     System.out.println();

//     }
// }


// Linear Serarch for the sorting 

// import java.util.*;

// public class JavaBasics {
// // return type fix
//     public static int Linear_Search(int number[], int key) {  
//         for(int i = 0; i < number.length; i++) {  
//             if(number[i] == key){
//                 return i;
//             }
//         }
//         return -1;  
//     }

//     public static void main(String args[]){ 
//         int number[] = {2,4,5,6,7,8,4,9,5};
//         int key = 9;

//         int index = Linear_Search(number, key);
//         System.out.println(Linear_Search(number,key));

//         if(index == -1) {
//             System.out.println("Not Found");
//         }
//         else {
//             System.out.println("Found at index " + index);
//         }
//     }
// }


// 
// import java.util.*;

// public class JavaBasics {
//     public static int oddeven(int num[]) {   // return type + array
//         for(int i = 0; i < num.length; i++) {
//             if((num[i]) % 2 == 0) {
//                 System.out.println(num[i]);  
//             } 
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int num[]  = {2,3,4,5,8,10,88,97,66,45,33,44};
//         oddeven(num);
        
        
//     }
// }


// Binary Search

// import java.util.*;

// public class JavaBasics {
//     public static int BinarySearch(int number[], int key) {   
//         int start = 0;
//         int end = number.length - 1;

//         while(start <= end) {  
//             int mid = (start + end) / 2;

//             if(number[mid] == key) {
//                 return mid;
//             }
//             if(number[mid] > key) {
//                 end = mid - 1;
//             }
//             else {  
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int number[] = {2,4,6,8,10,12,14};
//         int key = 10;
//         System.out.println("Index for key is " + BinarySearch(number, key));
//     }
// }

// Reverse An array ...

// import java.util.*;

// public class JavaBasics {
//     public static int[] ReverseanArray(int num[]) {   // return array
//         int first = 0; 
//         int last = num.length - 1;

//         while(first < last) {
//             // swap
//             int temp = num[last];
//             num[last] = num[first];
//             num[first] = temp;
//             first++;
//             last--;
//         }
//         return num;  
//     }

//     public static void main(String args[]) {
//         int num[] = {2,4,6,8,10};
//         System.out.println(Arrays.toString(ReverseanArray(num)));
//     }
// }


// Give me the code of Second Largest  in an array ; 

// import java.util.*;

// public class JavaBasics {
//     public static int SecondLargest(int num[]) {  
//         int largest = Integer.MIN_VALUE;         
//         int second_largest = Integer.MIN_VALUE;   
        
//         for(int i = 0; i < num.length; i++) {     
//             if(largest < num[i]) {
//                 second_largest = largest;
//                 largest = num[i];
//             }
//             else if(num[i] > second_largest && num[i] != largest) {
//                 second_largest = num[i];
//             }
//         }
        
//         return second_largest;   
//     }

//     public static void main(String args[]) {
//         int num[] = {2,4,6,8,10};
//         System.out.println(SecondLargest(num));
//     }
// }


// Subarray of the array....

// import java.util.*;

// public class JavaBasics {
//     public static void PrintSubarray(int number []) {
//        for(int i=0 ; i<number.length ; i++) {
//         int start = i;
//         for(int j= i ; j<number.length ; j++) {
//             int end = j;
//             for(int k = start ; k<=end ; k++) {
//                 System.out.println(number[k]+" ");
//             }
//             System.out.println();
//         }
//        }
       
//     } 
//     public static void main(String args []) {
//         int number[] = {2,4,6,8,10};
//         PrintSubarray(number);
//     }      
// }

// Check two arrays are equal ..

// import java.util.*; 

// public class JavaBasics {

//     public static boolean checkequalArray(int num1[], int num2[]) {   

//         if(num1.length != num2.length) {  
//             return false;
//         }

//         for(int i = 0; i < num1.length; i++) {
//             if(num1[i] != num2[i]) {  
//                 return false;
//             }
//         }

//         return true;  
//     }

//     public static void main(String args[]) {
//         int num1[] = {2,4,5,6,7,8};
//         int num2[] = {2,4,5,6,7,7,9};

//         System.out.println(checkequalArray(num1, num2));  
//     }
// }



// Check if the array is sorted on not..

// import java.util.*;

// public class   JavaBasics{
//     public static boolean SortanArray(int num[]) {
//         for(int i=0 ; i<num.length ; i++) {
//             if(num[i]< num[i+1]) {
//                 return true;
//             }
            
//         }
//         return false;
        
//     }
//     public static void main(String args[]) {
//         int num[] = {2,3,4,5,6,7,8,9};
//         System.out.println("The array is sorted "+SortanArray(num));
//     }
// }

//  count the adjencent of the array...
// import java.util.*;

// public class JavaBasics {

//     public static int Countersma(int num[]) {  
//         int count = 0;
//         for(int i = 0; i < num.length - 1; i++) {
//             if(num[i] == num[i + 1]) {
//                 count++;
//             }
//         }
//         return count;  
//     }

//     public static void main(String args[]) {
//         int num[] = {2,3,2,2,2,4,5,6,7,8,9};
        
//         System.out.println(
//             "The count of same adjacent numbers is " + Countersma(num)
//         );
//     }
// }


// import java.util.*;

// public class JavaBasics {

//     public static void replacememnet(int num[]) {
//         for(int i = 0; i < num.length; i++) {
//             if(num[i] < 0) {
//                 num[i] = 0;
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int num[] = {2,3,-2,4,-5,6,7,-8,9};

//         replacememnet(num);

        
//         System.out.println(Arrays.toString(num));
//     }
// }


