// 14.Write a java program to find the volume of cube, rectangular box, cylinder using
// function overloading.


public class Overload
{
double volume(float l,float b,float h)
{
return l*b*h; //vol. of rectangle
}
double volume(float l)
{ 
return l*l*l; // vol. of cube
}
double volume(float r,float h)
{
return 3.14*r*r*h; //vol. of cylinder
}
}

class MethodOverloading
{
public static void main(String args[])
{
Overload o = new Overload();

double rectangle = o.volume(5,8,9);
System.out.println("Volume of rectangular box="+ rectangle);

double cube = o.volume(5);
System.out.println("Volume of cube="+ cube);

double cylinder = o.volume(6,12);
System.out.println("Volume of cylinder="+ cylinder);
}
}
