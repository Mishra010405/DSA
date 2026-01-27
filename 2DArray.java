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

// import java.util.*;

// public class JavaBasics {

//     public static boolean SearchKey(int matrix[][], int key) {
//         for(int i = 0; i < matrix.length; i++) {
//             for(int j = 0; j < matrix[0].length; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("Key found at cell (" + i + ", " + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key Not Found");
//         return false;
//     }

//     public static void main(String args[]) {

//         int matrix[][] = new int[3][3];  

//         Scanner sc = new Scanner(System.in);

//         // Input matrix
//         System.out.println("Enter 9 elements:");
//         for(int i = 0; i < matrix.length; i++) {
//             for(int j = 0; j < matrix[0].length; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Print matrix
//         System.out.println("Matrix is:");
//         for(int i = 0; i < matrix.length; i++) {
//             for(int j = 0; j < matrix[0].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // Search key
//         System.out.print("Enter key to search: ");
//         int key = sc.nextInt();

//         SearchKey(matrix, key);
//     }
// }


// Spitall Matrixx...

import java.util.*;

public class JavaBasics {

    public static void SpiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {

            // Top
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right
            for(int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom
            if(startRow <endRow) {
                for(int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // Left
            if(startCol < endCol) {
                for(int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12},
            {13, 14, 15, 16}
        };

        SpiralMatrix(matrix);   
    }
}
