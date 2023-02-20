import java.io.*;
class Matrix
{
	public static void main(String args[])
	{
		int row,col,sumr,sumc;
		int i,j;
		int a[][]={
		{1,2,3},
		{2,1,1},
		{3,3,4}
		};
		row=a.length;
		col=a[0].length;
		for(i=0;i<row;i++)
		{
		sumr=0;
		for(j=0;j<col;j++)
		{
		sumr=sumr+a[i][j];
		}
			System.out.println("Sum of"+"(i+1) "+"row:"+sumr);
			}
			for(i=0;i<col;i++)
			{
			sumc=0;
			for(j=0;j<row;j++)
		{
		sumc=sumc+a[j][i];
		}
			System.out.println("Sum of"(i+1)+"column:"+sumc);
		}
	}
}
