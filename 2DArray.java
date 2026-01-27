// Creation of the Two Dimentional Matrix.... 

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3];

//         int n = matrix.length;
//         int m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);

//         // Input
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Output
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Seraching the Key int the matrix..

import java.util.*;

public class JavaBasics {

    public static boolean SearchKey(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Key found at cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = new int[3][3];  

        Scanner sc = new Scanner(System.in);

        // Input matrix
        System.out.println("Enter 9 elements:");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix is:");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search key
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        SearchKey(matrix, key);
    }
}
