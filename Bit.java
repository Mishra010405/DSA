//  Odd Number...

// public class javaBasics {
//     public static void OddEven(int n) {
//         int bitmask = 1;
//         if((n&bitmask) == 0) {
//             System.out.println("Even No");
//         }
//         else {
//             System.out.println("Odd No.");
//         }

//     }

//     public static void main(String args[]) {
//         OddEven(23);
//         OddEven(24);

//     }
// }


// public class JavaBasics {
//     public static int  getIth(int n , int i) {
//         int bitmask = 1<<i;
//         if((n & bitmask) == 0) {
//             return 0;
//         }
//         else {
//             return 1;
//         }

//     }
//     public static void main(String args[]) {
//             System.out.println(getIth(10,2));
//     }
// }

// setIth Bit..

// public class JavaBasics {
//     public static int setIth(int n , int i) {
//         int bitmask = 1<<i ; 
//         return n & bitmask;
//     }
//     public static void main(String args[]) {
//         System.out.println(setIth(10,2));
//     }
// }


// Clear Ith Bit...

// public class JavaBasics {
//     public static int setIth(int n , int i) {
//         int bitmask = ~(1<<i ); 
//         return n & bitmask;
//     }
//     public static void main(String args[]) {
//         System.out.println(setIth(10,2));
//     }
// }


// Update ith Bit..

// public class javaBasics {

//     public static int updateBit(int n, int i, int newBit) {
//         // Step 1: clear ith bit
//         int bitMask = ~(1 << i);
//         n = n & bitMask;

//         // Step 2: set new bit
//         return n | (newBit << i);
//     }

//     public static void main(String args[]) {
//         int n = 10; // 1010
//         int i = 2;  // index
//         int newBit = 1;

//         int result = updateBit(n, i, newBit);
//         System.out.println(result);
//     }
// }

// Clear last ith Bits...

// public class javaBasics {
//     public static int clearIthLastBit(int n , int i) {
//         int bitmask = (~0)<<i;
//         return n & bitmask;
//     }

//     public static void main(String args []) {
//         System.out.println(clearIthLastBit(15 , 2))
//     }
// }


// Check if the number is power of two or not ...

// public class javaBasics {
//     public static boolean isPowerofTwo(int n) {
//         return (n & (n-1)) == 0;

//     }

//     public static void main(String args[]) {
//         System.out.println(isPowerofTwo(15));

//     }
// }

// Count set Bits in the number...

// public class javaBasics {

//     public static int CountSetBits(int n) {
//         int count = 0;

//         while(n > 0) {
//             if((n & 1) != 0) {
//                 count++;
//             }
//             n = n >> 1;
//         }

//         return count;
//     }

//     public static void main(String args[]) {
//         System.out.println(CountSetBits(13));
//     }
// }

// Fast Expo Integers...

// public class javaBasics {
//     public static int fastExpo(int a, int n) {
//         int ans = 1;

//         while(n>0) {
//             if((n & 1) != 0) { // LSB
//                 ans = ans * a;
//             }
//             a = a*a;
//             n = n>>1;
//         }
//         return ans;
//     }

//      public static void main(String args[]) {
//         System.out.println(fastExpo(3,5));
//     }
// }


//  What is the value of x^x for any value of x?
// Ans: The awnswer of the value of the x^x will be of the x will be zero..

// public class javaBasics {
//     public static void main(String args[]) {
//         int x = 3 , y = 4;
//         System.out.println("Befor Swap : "+x + " and y = " + y);

//         // Swapping Using xor
//         x = x^y;
//         y = x^y;
//         x = x ^ y;
//         System.out.println("After swap: x = " + x + " and y = " + y);
        
//     }
// }

// The Expression negation of the x.

// public class Solution {
// public static void main(String[] args) {
// int x = 6;
// System.out.println(x + " + " + 1 + " is " + -~x);
// x = -4;
// System.out.println(x + " + " + 1 + " is " + -~x);
// x = 0;
// System.out.println(x + " + " + 1 + " is " + -~x);
// }
// }

// Upperclass COnverter......

// public class javaBasics {
//     public static void main(String args[]) {
//         // Convert Upper Case to Lower Case..
//         for(char ch = 'A' ; ch<= 'Z' ; ch++) {
//             System.out.println((char) (ch | ' '));
//         }
        
//     }
// }


// lower to upper case.....
// public class javaBasics {
//     public static void main(String args[]) {
//         String str = "hello World";

//         String result = str.toUpperCase();
//         System.out.println(result); 
//     }
// }

