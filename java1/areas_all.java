import java.util.*;
class areas
{
int l,b;
float r;
int x,h;
void area()
{
System.out.print("Area of rectanle:");
l=10;b=20;
System.out.println(l*b);
}
void area(float r)
{
System.out.print("Area of the circle:");
double a=(Math.PI)*r*r;
System.out.println(a);
}
void area(int x,int h)
{
System.out.print("Area of the Triangle:");
int g=(x*h)/2;
System.out.println(g);
}
}
class main
{
public static void main(String ar[])
{
areas ob1=new areas();
ob1.area();
ob1.area(10,20);
ob1.area(6);
}
}