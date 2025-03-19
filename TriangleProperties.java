// 2. Given the sides of a triangle, write a program to check whether the triangle is
// equilateral, isosceles or scalene and find its area.

import java.io.DataInputStream;

public class TriangleProperties {
    public static void main(String[] args) {
      DataInputStream d= new DataInputStream(System.in);
      
      try{
        int a,b,c;
        double s,area;
        System.out.println("Enter the sides of the triangle");
        a=Integer.parseInt(d.readLine());
        b=Integer.parseInt(d.readLine());
        c=Integer.parseInt(d.readLine());
        if(a==b && b==c)
        System.out.println("The triangle is equilateral");
        else if(a==b || b==c || a==c)
        System.out.println("The triangle is isosceles");
        else
        System.out.println("The triangle is scalene");
        
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("The area of the triangle is: %.2f\n", area);
    }
      catch (Exception e){}
    }
}


