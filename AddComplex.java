// 12.Using class and objects, write a java program to find the sum of two complex
// numbers

import java.util.Scanner;

class Complex {
    int real, imaginary;

    // Constructor to initialize complex numbers
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    Complex add(Complex other) {
        int sumReal = this.real + other.real;
        int sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    void display() {
        System.out.println(this.real + " + i" + this.imaginary);
    }
}

public class AddComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first complex number (format: a+ib):");
        Complex c1 = parseComplex(scanner.nextLine());

        System.out.println("Enter the second complex number (format: a+ib):");
        Complex c2 = parseComplex(scanner.nextLine());

        // Add the two complex numbers
        Complex sum = c1.add(c2);

        System.out.print("First complex number = ");
        c1.display();
        System.out.print("Second complex number = ");
        c2.display();
        System.out.print("Sum of complex numbers = ");
        sum.display();

        scanner.close();
    }

    // Helper method to parse a complex number from a string
    public static Complex parseComplex(String input) {
        try {
            // Split the input into real and imaginary parts
            String[] parts = input.split("\\+i");
            int real = Integer.parseInt(parts[0].trim());
            int imaginary = Integer.parseInt(parts[1].trim());
            return new Complex(real, imaginary);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid format. Use the format 'a+ib' (e.g., 3+i5).");
        }
    }
}