import java.util.*;
class linear
{
public static void main(String ar[])
{
int i;
System.out.print("enter length of the array:");
Scanner b=new Scanner(System.in);
int l=b.nextInt();
int a[]=new int[l];
for(i=0;i<l;i++)
{
System.out.print("enter"+i+"th element:");
a[i]=b.nextInt();
}
System.out.println("enter search element:");
int s=b.nextInt();
for(i=0;i<l;i++)
{
if(s==a[i])
{
System.out.println("Element found at"+i+"th position");
break;
}
else if(i==(l-1))
System.out.print("element not found");
}
}
}






