import java.io.*;
class FCMeth1
{
public static void main(String args[])
{
try
{
File f1=new File("E:\ashwin\test.txt");
boolean fc=f1.createNewFile();
if(fc) {System.out.println("File created");}
else {System.out.println("File not created");}
}
catch(IOException e){
System.out.println(e);
}
}
}