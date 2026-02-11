// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         String name = Sc.nextLine();
//         System.out.println(name);
//     }
// }

// String as a Function..

// public class JavaBasics {

//     public static void NamePrint(String Firstname, String LastName) {
//         System.out.println(Firstname+" "+LastName);
//         System.out.println(Firstname.charAt(0));
//     }

//     public static void main(String[] args) {
//         String Firstname = "Shivam";
//         String LastName = "Mishra";
//         NamePrint(Firstname, LastName);
//     } 
// }


// Create the Spacing Between The Latters...
// import java.util.*;

// public class JavaBasics{
//     public static void SpaceBet(String full_name){
//         for(int i=0 ; i<full_name.length() ;i++) {
//             System.out.println(full_name.charAt(i)+"  ");
//         }

//     }
//     public static void main(String args[]) {
//         String Name = "Shivam";
//         String Last = "Mishra";
//         String full_name = Name+Last;
//         SpaceBet(full_name);
//     }
// }


// Find the Indexing of the letters...

// import java.util.*;

// public class JavaBasics{
//     public static void SpaceBet(String full_name){
//         for(int i=0 ; i<full_name.length() ;i++) {
//             if(full_name.charAt(i) == 'r'){
//                 System.out.println(i+"  ");
//             }
//         }

//     }
//     public static void main(String args[]) {
//         String Name = "Shivam";
//         String Last = "Mishra";
//         String full_name = Name+Last;
//         SpaceBet(full_name);
//     }
// }


// Check if it is a Polindrme...

// public class JavaBasics {

//     public static boolean Polindrme(String name) {
//         int n = name.length();
        
//         for(int i = 0; i < n / 2; i++) {
//             if(name.charAt(i) != name.charAt(n - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String name = "CarraC";

//         if(Polindrme(name)) {
//             System.out.println("So it is the palindrome");
//         } else {
//             System.out.println("So it is not the palindrome");
//         }
//     }
// }


// Get Shortest Path...
// public class JavaBasics {

//     public static double getShortestPath(String path) {
//         int x = 0;
//         int y = 0;

//         for(int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i);

//             // South
//             if(dir == 'S') {
//                 y--;
//             }
//             // North
//             else if(dir == 'N') {
//                 y++;
//             }
//             // West
//             else if(dir == 'W') {
//                 x--;
//             }
//             // East
//             else if(dir == 'E') {
//                 x++;
//             }
//         }

//         int X2 = x * x;
//         int Y2 = y * y;

//         return Math.sqrt(X2 + Y2);
//     }

//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }
// }


// String Comperistion...

// public class JavaBasics {

//     public static void StringComparison(String name1, String name2) {
//         if(name1.equals(name2)) {
//             System.out.println("The names are Equal...");
//         } else {
//             System.out.println("The names are not Equal...");
//         }
//     }

//     public static void main(String[] args) {
//         String name1 = "Shivam Mishra";
//         String name2 = "Ujjwal Mishra";

//         StringComparison(name1, name2);
//     }
// }

// Print the Sub String from the COdess..

// public class JavaBasics {

//     public static String Substring(String name, int si, int ei) {
//         String substr = "";

//         for(int i = si; i < ei; i++) {
//             substr += name.charAt(i);
//         }

//         return substr;
//     }

//     public static void main(String[] args) {
//         String name = "SHivamMishra";
//         System.out.println(Substring(name, 0, 5));
//     }
// }


// String Builders ...

// public class JavaBasics {
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a'; ch<='z' ; ch++) {
//             System.out.println((sb.append(ch)));
//         }
//         System.out.println();
//     }
// }

// Print the String into the upper Case...

// public class JavaBasics {

//     public static String toUpperCase(String name) {
//         StringBuilder sb = new StringBuilder("");

//         // Capitalize the first character
//         char ch = Character.toUpperCase(name.charAt(0));
//         sb.append(ch);

//         for(int i = 1; i < name.length(); i++) {
//             if(name.charAt(i) == ' ' && i < name.length() - 1) {
//                 sb.append(' ');
//                 i++;
//                 sb.append(Character.toUpperCase(name.charAt(i)));
//             } else {
//                 sb.append(name.charAt(i));
//             }
//         }

//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String name = "hi, my name is shivam mishra";
//         System.out.println(toUpperCase(name));
//     }
// }



// Count the Strings into the Sthngrs..


// public class JavaBasics {

//     public static String CompressString(String name) {
//         String newstr = "";

//         for(int i = 0; i < name.length(); i++) {
//             int counter = 1;

//             while(i < name.length() - 1 && name.charAt(i) == name.charAt(i + 1)) {
//                 counter++;
//                 i++;
//             }

//             newstr += name.charAt(i);

//             if(counter > 1) {
//                 newstr += counter;
//             }
//         }

//         return newstr;
//     }

//     public static void main(String[] args) {
//         String name = "aaabcccdd";
//         System.out.println(CompressString(name));
//     }
// }


// Count how many times lowercase vowels occurred in a String entered by the user...

// public class JavaBasics {

//     public static int lowercase(String name) {
//         int counter = 0;

//         for(int i = 0; i < name.length(); i++) {
//             if(Character.isLowerCase(name.charAt(i))) {
//                 counter++;
//             }
//         }
//         return counter;
//     }
//     public static void main(String[] args) {
//         String name = "ShivamMishra";
//         System.out.println(lowercase(name));
//     }
// }


// To convert it into the lowercase ...

// public class JavaBasics{
//     public static String tolowercase(String name) {
//         StringBuilder sb = new StringBuilder("");

//         for(int i = 0; i < name.length(); i++) {
//             char ch = Character.toLowerCase(name.charAt(i));
//             sb.append(ch);
//         }

//         return sb.toString();
//     }

//     public static void main(String args[]) {
//         String name = "SHivam Mishra";
//         System.out.println(tolowercase(name));
//     }
// }


// String Comperision Questions..


// public class Solution {
//     public static void main(String[] args) {
//         String str = "ShradhaDidi";
//         String str1 = "ApnaCollege";
//         String str2 = "ShradhaDidi";

//         System.out.println(str.equals(str1) + " " + str.equals(str2));
//     }
// }


// replace the String from the letters..

// public class JavaBasics {
//     public static String ReplaceString(String name) {
//         String str = name.replaceAll("Shivam", "Sadhvi");
//         return str;
//     }

//     public static void main(String args[]) {
//         String name = "Shivam Mishra ";
//         System.out.println(ReplaceString(name));
//     }
// }



//  Reverse The String...

// public class JavaBasics {

//     public static String reversing(String str) {
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }
//         return rev;
//     }

//     public static void main(String args[]) {
//         String str = "Shivam";
//         System.out.println(reversing(str));
//     }
// }


// Count the Vowels in the Strings ...

// public class JavaBasics {
//     public static int countVowels(String str) {
//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 System.out.println("The count of Vowels are -> "+ch);  
//                 count++;
//             }
//             else {
//                 System.out.println("The Consonets are "+ch);
                
//             }
            
//         }
//         return count;
//     }

//     public static void main(String args[]) {
//         String str = "abcdef";
//         System.out.println(countVowels(str));
//     }
// }


// Count the Consonents in the Strings ...

// public class JavaBasics {
//     public static int countVowels(String str) {
//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 System.out.println("The count of Vowels are -> "+ch);  
                
//             }
//             else {
//                 System.out.println("The Consonets are "+ch);
//                 count++;
                
//             }
            
//         }
//         return count;
//     }

//     public static void main(String args[]) {
//         String str = "abcdef";
//         System.out.println(countVowels(str));
//     }
// }


// COunt the Vowles and Consontents Together...
// public class JavaBasics {
//     public static void CountString(String str) {
//         int vowels=0 ; 
//         int Consonants=0;
//         for(int i=0 ; i<str.length() ; i++) {
//             char ch  = Character.toLowerCase(str.charAt(i));
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                     vowels++;
//                 } else {
//                     Consonants++;
//                 }
//         }
//         System.out.println("The Vowles Are "+ vowels);
//         System.out.println("The COnsonents Are "+ Consonants );


//     }

//     public static void main(String args[]) {
//         String str = "addsgbfbfbfb";
//         CountString(str);
//     }
// }


// Remove all the space from the string ...
// remove all the spaces from the string...

// public class JavaBasics {
//     public static String RemoveallSpacs(String str) {
//         String result = "";

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) != ' ') {
//                 result = result + str.charAt(i);
//             }
//         }
//         return result;
//     }

//     public static void main(String args[]) {
//         String str = "Shivam Mishra";
//         System.out.println(RemoveallSpacs(str));
//     }
// }


// Reverse the word in the sentences...

// public class JavaBasics {
//     public static String reverseword(String str) {
//         String rev = "";
//         String word = "";

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == ' ') {
//                 rev = word + " " + rev;
//                 word = "";
//             } else {
//                 word = word + str.charAt(i);
//             }
//         }
//         rev = word + " " + rev;
//         return rev.trim();
//     }

//     public static void main(String args[]) {
//         String str = "i love you";
//         System.out.println(reverseword(str));
//     }
// }

// Check if the Strings contains only the digits..

// public class JavaBasics {
//     public static boolean Stringdigits(String str) {
//         for(int i=0 ; i<str.length() ; i++) {
//         if(str.charAt(i)>= '0' && str.charAt(i) <= '9') {
//             return true;
//         }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         String str = "safdgfhfh33fbfn";
//         if(Stringdigits(str)) {
//             System.out.println("String contains the digits");
//         }
//         else {
//             System.out.println("String does not contains the digits");
//         }
//     }
// }

// the Maximum Occuring Character from the String ...

// public class JavaBasics {
//     public static void repeatcharacter(String str) {
//         for(int i=0 ; i<str.length() ; i++) {
//             char ch = str.charAt(i);
//             for(int j=0 ; j<str.length() ; j++) {
//                 if(ch==str.charAt(j)) {
//                     System.out.println(ch);
//                     break;
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         String str = "sabdfegdgaSaab";
//         repeatingCharacter(str);
//     }
// }


// Removal of Special Characters...
// public class JavaBasics{
//     public static String SpecialString(String str) {
//         String result = "";
//         for(int i=0 ; i<str.length() ; i++) {
//             char ch = str.charAt(i);
//              if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//                 result += ch;
//             }
//         }
//         return result;
//         }

    
//     public static void main(String args[]) {
//         String str = "He@llo! Wo#rld$123";
//         System.out.println(SpecialString(str));
//     }
// }


// Find the largest Word in to the Strings...

public class JavaBasics {
    public static String largestString(String str ) {
        String word []= str.split(" ");
        String largest = word[0];
        for(int i=0 ; i<word.length ; i++) {
            if(word[i].length() > largest.length()) {
                largest = word[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        String str = "Java is the very popular programing language";
        System.out.println(largestString(str));
    }
}