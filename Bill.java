import java.io.*;
import java.lang.*;
Final class Item
{
	 Final static void print(){
		float price;
		int qty,prodname;
		string str,str1,str2;
		try{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter product name");
			prodname=Integer.parseInt(str);
			str=dis.readLine();
			System.out.println("Enter product quantity");
			qty=Integer.parseInt(str1);
			str1=dis.readLine();
			System.out.println("Enter product price");
			price=Float.parseInt(str2);
			str2=dis.readLine();
			System.out.println("Product Name");
			System.out.println("Product Quantity");
			System.out.println("Product Amount");
		}
			catch(IOException e)
			{
				System.out.println(e);
			}
}
	}
 Final class Bill
{
Final  static void main(String args[])
{
	int i,n;
	float sum=0.0;
billing b=new billing();
try{
System.out.println("Enter no: of items that you want to bill");	
b.item();
for(i=0;i<n;i++)
{
	sum=sum+b.prodname[i];
}
System.out.println("Total amount is"+sum);
}
catch(IOException e)
{
	System.out.println(e);
}
}
}