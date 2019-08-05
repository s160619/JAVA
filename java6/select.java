import java.util.*;
class select
{
public static void main(String ar[])
{
int i,j;
System.out.print("enter length of the array:");
Scanner b=new Scanner(System.in);
int n=b.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.print("enter"+i+"th element:");
a[i]=b.nextInt();
}
System.out.print("Entered array:");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println();
System.out.print("Sorted array is:");
for(i=0;i<n;i++)
{
for(j=(i+1);j<n;j++)
{
int m=i;
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
}
}