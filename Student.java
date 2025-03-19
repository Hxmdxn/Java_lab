// 11.Create a class Student to read and display the student details. Create another class
// mark inherit from student to read marks of 5 subjects and find total and average.
// Write a Java program to display the result of a student

import java.util.*;

class StudentDetails {
    String name;
    int rollNo;
    String course;

    void details() {
        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter the name:");
        name = obj1.nextLine();

        System.out.println("Enter the roll no:");
        rollNo = obj1.nextInt();

        obj1.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter the course:");
        course = obj1.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class Mark extends StudentDetails {
    void result() {
        int i, sum = 0, avg;
        int[] marks = new int[5];

        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects:");

        for (i = 0; i < 5; i++) { 
            marks[i] = obj3.nextInt();
            sum += marks[i]; 
        }

        avg = sum / 5;
        System.out.println("Total marks = " + sum);
        System.out.println("Average = " + avg);
    }
}

public class Student {
    public static void main(String[] args) {
        Mark obj2 = new Mark();
        obj2.details();
        obj2.result();
    }
}