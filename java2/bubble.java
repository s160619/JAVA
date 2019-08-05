import java.util.*;
class bubble
{
public static void main(String ar[])
{
int i,j,c,temp;
System.out.print("enter length of the array:");
Scanner b=new Scanner(System.in);
int l=b.nextInt();
int a[]=new int[l];
for(c=0;c<l;c++)
{
System.out.print("enter"+c+"th element:");
a[c]=b.nextInt();
}
System.out.print("entered array is:");
for(i=0;i<l;i++)
System.out.print(a[i]+"\t");
System.out.println();
System.out.print("array after sorting");
for(i=(l-1);i>0;i--)
{
for(j=0;j<i;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<l;i++)
System.out.print(+a[i]+"\t");
}
}