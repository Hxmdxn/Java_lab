// 8. Write java program to find the sum of the digits and reverse of a given number
// using class and objects.

import java.util.Scanner;

class SumRev {
    int n; 

    // Constructor to initialize the number
    SumRev(int number) {
        n = number;
    }

    // Method to calculate sum of digits and reverse of the number
    void calculate() {
        int rev = 0, sum = 0, d;

        while (n > 0) {
            d = n % 10; // Extract the last digit
            sum += d;   // Add the digit to the sum
            rev = rev * 10 + d; // Build the reverse number
            n = n / 10; // Remove the last digit
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Reverse of the number = " + rev);
    }
}

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();  

        SumRev obj = new SumRev(number);  
        obj.calculate(); // Calculate and display the sum and reverse
    }
}