import java.util.*;
class reverse
{
public static void main(String ar[])
{
int i;
System.out.print("enter length of the string:");
Scanner s=new Scanner(System.in);
int l=s.nextInt();
Char a[i]=new Char[l];
System.out.print("enter characters:");
for(i=0;i<n;i++)
{
a[i]=s.next().charAt(0);
}
System.out.print("entered string is:");
for(i=0;i<l;i++)
{
System.out.print(a[i]);
}
System.out.print("Reverse String is:");
for(i=(l-1);i>=0;i++)
{
System.out.print(a[i]);
}
}
}
