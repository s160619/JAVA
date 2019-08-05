import java.util.*;
class fact
{
long factorial(int n)
{
if(n==0)
return 1;
else
return (n*factorial(n-1));
}
}
class Main
{
public static void main(String ar[])
{
fact ob=new fact();
System.out.print("enter a number:");
Scanner u=new Scanner(System.in);
int a=u.nextInt();
long f=ob.factorial(a);
System.out.print(f);
}
}
