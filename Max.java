import java.io.*;
import java.lang.*;
class Max
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
if((x>y)&&(x>z))
{
System.out.println(x+"is max");
}else if((y>x)&&(y>z))
{
System.out.println(y+"is max");
}else
{
System.out.println(z+"is max");
}
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}