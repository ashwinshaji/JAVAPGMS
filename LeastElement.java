import java.io.*;
import java.lang.*;
class LeastElement
{
public static void main(String args[])
{
int x=0,y=0,z=0;
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
}
catch(IOException e)
{
System.out.println(e);
}
int no=(x<y)?((x<z)?x:z):(y<z?y:z);
System.out.println("Smallest number is"+no);
}
}