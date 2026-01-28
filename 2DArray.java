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

// import java.util.*;

// public class JavaBasics {

//     public static void SpiralMatrix(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;

//         while(startRow <= endRow && startCol <= endCol) {

//             // Top
//             for(int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // Right
//             for(int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // Bottom
//             if(startRow <endRow) {
//                 for(int j = endCol - 1; j >= startCol; j--) {
//                     System.out.print(matrix[endRow][j] + " ");
//                 }
//             }

//             // Left
//             if(startCol < endCol) {
//                 for(int i = endRow - 1; i > startRow; i--) {
//                     System.out.print(matrix[i][startCol] + " ");
//                 }
//             }

//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };

//         SpiralMatrix(matrix);   
//     }
// }


// Sum of the Diagonals of the Matrix ...

// import java.util.*;

// public class JavaBasics {
//     public static void sumofDiagonal(int matrix[][]) {
//         int sum=0;
//         for(int i=0 ; i<matrix.length; i++ ) {
//             for(int j=0 ; j<matrix[0].length ; j++) {
//                 if(i==j) {
//                     sum +=matrix[i][j];
//                 }
//                 else if (i+j==matrix.length-1) {
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         // Print the sum odf the Diagonals
//         System.out.println("The sum of the Diagonals is - "+sum);

//     }

//     public static void main (String args []) {
//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         sumofDiagonal(matrix);

//     }
// }

// Search in Sorted Matrix...

// import java.util.*;

// public class JavaBasics {

//     public static boolean StaircaseSearch(int matrix[][], int key) {
//         int row = 0;
//         int col = matrix[0].length - 1;

//         while(row < matrix.length && col >= 0) {

//             if(matrix[row][col] == key) {
//                 System.out.println("The key found at (" + row + ", " + col + ")");
//                 return true;
//             }
//             else if(key < matrix[row][col]) {
//                 col--;
//             }
//             else {
//                 row++;
//             }
//         }

//         System.out.println("Key Not Found");
//         return false;
//     }

//     public static void main(String args[]) {

//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };

//         int key = 11;

//         StaircaseSearch(matrix, key);
//     }
// }


// Print the number of 7’s that are in the 2d array.

import java.util.*;
public class JavaBasics {
    public static boolean Printnum(int matrix[][] ) {
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] == 7){
                    System.out.println("The number is Present " +matrix[i][j]);
                    return true;
                }
                
            }
        }
        System.out.println("Number is not present");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9,  10, 11, 12},
            {13, 14, 15, 16}
        };
        Printnum(matrix);
    }
}