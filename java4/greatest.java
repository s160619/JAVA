import java.util.*;
class great
{
public static void main(String ar[])
{
System.out.print("Enter three numbers:");
Scanner ob=new Scanner(System.in);
int a=ob.nextInt();
int b=ob.nextInt();
int c=ob.nextInt();
if((a>b)&&(a>c))
System.out.print("a is greater");
else if((b>a)&&(b>c))
System.out.print("b is greater");
else
System.out.print("c is greater");
}
} 