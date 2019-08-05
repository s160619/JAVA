import java.util.*;
class binary
{
public static void main(String ar[])
{
int i,m=0,f=0;
System.out.print("enter length of the array:");
Scanner b=new Scanner(System.in);
int n=b.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.print("enter"+i+"th element:");
a[i]=b.nextInt();
}
System.out.println("enter search element:");
int s=b.nextInt();
int l=(n-1);
for(i=0;i<n;i++)
{
m=(f+l)/2;
if(a[m]==s)
{
System.out.print("element found at "+m+ "th position");
break;
}
if(s>a[m])
f=m+1;
if(s<a[m])
l=m-1;
if(i==(n-1))
System.out.print("Element not found");
}
}
}
 
