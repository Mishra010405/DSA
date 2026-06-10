// import java.util.*;

// public class javaBasics {
//     public static void main(String args[]) {
//         // char arr[] = {'a','b','c','d','e','f'};
//         // String str = "abcd";
//         // String str2 = new String("xyz");

//         // // Strings are immutable

//         // Scanner sc = new Scanner(System.in);
//         // String name = sc.nextLine();
//         // System.out.println(name);


// // Length

//         // String fullanme = "SHivamMishra";
//         System.out.println(fullanme.length());
//     }

//     // COncatenameiton

//     String first_name = "Shivam";
//     String Last_name = "Mishra";
//     String fullname = first_name+Last_name;
//     System.out.println(fullname);
// }

// public class javaBasics {
//     public static void main(String args[]) {
//         String first_name = "Shivam";
//         String Last_name = "Mishra";
//         String fullname  = first_name+" "+Last_name;
//         System.out.println(fullname);
//         System.out.println(fullname.charAt(2));

//         // using forloop
//         for(int i=0 ; i<fullname.length() ; i++) {
//             System.out.println(fullname.charAt(i));
//         }
//             System.out.println();
//     }
// }



// Chaeck if the Strin is the palindrome..

// public class javaBasics {

//     public static boolean isPalindrome(String str) {
//         for(int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }
// }

// route Direrctions...
// import java.util.*;

// public class javaBasics {

//     public static float getShortestPath(String path) {
//         int x = 0, y = 0;

//         for(int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i);

//             if(dir == 'S') {
//                 y--;
//             } else if(dir == 'N') {
//                 y++;
//             } else if(dir == 'W') {
//                 x--;
//             } else { 
//                 x++;
//             }
//         }

//         int x2 = x * x;
//         int y2 = y * y;

//         return (float)Math.sqrt(x2 + y2);
//     }

//     public static void main(String args[]) {
//         String path = "NSEEWEST";
//         System.out.println(getShortestPath(path));
//     }
// }

// Check Strings are eEquals or not ..

import java.util.*;

// public class javaBasics {
//     public static void main(String args[]) {
//         String s1 = "Tony";
//         String s2 = "TOny";
//         String s3 = new String("Tony");

        // if(s1.equals(s3)) {
        //     System.out.println("Strings are Equals");
        // }
        // else {
        //     System.out.println("Strings are not Equals");
        // }

        // if(s1== s2) {
        //     System.out.println("Strings are Equals");

        // }
        // else {
        //     System.out.println("Strings are not Equals");
//         // }
//     }
// }

// public class javaBasics {
//     public static String SubStrings(int si , int ei , String str){
//         String Substr = "";
//         for(int i=0 ; i<ei ; i++) {
//             Substr += str.charAt(i);
//         }
//         return Substr;

//     }
//     public static void main(String args[]) {
//         String str = "Hello World";
//         System.out.println(SubStrings(0,5,str));
//     }
// }


// Largest Strings : By Using Compare to

// public class javaBasics {

//     public static void main(String args[]) {
//         String fruits[] = {"apple", "banana", "Mango", "Orange"};

//         String largest = fruits[0];

//         for(int i = 0; i < fruits.length; i++) {
//             if(largest.compareTo(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }

//         System.out.println(largest);
//     }
// }

// String Builders...

// public class javaBasics {
//     public static void main(String args[]) {
//         StringBuilder str = new StringBuilder("");
//         for(char ch='a' ; ch<='z'  ; ch++) {
//             str.append(ch);
//         }

//         System.out.println(str);
//     }
// }

// ToUpperCase...

// public class javaBasics  {

//     public static String ToUpperCase(String str) {
//         StringBuilder sb = new StringBuilder("");

        
//         sb.append(Character.toUpperCase(str.charAt(0)));

//         for(int i = 1; i < str.length(); i++) {
//             if(str.charAt(i) == ' ' && i < str.length() - 1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }

//         return sb.toString();
//     }

//     public static void main(String args[]) {
//         String str = "hii  , my name is  shivam mishra";
//         System.out.println(ToUpperCase(str));
//     }
// }

// String Compressions...

// public class javaBasics {

//     public static String CountString(String str) {
//         String newstr = "";

//         for(int i = 0; i < str.length(); i++) {
//             int count = 1;

//             while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }

//             newstr += str.charAt(i);

//             if(count > 1) {
//                 newstr += count;
//             }
//         }

//         return newstr;
//     }

//     public static void main(String args[]) {
//         String str = "aaabbbbcccdd";
//         System.out.println(CountString(str));
//     }
// }

// By Using String Builders...

// public class javaBasics {
//     public static String BuildString(String str) {
//         StringBuilder sb = new StringBuilder("");

//         for(int i=0 ; i<str.length() ; i++) {
//             int count=1 ; 
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));

//             if(count>1){
//                 sb.append(count);
//             }
//         }
//         return sb.toString();
        


//     } 
//     public static void main(String args []) {
//         String str = "aaabbbbcccdd";
//         System.out.println(BuildString(str));
        
//     }
// }


