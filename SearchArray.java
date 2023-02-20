import java.io.*;
import java.lang.*;
class SearchArray
{
public static void main(String args[])
{
      
	DataInputStream din=new DataInputStream(System.in);
	try
	{
            int a[],i,x,n,f=0;
             String s;
		System.out.println("Enter n");
		s=din.readLine();
		n=Integer.parseInt(s);
		System.out.println("Enter"+n+"elements");
		a=new int[n];
		for(i=0;i<n;i++)
		{
			s=din.readLine();
			a[i]=Integer.parseInt(s);
			System.out.println(""+a[i]);
		}
		System.out.println("Enter element to be search");
		s=din.readLine();
		x=Integer.parseInt(s);
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{	
				System.out.println("Element found at position"+(i+1));
				f=1;
			}
		}
		if(f!=1)
		{
			System.out.println("Element not found");
		}
	}
	catch(IOException e)
	{
		System.out.println("The error"+e);
	}
}
}
