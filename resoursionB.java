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
//     public static void main(String args{]) {
//         int n=10;}//         printDec(n);

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

//     public static void main(String args{]) {
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

//     public static void main(String args{]) {
//         int num = 5;

//         int result = factorailofnum(num);

//         System.out.println(result);

//     }
// }


// print the sum of the n natural number...

// public class recursionBasics{
//     public static int Sumnumber(int n) {
//         if(n==0) {
//             return 0;
//         }
//         int Snm1 = Sumnumber(n-1);
//         int Snm = n+Snm1;

//         return Snm;

//     }

//     public static void main(String args{]) {
//         int n = 5;}//         System.out.println(Sumnumber(n));
//     }
// }


// Fibonacchi number...
// public class javaBasics {

//     public static int fibonacci(int num){
//         if(num == 0 || num == 1) {
//             return num;
//         }

//         int fibnm1 = fibonacci(num - 1);
//         int fibnm2 = fibonacci(num - 2);
//         int fibn = fibnm1 + fibnm2;

//         return fibn;
//     }

//     public static void main(String args{]) {
//         int num = 5;}//         int result = fibonacci(num);
//         System.out.println(result);
//     }
// }



// Check if the array is sorted or not ,.....

// public class javaBasics {

//     public static boolean issorted(int arr{], int i) {
//         if(i == arr.length - 1){
//             return true;
//         }

//         if(arr{i] > arr{i+1]){
//             return }n false;}//         }

//         return issorted(arr, i+1);
//     }

//     public static void main(String args{]) {
//         int arr{] = {1,2,3,4,5,6,7,8,9};}//         boolean result = issorted(arr, 0);

//         System.out.println(result);
//     }
// }


// public class javaBasics {

//     public static int lastOccurance(int arr[], int key, int i) {

//         // Base Case
//         if (i == arr.length) {
//             return -1;
//         }

//         // Recursive Call
//         int isfound = lastOccurance(arr, key, i + 1);

//         // If found later, return that
//         if (isfound != -1) {
//             return isfound;
//         }

//         // Check current index
//         if (arr[i] == key) {
//             return i;
//         }

//         return -1;
//     }

//     public static void main(String args[]) {

//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};

//         System.out.println(lastOccurance(arr, 5, 0)); // Output: 7
//     }
// }


// Power of X..

// public class javaBasics {

//     public static int PowerOfX(int x, int n) {

//         if(n == 0) {
//             return 1;
//         }

//         int r = x * PowerOfX(x, n-1);

//         return r;
//     }

//     public static void main(String args[]) {

//         System.out.println(PowerOfX(2,3));
//     }
// }


// Resursion Part 2////.............._--------------------------------------------------------------------------------------------------------(--------------------
// public class javaBasics {

//     public static int TillingProblem(int n) {

//         if(n == 0 || n == 1){
//             return 1;
//         }

//         // Vertical choice
//         int fnm1 = TillingProblem(n-1);

//         // Horizontal choice
//         int fnm2 = TillingProblem(n-2);

//         int totalWays = fnm1 + fnm2;

//         return totalWays;
//     }

//     public static void main(String args[]) {

//         int n = 4;

//         System.out.println(TillingProblem(n));

//     }
// }

// Total Noumber of ways...

// public class javaBasics {
//     static String digits[] = {
//         "zero", "one", "two", "three", "four",
//         "five", "six", "seven", "eight", "nine"
//     };

//     public static void PrintDigits(int n) {
//         if(n==0) {
//             return ;
//         }

//         int lastdigits = n%10;

//         // Recursive Call
//         PrintDigits(n/10);

//         // Print Digits in Words
//         System.out.println(digits[lastdigits] + " ");

//     }
//     public static void main(String args []) {
//         int n = 2019;
//         PrintDigits(n);
//     }
// }


// Length of the Strings..
// public class javaBasics {

//     public static int LengthString(String str, int i) {

//         if(i == str.length()) {
//             return 0;
//         }

//         return 1 + LengthString(str, i+1);
//     }

//     public static void main(String args[]) {

//         String str = "Shivam";

//         System.out.println(LengthString(str, 0));

//     }
// }