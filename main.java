//  import java.util.*;

// public class JavaBasics {
     
//         Scanner Sc  = new Scanner(System.in);
//         int n = Sc.nextInt();
//         int counter = 0;
//         int sum =0;
        
//         while(n>0) {
//             int digits = n%10;
//             sum = sum+digits;
//             n= n/10;

//         }

//         System.out.println("Sum is "+ sum);

        
//     }    
            
//         }

    
//  Print the prime no..

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);

//         int n = Sc.nextInt();

//         if(n==2) {
//             System.out.println("N is the prime no.");
//         }

//         else {
//             boolean isPrime = true;

//             for(int i=2 ; i<=Math.sqrt(n) ; i++) {
//                 if(n%i == 0) {
//                     isPrime = false;
// ;
//                 }

//                 if(isPrime== true) {
//                     System.out.println("N is the prime");
//                 }

//                 else {
//                     System.out.println("N is not the prime");
//                 }
//             }
//         }
//     }

// }


// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int even = 0;
//         int odd  = 0;

//         for (int i = 1; i <= n; i++) {
//             int x = sc.nextInt();

//             if (x % 2 == 0) {
//                 even += x;
//             } else {
//                 odd += x;
//             }
//         }

//         System.out.println("The sum of even numbers is: " + even);
//         System.out.println("The sum of odd numbers is: " + odd);
//     }
// }


// Pattern questions..

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {

//         for (int line = 1; line <= 4; line++) {
//             for (int ch = 1; ch <= line; ch++) {
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//     }
// }


// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {

//         for (int line = 1; line <= 4; line++) {
//             for (int ch = 1; ch <=4- line+1; ch++) {
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//     }
// }


// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);

//         // int num = Sc.nextInt();
        

//         for (int line = 1; line <= 4; line++) {
//             for (int ch = 1; ch <= line; ch++) {
//                 System.out.print(ch);
                
//             }
//             System.out.println(); 
//         }
//     }
// }


// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {

//         char ch = 'A';

//         for (int line = 1; line <= 4; line++) {
//             for (int j = 1; j <= line; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }


// public class JavaBasics {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 8; i++) {
//             for (int j = 1; j <= 8; j++) {

//                 if (i <= 3) {
//                     if (j <= i || j >= 9 - i) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 } 
//                 else if (i == 4 || i == 5) {
//                     System.out.print("*");
//                 } 
//                 else {
//                     if (j <= 9 - i || j >= i) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 }

//             }
            
//             System.out.println();
//         }
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]) {

//         int n = 9;
//         int x = 0;

//         for (int i = 1; i <= (n / 2) + 1; i++) {
//             for (int j = 1; j <= n; j++) {

//                 if (j == (n / 2) + 1 || j <= n - x) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }

//             }
//             x++;
//             System.out.println();
//         }
//     }
// }


