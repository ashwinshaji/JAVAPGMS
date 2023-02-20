class PalinDrome
{
public static void main(String args[])
{
DataInputStream din = new DataInputStream(System.in);
String s;
int a, rev,r;
try
{
System.out.println("ENTER NUMBER: ");
s=din.readLine();
a=Integer.parseInt(s);
test t=new test();
rev=t.pal(a);
r=t.disp(a, rev);
if(r==1)
{
System.out.println("PALINDROME!!!");
}
else
{
System.out.println("NOT A PALINDROME!!!");
}
}
catch (IOException e)
{
System.out.println("ERROR" +e );
}}}