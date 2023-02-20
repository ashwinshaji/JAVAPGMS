import java.io.*;
import java.lang.*;
class Greatest
{
public static void main(String args[])
{
int x,y,z;
String s;
DataInputStream din=new DataInputStream(System.in);
try{
System.out.println("Enter first element");
s=din.readLine();
x=Integer.parseInt(s);
System.out.println("Enter second element");
s=din.readLine();
y=Integer.parseInt(s);
System.out.println("Enter third element");
s=din.readLine();
z=Integer.parseInt(s);
if((x>y)&&(x>z))
{
System.out.println(x+"IS GREATER");
}
else if((y>x)&&(y>z))
{
System.out.println(y+ "IS GREATER");
}
else
{
System.out.println(z+ "IS GREATER");
}
}
catch(IOException e)
{
System.out.println(e);
}
}
}