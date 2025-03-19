//6. Java Programming Code to Find HCF LCM of Two Numbers

import java.io.*;

class LcmHcf
{
public static void main(String args[])
{
int a,b,x=0,y=0,t,lcm,hcf;
DataInputStream d=new DataInputStream(System.in); 

try
{
System.out.println("enter two numbers");
x=Integer.parseInt(d.readLine());
y=Integer.parseInt(d.readLine());
}
catch(Exception e){}

a=x;
b=y;
while(b!=0) //Euclidean algorithm
{
t=b;
b=a%b;
a=t;
}
hcf=a;
lcm=(x*y)/hcf;
System.out.println("LCM="+lcm);
System.out.println("HCF="+hcf);
}
} 
    

