// creation of the Two Dimentional Matrix.... 

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
//         int startcol = 0;
//         int endRow = matrix.length - 1;
//         int endcol = matrix[0].length - 1;

//         while(startRow <= endRow && startcol <= endcol) {

//             // Top
//             for(int j = startcol; j <= endcol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // Right
//             for(int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endcol] + " ");
//             }

//             // Bottom
//             if(startRow <endRow) {
//                 for(int j = endcol - 1; j >= startcol; j--) {
//                     System.out.print(matrix[endRow][j] + " ");
//                 }
//             }

//             // Left
//             if(startcol < endcol) {
//                 for(int i = endRow - 1; i > startRow; i--) {
//                     System.out.print(matrix[i][startcol] + " ");
//                 }
//             }

//             startRow++;
//             startcol++;
//             endRow--;
//             endcol--;
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


// Print the matrixber of 7’s that are in the 2d array.

// import java.util.*;
// public class JavaBasics {
//     public static boolean Printmatrix(int matrix[][] ) {
//         for(int i=0 ; i<matrix.length ; i++) {
//             for(int j=0 ; j<matrix[0].length ; j++) {
//                 if(matrix[i][j] == 7){
//                     System.out.println("The matrixber is Present " +matrix[i][j]);
//                     return true;
//                 }
                
//             }
//         }
//         System.out.println("matrixber is not present");
//         return false;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         Printmatrix(matrix);
//     }
// }


// count the matrixber of 7 is in the matrix;

// import java.util.*;

// public class JavaBasics {
//     public static void Counmatrixebr(int matrix[][]) {
//         int count=0;
//         for(int i=0 ; i<matrix.length ; i++ ) {
//             for(int j=0; j<matrix.length ; j++ ){
//                 if(matrix[i][j] == 7) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("The count of the 7 in the matrix is "+count);
        

//     }
//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         Counmatrixebr(matrix);
//     }
// }


// Print the sum of the matrixbers in the Second Rows...

// import java.util.*;

// public class JavaBasics {
//     public static void Secondrow(int matrix[][]) {
//         int row =1; ;
//         int sum=0;
//         // 2nd row..
//         for(int j=0  ; j<matrix.length ; j++) {
//             sum += matrix[row][j];
//             }
        
//         System.out.println(sum);

//     }
//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         Secondrow(matrix);
//     }

// }

// Transpose the Matrix ...

// import java.util.*;

// public class JavaBasics {
//     public static void TransposeMatrix(int matrix[][]) {
//         int rows = matrix.length;
//         int cols = matrix.length;
//         int matrix[][] = new int[cols][rows];
//         for(int i=0 ; i<rows ; i++) {
//             for(int j= 0 ; j<cols ; j++) {
//                 matrix[j][i] = matrix[i][j];
//             }
//         }
//         for(int i=0 ; i<rows ; i++) {
//             for(int j=0 ; j<cols ; j++) {
//                 System.out.println(matrix[i][j]);
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args []) {
//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };

//         TransposeMatrix(matrix);

//     }
// }


// Sum of the Two Matrices...

// import java.util.*;

// public class JavaBasics {
//     public static void columnwise(int matrix1[][], int matrix2[][]) {
//         int row = matrix1.length;
//         int col = matrix1.length;
//         int matrix3[][] = new int[row][col];
//         for(int i=0 ; i< row ; i++) {
//             for(int j=0 ; j<col ; j++) {
//                 matrix3[i][j] = matrix1[i][j] + matrix2[i][j];

//             }
//         }
//         for(int i=0 ; i<row; i++) {
//             for(int j=0 ; j<col; j++) {
//                 System.out.println(matrix3[i][j]);
               
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]) {
//         int matrix1[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         int matrix2[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         columnwise(matrix1,matrix2);
//     }

// }

// CHeck if the matrix is square or not..


// import java.util.*;

// public class JavaBasics {
//     public static boolean columnwise(int matrix1[][]) {
//         int row = matrix1.length;
//         int col = matrix1.length;
//         if(row==col) {
//             return true;
//         }
//         else {
//             return false;
//         }
//         }

    
//     public static void main(String args[]) {
//         int matrix1[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };
        
//         columnwise(matrix1);
//         if(columnwise(matrix1)){
//             System.out.println("The Matrix is a Square Matrix.");
//         }
//         else {
//             System.out.println("The Matrix is not a Square Matrix.");
//         }
//     }
// }


// Reverse The Each row of the matrix..

// import java.util.*;
// public class JavaBasics{
//     public static void Reverseth(int matrix[][]){
//         for(int i=0; i<matrix.length; i++){
//         int left=0;
//         int Right= matrix.length-1;
//         while(left<Right){
//             int temp = matrix[i][left];
//             matrix[i][left] = matrix[i][Right];
//             matrix[i][Right] = temp;

//             left++;
//             Right--;
//         }
//         }
//         for(int i=0 ; i< matrix.length ; i++) {
//             for(int j=0 ; j<matrix.length; j++) {
//                 System.out.println(matrix[i][j]);
//             }
//         }
//     }
//     public static void main(String args[]) {
//        int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         }; 
//         Reverseth(matrix);
//     }
// }

// Reverse each column of matrix.
// import java.util.*;

// public class JavaBasics {

//     public static void reversecol(int matrix[][]) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         for (int j = 0; j < col; j++) {
//             int top = 0;
//             int bottom = row - 1;

//             while (top < bottom) {
//                 int temp = matrix[top][j];
//                 matrix[top][j] = matrix[bottom][j];
//                 matrix[bottom][j] = temp;

//                 top++;
//                 bottom--;
//             }
//         }
//     }

//     public static void printcol(int matrix[][]) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1,  2,  3,  4},
//             {5,  6,  7,  8},
//             {9,  10, 11, 12},
//             {13, 14, 15, 16}
//         };        

//         reversecol(matrix);

//         System.out.println("After Reversing Each Column:");
//         printcol(matrix);
//     }
// }


// Check if the matrix is ToePlitz Matrix or not..
// import java.util.*;
// public class JavaBasics {

//     public static boolean isToeplitz(int matrix[][]) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         for (int i = 1; i < rows; i++) {
//             for (int j = 1; j < cols; j++) {
//                 if (matrix[i][j] != matrix[i - 1][j - 1]) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {
//             {1, 2, 3, 4},
//             {5, 1, 2, 3},
//             {9, 5, 1, 2}
//         };

//         if (isToeplitz(matrix)) {
//             System.out.println("Matrix is Toeplitz");
//         } else {
//             System.out.println("Matrix is NOT Toeplitz");
//         }
//     }
// }


//  Print the Diagonals of the elements ...
import java.util.* ;

public class JavaBasics {
    public static void PrrDiagonals(int matrix[][]) {
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(i==j) {
                    System.out.println("The Diagonals of the Matrix is - "+matrix[i][j]+" ");
                }
            }
        }

    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        PrrDiagonals(matrix);
    }
}