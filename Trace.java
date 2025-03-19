// 7. Program to find the trace and transpose of a matrix

import java.util.Scanner;

class Trace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); //newline after each row
        }

        // Display transpose 
        System.out.println("\nTranspose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }

        // calculate and display the trace of the matrix if it is square
        if (rows == cols) { //square
            int trace = 0;
            for (int i = 0; i < rows; i++) {
                trace += matrix[i][i]; //diagonal elements
            }
            System.out.println("\nTrace of the matrix: " + trace);
        } else {
            System.out.println("\nCannot find trace because the matrix is not square.");
        }

        sc.close();
    }
}
