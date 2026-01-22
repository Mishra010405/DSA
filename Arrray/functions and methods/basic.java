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

import java.util.*;

public class JavaBasics {

    public static boolean primenum(int n) {

        

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(primenum(7)); 
    }
}
