import java.io.*;
class Demo{
int x;
string y;
 void Demo()
{
System.out.println("Cons called");
int i=12;
}
 void Demo(int a ,String b)
{
x=a;
y=b;
System.out.println(a);
System.out.println(b);
}
void inc()
{
x=x+1;
System.out.println(x);
}
class Consdemo
{
public static void main(String args[])
{
demo d1=new Demo();
demo d2=new Demo(10,"Rajagiri");
d2.inc();
}
}
}