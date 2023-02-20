import java.io.*;
import java.lang.*;
class Min
{
public static void main(String args[])
{
int x,y,z;
String s;
try{
DataInputStream dir=new DataInputStream(System.in);
System.out.println("enter x");
s=dir.readLine();
x=Integer.parseInt(s);
System.out.println("enter y");
s=dir.readLine();
y=Integer.parseInt(s);
System.out.println("enter z");
s=dir.readLine();
z=Integer.parseInt(s);
if((x<y)&&(x<z))
{
System.out.println(x+"is min");
}else if((y<x)&&(y<z))
{
System.out.println(y+"is min");
}else
{
System.out.println(z+"is min");
}
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}