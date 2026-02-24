// Print the number from 10 to n...

// public class recursionBasics{
//     public static void printDec(int n) {
//         if(n==1) {
//             System.out.println(n+" ");
//             return;

//         }
//         System.out.println(n+" ");
//         printDec(n-1);
//     }
//     public static void main(String args[]) {
//         int n=10;
//         printDec(n);

//     }
// }



// Print the number in increasing order...

// public class recursionBasics {

//     public static void IncreaseNum(int num) {

//         if(num == 10) {
//             System.out.println(num + " ");
//             return;
//         }

//         System.out.println(num + " ");
//         IncreaseNum(num + 1);
//     }

//     public static void main(String args[]) {

//         int num = 1;
//         IncreaseNum(num);

//     }
// }


// Factorial on the number....

// public class recursionBasics {

//     public static int factorailofnum(int num) {

//         if(num == 0) {
//             return 1;  
//         }

//         int fnm1 = factorailofnum(num - 1);
//         int fn = num * fnm1;

//         return fn;
//     }

//     public static void main(String args[]) {

//         int num = 5;

//         int result = factorailofnum(num);

//         System.out.println(result);

//     }
// }

