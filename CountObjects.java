// 13.Write a program to count and display total number of objects created to a class

public class CountObjects
{
static int count=0;
CountObjects()
{
count++;  // Increment count each time an object is created
}

public static void main(String args[])
{
CountObjects obj1=new CountObjects();
CountObjects obj2=new CountObjects();
CountObjects obj3=new CountObjects();
System.out.println("Total number of objects created: "+ count);
}
}
    

