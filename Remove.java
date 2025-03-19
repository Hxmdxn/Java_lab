// 10.Write a Java Program to remove all vowels from a string

import java.io.*;

class Remove
{
public static void main(String args[])
{
String str="";
DataInputStream d=new DataInputStream(System.in); //keyboard

try
{
System.out.println("enter the string");
str=d.readLine();
}
catch(Exception e){}

System.out.println("Given string : "+str);
str=str.replaceAll("[AaEeIiOoUu]","");
System.out.println("String without vowels : "+str);
}
}
 