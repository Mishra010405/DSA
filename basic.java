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

import java.util.*;

public class JavaBasics {

   
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public static void main(String[] args) {
        int number = 7;

        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
