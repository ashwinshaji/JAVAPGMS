import java.io.*;
//import java.lang.*;
class SortAsc
{
	public static void main(String args[])
	{
		int size;
		int i,j;
		int x,temp;
		int a[];
		String s;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the size of the array");
			s=din.readLine();
			size=Integer.parseInt(s);
			System.out.println("The size is"+size);
			a=new int[size];
			System.out.println("The Array elements are");
			for(i=0;i<size;i++)
			{
				System.out.println("Element:");
				s=din.readLine();
				x=Integer.parseInt(s);
				a[i]=x;
			}
			for(i=0;i<size;++i)
			{
				for (j=size+1; j<size; ++j)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("in the sorted form");
			for(i=0;i<size;i++)
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
