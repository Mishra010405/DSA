// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         String name = Sc.nextLine();
//         System.out.println(name);
//     }
// }

// String as a Function..

public class JavaBasics {

    public static void NamePrint(String Firstname, String LastName) {
        System.out.println(Firstname+" "+LastName);
        System.out.println(Firstname.charAt(0));
    }

    public static void main(String[] args) {
        String Firstname = "Shivam";
        String LastName = "Mishra";
        NamePrint(Firstname, LastName);
    } 
}
