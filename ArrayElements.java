//3. Read an array of 10 or more numbers and write a program to find the
// a) Smallest element in the array
// b) Largest element in the array
// c) Second largest element in the array

import java.util.*;

public class ArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (10 or more): ");
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("Array size must be 10 or more.");
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int smallest = arr[0], largest = arr[0], secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < smallest) smallest = num;
            if (num > largest) { secondLargest = largest; largest = num; }
            else if (num > secondLargest && num != largest) secondLargest = num;
        }
        
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println(secondLargest == Integer.MIN_VALUE ? "No distinct second largest." : "Second Largest: " + secondLargest);
        
        sc.close();
    }
}
