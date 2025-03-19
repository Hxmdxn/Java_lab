// 17.Write a multi thread java program for displaying odd numbers and even numbers up
// to a limit (Hint: Implement thread using Runnable interface).

import java.io.*;

class Odd implements Runnable
{
public void run()
{
System.out.println("odd numbers: ");
for(int i=0;i<11;i++)
{
if(i%2==1)
System.out.println(+i);
}
}
}

class Even implements Runnable
{
public void run()
{
System.out.println("even numbers: ");
for(int i=0;i<11;i++)
{
if(i%2==0)
System.out.println(+i);
}
}
}

public class ThreadOddEven
{
public static void main(String args[])throws IOException
{
Odd o=new Odd();
Even e=new Even();
Thread t1=new Thread(o);
Thread t2=new Thread(e);
t1.start();
t2.start();
}
}
