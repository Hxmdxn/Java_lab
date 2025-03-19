// 15.Create an abstract class shape and create TwoDim and ThreeDim as sub classes.
// Create classes square and triangle derived from TwoDim and sphere and cube
// derived from ThreeDim. Write a program to determinethe area of various shapes.

abstract class shape{
    abstract double area();
}

abstract class twodim extends shape{}
abstract class threedim extends shape{}

class square extends twodim{
    double side;
    square(double side){
        this.side = side;
    }
        @Override
        double area(){
            return side*side; // a x a
    }
}

class triangle extends twodim{
    double base, height;
    triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return 0.5*base*height; //0.5 x b x h
    }
}

class Sphere extends threedim{
    double radius;
    Sphere(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
    return 4*3.14*radius*radius; // 4 x pi x r^2
}
}

class cube extends threedim{
    double side;
    cube(double side){  
        this.side = side;
    }
    @Override
    double area(){
    return 6*side*side; // 6 x a^2
    }
}

public class ShapeareaCalculator {
    public static void main(String[] args) {
        square square = new square (5);
        triangle triangle = new triangle(4, 3);
        Sphere sphere = new Sphere(2);
        cube cube = new cube(3);
        System.out.println("Area of square: "+ square.area());
        System.out.println("Area of triangle: "+ triangle.area());
        System.out.println("Area of sphere: "+ sphere.area());
        System.out.println("Area of cube: "+ cube.area());
}
    } 