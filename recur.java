// Check if the array is sorted or not ,.....

// public class javaBasics {

//     public static boolean issorted(int arr[], int i) {

//         if(i == arr.length - 1){
//             return true;
//         }

//         if(arr[i] > arr[i+1]){
//             return false;
//         }

//         return issorted(arr, i+1);
//     }

//     public static void main(String args[]) {
//         int arr[] = {0,1,2,3,4,5,6,7,8,9};

//         boolean result = issorted(arr, 0);

//         System.out.println(result);
//     }
// }

// first occurance..

// public class javaBasics {

//     public static int firstoccur(int arr[], int i) {
//         int key = 5;

//         if (i == arr.length) {
//             return -1;
//         }

//         if (arr[i] == key) {
//             return i;
//         }

//         return firstoccur(arr, i + 1);
//     }

//     public static void main(String args[]) {
//         int arr[] = {2,4,5,6,7,8,9,34,5,6};

//         int result = firstoccur(arr, 0);

//         System.out.println(result);
//     }
// }


// last occurance ...

// public class javaBasics {

//     public static int lastoccurance(int arr[], int i) {
//         int key = 5;

//         // Base condition
//         if (i == arr.length) {
//             return -1;
//         }

//         int isfound = lastoccurance(arr, i + 1);

//         if (isfound != -1) {
//             return isfound;
//         }

//         if (arr[i] == key) {
//             return i;
//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         int arr[] = {2,4,5,6,7,8,9,34,5,6};

//         int result = lastoccurance(arr, 0);

//         System.out.println(result);
//     }
// }


// Power of x to the power of the n....

// public class javaBasics {
//     public static int powerofx(int x , int n) {
//         if(n==1) {
//             return x;
//         }
//         int XNM1 = powerofx(x,n-1);
//         int XN = x * XNM1;
//         return XN;

//     }
//     public static void main(String args[]) {
//         int result = powerofx(2,4);
//         System.out.println(result);
//     }
// }

// Tilling Problems...

// public class javaBasics {
//     public static int TillingProblem(int n) {
//         // BaseCase..
//         if(n==0 || n==1) {
//             return 1;
//         }
//         // Kaam 
//         // Horizontally Choice..
//         int fnm2 = TillingProblem(n-2);
//         // Vertically Choice..
//         int fnm1  = TillingProblem(n-1);
//         // Total Ways ..
//         int fn = fnm1+fnm2;
//         return fn;

//     }

//     public static void main(String args[]) {
//         int result = TillingProblem(10);
//         System.out.println(result);
//     }
// }


// Remove Duplicates in the String...

// public class javaBasics {

//     public static void RemoveDuplicate(String str, int idx, StringBuilder newstr, boolean[] map) {

//         if (idx == str.length()) {
//             System.out.println(newstr);
//             return;
//         }

//         char currChar = str.charAt(idx);

//         if (map[currChar - 'a'] == true) {
//             // duplicate
//             RemoveDuplicate(str, idx + 1, newstr, map);
//         } 
//         else {
//             map[currChar - 'a'] = true;
//             RemoveDuplicate(str, idx + 1, newstr.append(currChar), map);
//         }
//     }

//     public static void main(String args[]) {
//         String str = "appnnacollege";

//         RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }

// Friends pair problemm...

// public class javaBasics {
//     public static int FriendsPair(int n) {
//         if(n==1 || n==2) {
//             return n;
//         }
//         // Kaaam
//         // Single
//         int fnm1  = FriendsPair(n-1);

//         // Pair
//         int fnm2 = FriendsPair(n-2);
//         int pairways = (n-1)*fnm2;

//         int Totalways = fnm1+ pairways;
//         return Totalways;
//     }

//     public static void main(String args[]) {
//         System.out.println(FriendsPair(3));

//     }
// }


// Binary String Code...

// public class javaBasics {

//     public static void printBinString(int n, int lastplace, StringBuilder str) {

//         // Base case
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }

        
//         str.append("0");
//         printBinString(n - 1, 0, str);
//         str.deleteCharAt(str.length() - 1); 

        
//         if (lastplace == 0) {
//             str.append("1");
//             printBinString(n - 1, 1, str);
//             str.deleteCharAt(str.length() - 1); 
//         }
//     }

//     public static void main(String args[]) {
//         printBinString(3, 0, new StringBuilder(""));
//     }
// }

// Find the Occurances of the strings..

// public class javaBasics {
//     public static void Occurance(int arr[],int i) {
        
//         int key = 2;
//         if(i== arr.length){
//             return ;
//         }
//         if(arr[i] == key) {
//             System.out.println(i);
            
//         }
//         Occurance(arr , i+1);


//     }
//     public static void main(String args[]) {
//         int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         Occurance(arr , 0);
        
//     }
// }


// Print the number of the Strings via number...

// public class javaBasics {
//     static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//     public static void Stringdigits (int num ) {
//         // Basecase
//         if(num==0) {
//             return ;
//         }
//         int lastdigit = num%10;
//         Stringdigits(num/10);
//         System.out.println(digits[lastdigit]+" ");

//     }
//     public static void main(String args[]) {
    
//     int num = 2019;
//     Stringdigits(num);
//     }
// }

// Length of the string...

// public class javaBasics {
//     public static int length(String str) {
//         // basecase
//         if(str.equals("")) {
//             return 0;
//         }
//         return 1+length(str.substring(1));
//     }

//     public static void main(String args[]) {
//         String str = "HelloWorlds";
//         int result = length(str);
//         System.out.println(result);
//     }
// }


// length of the array....

// public class javaBasics {
//     public static int lenghtArray(int arr[], int i) {
//         // Base Case..
//         if(i== arr.length) {
//             return 0;
//         }
//         return 1+lenghtArray(arr, i+1);

//     }
//     public static void main(String args[]) {
//         int arr[] = {1,2,3,4,5,6};
//         System.out.print(lenghtArray(arr , 0));

//     }
// }

// Reverse the arrya in the Array..
// public class javaBasics {

//     public static void reverseArray(int arr[], int i, int j) {

//         // Base case
//         if(i >= j) {
//             return;
//         }

//         // Swap
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;

        
//         reverseArray(arr, i+1, j-1);
//     }

//     public static void main(String args[]) {

//         int arr[] = {1,2,3,4,5};

//         reverseArray(arr, 0, arr.length-1);

//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// Polindrom...

// public class javaBasics {
//     public static boolean isPolindeome(String str , int i , int j) {
//         // Base Case...
//         if(i >= j) {
//             return true;
//         }

//         if(str.charAt(i) != str.charAt(j)) {
//             return false;
//         }

//         return isPolindeome(str , i+1 , j-1);
//     }

//     public static void main(String args[]) {
//         String str = "madam";
//         boolean result = isPolindeome(str , 0 , str.length()-1);
//         System.out.println(result);
//     }
// }

// Print the Subarray...........

