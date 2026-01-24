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
import java.util.*;

public class JavaBasics {
    public static int oddeven(int num[]) {   // return type + array
        for(int i = 0; i < num.length; i++) {
            if((num[i]) % 2 == 0) {
                System.out.println(num[i]);  
            } 
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[]  = {2,3,4,5,8,10,88,97,66,45,33,44};
        oddeven(num);
        
        
    }
}
