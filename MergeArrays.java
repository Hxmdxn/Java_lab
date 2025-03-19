// 5. Write a program to merge two arrays

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // first array
        System.out.print("Enter the limit of the first array: ");
        int m = scanner.nextInt();

        int[] array1 = new int[m];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < m; i++) array1[i] = scanner.nextInt();
        
        // second array
        System.out.print("Enter the limit of the second array: ");
        int n = scanner.nextInt();

        int[] array2 = new int[n];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) array2[i] = scanner.nextInt();
        
        // Merge arrays
        int[] result = new int[m + n];
        System.arraycopy(array1, 0, result, 0, m); // Copy array1 into result
        System.arraycopy(array2, 0, result, m, n); // Copy array2 into result

        System.out.println("The merged array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}