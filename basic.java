// import java.util.Scanner;

// public class JavaBasics {

//     public static void printHelloworld() {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a + b;
//         System.out.println("The sum is " + sum);
//     }

//     public static void main(String args{]) {
//         printHelloworld();
//     }
// }


// import java.util.Scanner;

// public class JavaBasics {

//     public static int calculate_sum(int a, int b) {
//         int sum =a+b;
//         return sum;
        
        
//     }

//     public static void main(String args{]) {
//          Scanner sc = new Scanner(System.in);

//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
        
//         int sum = calculate_sum(23,34);
//         System.out.println("The sum is "+sum);
//     }
// }



// Swappin a two number..


// import java.util.Scanner;

// public class JavaBasics {

//     public static int calculate_sum(int n) {
//         int fact=1;
//         for(int i=1; i<=n ; i++) {
//             fact = fact*i;
//         }

//         return fact;
//     }

//     public static void main(String args{]) {
//         // Scanner Sc = new Scanner(String  {] args)

//         // int n = Sc.nextInt();
//         int shiv = calculate_sum(5);
//         System.out.println("The factorial of the number is "+ shiv);

//     }
// }


// Binomial Coefficient ...

// import java.util.*;

// public class JavaBasics {

//     public static int factorialnum(int n) {
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static int Bincoeff(int n, int r) {
//         int fact_n = factorialnum(n);
//         int fact_r = factorialnum(r);
//         int fact_nmr = factorialnum(n - r);

//         return fact_n / (fact_r * fact_nmr);
//     }

//     public static void main(String args{]) {
//         System.out.println(Bincoeff(5, 2)); 
//     }
// }


// functions overloading with parameters....

// import java.util.*;

// public class JavaBasics {

//     public static boolean primenum(int n) {

        

//         if (n == 2) {
//             return true;
//         }

//         for (int i = 2; i <= n - 1; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String args[]) {
//         System.out.println(primenum(7)); 
//     }
// }


//  decimal to the range converter..

// import java.util.*;

// public class JavaBasics {

//     public static void DectoBin(int bin_num) {
//         int pow = 0;              
//         int dec_num = 0;
//         int original = bin_num;  

//         while (bin_num > 0) {
//             int lastdigit = bin_num % 10;
//             dec_num = dec_num + (lastdigit * (int) Math.pow(2, pow));
//             pow++;
//             bin_num = bin_num / 10;
//         }

//         System.out.println("Decimal No " + original + " = " + dec_num);
//     }

//     public static void main(String args[]) {
//         DectoBin(111);
//     }
// }


//  decimal to Binary ...

// import java.util.*;

// public class JavaBasics {
//     public static void DectoBin(int n) {
//         int pow = 0;
//         int mynum = n;
//         int bin_num = 0;

//         while (n > 0) {
//             int rem = n % 2;
//             bin_num = bin_num + (rem * (int) Math.pow(10, pow));
//             pow++;
//             n = n / 2;
//         }

//         System.out.println("Binary num of " + mynum + " is " + bin_num);
//     }

//     public static void main(String args[]) {
//         DectoBin(12);
//     }
// }


// Average of the 3 numbers..

// import java.util.*;

// public class JavaBasics {

   
//     public static boolean isEven(int num) {
//         if (num % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }

    
//     public static void main(String[] args) {
//         int number = 7;

//         if (isEven(number)) {
//             System.out.println(number + " is Even");
//         } else {
//             System.out.println(number + " is Odd");
//         }
//     }
// }


// Polindrom of the questions ...

// import java.util.*;

// public class JavaBasics {

//     public static boolean isPalindrome(int num) {
//         int original = num;
//         int rev = 0;

//         while (num > 0) {
//             int rem = num % 10;
//             rev = rev * 10 + rem;
//             num = num / 10;
//         }

//         if (original == rev) {
//             return true;
//         } else {
//             return false;
//         }
//     }

    
//     public static void main(String[] args) {
//         int number = 121;

//         if (isPalindrome(number)) {
//             System.out.println(" is a Palindrome");
//         } else {
//             System.out.println(" is NOT a Palindrome");
//         }
//     }
// }


// import java.util.*;

// public class JavaBasics {
//     public static void Patterns(int rows, int cols) {
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= cols; j++) {
//                 if (i == 1 || i == rows || j == 1 || j == cols) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); 
//         }
//     }

//     public static void main(String args[]) {
//         Patterns(4, 5);
//     }
// }

// O & 1 Triangle ...

// import java.util.*;

// public class JavaBasics {
//     public static void Hallo_parammid(int n) {
        
//         for(int i = 1; i <= n; i++) {
           
//             for(int j = 1; j <= i; j++) {   
//                 if((i + j) % 2 == 0) {   
//                     System.out.print(1);  
//                 }
//                 else {
//                     System.out.print(0);  
//                 }
//             }
//             System.out.println(); 
//         }             
//     }

//     public static void main(String args[]) {
//         Hallo_parammid(5);  
//     }
// }


// Diamon Printing 

// import java.util.* ;

// public class JavaBasics {
//     public static void DIamonprin(int n){

//         // Upper half
//         for(int i = 1; i <= n; i++) {

//             // space 
//             for(int j = 1; j <= n - i; j++){  
//                 System.out.print(" ");        
//             }

//             // Stars
//             for(int j = 1; j <= 2 * i - 1; j++){  
//                 System.out.print("*");           
//             }

//             System.out.println();
//         }

//         // Lower half
//         for(int i = n - 1; i >= 1; i--) {   

//             // space 
//             for(int j = 1; j <= n - i; j++){  
//                 System.out.print(" ");        
//             }

//             // Stars
//             for(int j = 1; j <= 2 * i - 1; j++){  
//                 System.out.print("*");           
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         DIamonprin(5);
//     }
// }


// Geomatric progression ....

// import java.util.Scanner;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         int a = sc.nextInt();   
//         int r = sc.nextInt();   
//         int n = sc.nextInt();   

//         int term = a;

//         for (int i = 1; i <= n; i++) {
//             System.out.print(term + " ");
//             term = term * r;
//         }
//     }
// }
