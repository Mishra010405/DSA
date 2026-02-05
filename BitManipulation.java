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

import java.util.*;

public class JavaBasics {

    public static void Oddeven(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Oddeven(num);
    }
}
