//4. Write a program to perform base conversion
// a) Integer to binary
// b) Integer to Octal
// c) Integer to Hexadecimal

import java.util.*;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Convert to different bases, initialize variables.
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number).toUpperCase();

        // Display the results
        System.out.println("Binary representation: " + binary);
        System.out.println("Octal representation: " + octal);
        System.out.println("Hexadecimal representation: " + hexadecimal);

        sc.close();
    }
}

 