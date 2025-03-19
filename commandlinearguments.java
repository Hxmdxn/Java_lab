// 1 . Write a program to find the sum, difference, product, quotient and remainder of two
// numbers passed as command line argument.

class commandlinearguments
{
public static void main(String args[])
{
int a,b;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
System.out.println("Sum="+(a+b));
System.out.println("Difference="+(a-b));
System.out.println("Product="+a*b);
System.out.println("Quotient="+((float)a/b));
System.out.println("Reminder="+a%b);
}
}