// public class JavaBasics {
//     public static void main(String args[]) {

//         int num = 5;

//         int onesComp = ~num;

//         System.out.println("Number: " + num);
//         System.out.println("1's Complement: " + ~5);
//     }
// }


// Conversion of the Binary 1's into Compliments...

// public class JavaBasics {
//     public static String onesComp(String bin) {
//         String result= "";
//         for(int i=0 ; i<bin.length() ; i++) {
//             if(bin.charAt(i) == '0') {
//                 result += 1;
//             }
//             else {
//                 result += 0;
//             }
//         }
        
//         return result;
//     }

//     public static void main(String args []) {
//         String bin = "10101";
//         System.out.println(onesComp(bin));

//     }
// }


// Check if the number is Odd or Even....

// import java.util.*;

// public class JavaBasics {

//     public static void Oddeven(int num) {
//         if (num % 2 == 0) {
//             System.out.println("The number is Even");
//         } else {
//             System.out.println("The number is Odd");
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         Oddeven(num);
//     }
// }

// Another Method to Check Even or Odd number....

// import java.util.*;

// public class JavaBasics {
//     public static void OddEvenNum(int num) {
//         int bitmask = 1;
//         if((num & bitmask)==0) {
//             System.out.println("Number is the Even number");
//         }
//         else {
//             System.out.println("Number is the Odd number");
//         }
//     }

//     public static void main(String args[]) {
//         OddEvenNum(3);
//         OddEvenNum(4);
//         OddEvenNum(6);
//         OddEvenNum(7);
//     }
// }


// Program to get ith Bit...


// public class JavaBasics {
//     public static int getSetBit(int num , int i) {
//         int bitmask = 1<<i;
//         if((num & bitmask) == 0) {
//             return 0;
//         }
//         else {
//             return 1;
//         }

//     }
//     public static void main(String args[]) {
//         System.out.println(getSetBit(12,2));
//     }
// }

// Set the ith bit... 

// public class JavaBasics {
//     public static int SetIthbit(int num, int i){
//         int bitmask = 1<<i;
//         if((num | bitmask) == 0) {
//             return 0;
//         }
//         else {
//             return 1;
//         }

//     }

//     public static void main(String args []) {
//         System.out.println(SetIthbit(13,2));

//     }

// }


// Clear ith bit ...

// public class JavaBasics {
//     public static int ClearIthBit(int num , int i) {
//         int bitmask = ~(1<<i);
//         return num & bitmask;

//     }
//     public static void main(String args[]) {
//         System.out.println(ClearIthBit(13,2));

//     }
// }


// Clear Range of the bits...

// public class JavaBasics{

//     public static int clearBitRange(int n , int i , int j) {
//         int a = ((~0)<<(j+1));
//         int b = ((1<<i)-1);
//         int bitmask  = a|b;
//         return n & bitmask;

//         }
//     public static void main(String args[]) {
//         System.out.println(clearBitRange(13,2,2));
//     }
//     }   


// Check if the number is Power of two or not...

// public class JavaBasics {

//     public static boolean isPower(int num) {

//         return (num & (num - 1)) == 0;
//     }

//     public static void main(String args[]) {

//         System.out.println(isPower(15));
//     }
// }


// Count Set bits in a number...

// public class JavaBasics {
//     public static int CountsetBits(int n) {
//         int count=0 ; 
//         while(n>0) {
//             if((n&1) != 0) {
//                 count++;
//             }
//             nn>>1;
//         }

//     }
//     public static void main(String args[]) {
//         System.out.println(CountsetBits(13));
//     }
// }


// Fast Exponential.....

// public class JavaBasics {
//     public static int FastExponential(int a, int n) {
//         int ans = 1;

//         while(n>0) {
//             if((n & 1) != 0) { // Check LSB
//                 ans = ans *a;
//             }
//             a = a*a;
//             n= n>>1;
//         }

//         return ans;
//     }

//     public static void main(String args []) {
//         System.out.println(FastExponential(3,5))

//     }
// }


// Update the ith bit... 

// public class JavaBasics {
//     public static int SetIthbit(int num , int i) {
//         int bitmask = 1<<i ; 
//         return num | bitmask;
//     }

//     public static int ClearIthBit(int num , int i) {
//         int bitmask =1 ; 
//         return num & bitmask;
//     }

//     public static int UpdateIthBit(int num , int i , int newBit ){
//         if(newBit ==0) {
//             return SetIthbit(num , i);
//         }

//         else {
//             return ClearIthBit(num , i);
//         }
//     }

//     public static void main(String args[]) {
//         int num = 13;
//         System.out.println("Set Bit " + SetIthbit(num,  1));
//         System.out.println("Clear Bit " + ClearIthBit(num, 2));
//         System.out.println("Updated Bit " + UpdateIthBit(num, 2 , 0));

//     }
// }



// Clear Last ith Bit ...

// public class JavaBasics {
//     public static int ClearLastBit(int n , int i) {
//         int bitmask  = (~0)<<i;
//         return n & bitmask;
//     }
//     public static void main(String args []) {
//         System.out.println(ClearLastBit(15,2));

//     }
    
// }


// Clear Range Of the Bits...