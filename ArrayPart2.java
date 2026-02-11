// // Print the maximum subarray Sum ...
// import java.util.*;

// public class JavaBasics{
//     public static void subarraysum(int num[]) {
//         int max_sum = Integer.MIN_VALUE; 
//         for(int i=0; i<num.length ; i++) {
//             int start=i;
//             for(int j=i ; j<num.length ; j++) {
//                 int end = j;
//                 int crr_sum = 0;
//                 for(int k=start ; k<=end ; k++) {
//                     crr_sum+= num[k];
//                 }
//                 System.out.println(crr_sum);
//                 if(max_sum<crr_sum) {
//                     max_sum=crr_sum;
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]) {
//         int num[] = {2,4,6,8,10,12,14,16};
//         subarraysum(num);
//     }
// }

// Kaddens algorithms..

// import java.util.*;

// public class JavaBasics {
//     public static void kaddensalgo(int num[]) {
//         int crr_sum=0;
//         int max_sum = Integer.MIN_VALUE;
//         for(int i=0 ; i<num.length ; i++) {
//             crr_sum += num[i];
//             if(crr_sum<0) {
//                 crr_sum=0;
//             }
//             max_sum = Math.max(crr_sum,max_sum);
//         }
//         System.out.println("Our max Subarray is sum "+max_sum);
//     }
//     public static void main(String args[]) {
//         int num[] = {5, -3, 8, -1, 0, 12, -7, 4, -9, 6};
//         kaddensalgo(num);

//     }
// }


// // trapped Rain Water ...

// import java.util.*;

// public class JavaBasics {

//     public static int Trapped_Water(int height[]) {
//         int n = height.length;

//         // left max boundary
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for(int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(height[i], leftmax[i - 1]);
//         }

//         // right max boundary
//         int rightmax[] = new int[n];
//         rightmax[n - 1] = height[n - 1];
//         for(int i = n - 2; i >= 0; i--) {
//             rightmax[i] = Math.max(height[i], rightmax[i + 1]);
//         }

//         int trappedwater = 0;

//         // calculate trapped water
//         for(int i = 0; i < n; i++) {
//             int waterlevel = Math.min(leftmax[i], rightmax[i]);
//             trappedwater += waterlevel - height[i];
//         }

//         return trappedwater;
//     }

//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 3, 2, 5};

//         System.out.println("The trapped water is " + Trapped_Water(height));
//     }
// }


// Buy and sell the stocks....


// import java.util.*;

// public class JavaBasics {

//     public static int Buyandsell(int price[]) {
//         int buyprice = Integer.MAX_VALUE;  
//         int maxprofit = 0;

//         for(int i = 0; i < price.length; i++) {
//             if(price[i] > buyprice) {
//                 int profit = price[i] - buyprice;
//                 maxprofit = Math.max(maxprofit, profit);
//             } else {
//                 buyprice = price[i];
//             }
//         }
//         return maxprofit;
//     }

//     public static void main(String args[]) {
//         int price[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(Buyandsell(price));
//     }
// }

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct..

// import java.util.*;

// public class JavaBasics {
//     public static boolean  repeatelement(int num[]){
//         for(int i=0 ; i<num.length ; i++ ) {
//             if(num[i] == num[i+1]){
//                 return true;
//             }
//             else {
//                 return false;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         int num[] = {1, 2, 3, 3, 4, 3, 2, 4, 2};
//         System.out.println("The repeated Element will be on the ways"+repeatelement(num));

//     }
// }

