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

public class JavaBasics {

    public static boolean Polindrme(String name) {
        int n = name.length();
        
        for(int i = 0; i < n / 2; i++) {
            if(name.charAt(i) != name.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "CarraC";

        if(Polindrme(name)) {
            System.out.println("So it is the palindrome");
        } else {
            System.out.println("So it is not the palindrome");
        }
    }
}
