import java.io.*;
import java.lang.*;
class Array
{
public static void main(String args[]) 
 {
  int a[];
  int n=0,i;
  String str;
  try
  {
  DataInputStream din=new DataInputStream(System.in);
  System.out.println("Enter the size of the array");
  n=Integer.parseInt(din.readLine());
  a=new int[n];
  System.out.println("Enter the elements of the array");
 
  for(i=0;i<n;i++)
  {

  a[i]=Integer.parseInt(din.readLine());
  }
  System.out.println("The array elements are");
  for(i=0;i<n;i++)
  {
  System.out.println(a[i]);
 }
  }
  
  catch(IOException e)
  {
	  System.out.println(e);
  }
 }
  
  
 }

 