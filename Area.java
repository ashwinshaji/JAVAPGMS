import java.io.*;
import java.lang.*;
 class Area
{
 public static void main(String args[])
{
 String str;
 int r;
 DataInputStream dis;
 dis=new DataInputStream(System.in);
 try
{
 System.out.println("Enter radius r");
 str=dis.readLine();
 r=Integer.parseInt(str);
 double area=3.14*r*r;
 System.out.println("Radius is"+r);
 System.out.println("Area is" +area);
}
 catch(IOException e)
{
 System.out.println(e);
}
}
}