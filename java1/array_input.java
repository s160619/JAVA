import java.util.*;
class array_input
{
public static void main(String ar[])
{
int i,a[]={0,0,0,0,0,0,0,0,0,0,0,0,0},sum=0;
System.out.print("Enter size of the array:"); 
Scanner b=new Scanner(System.in);
int l=b.nextInt();
for(i=0;i<l;i++)
{
System.out.println("enter"+i+"th element");
a[i]=b.nextInt();
}
System.out.println("Entered array is:");
for(i=0;i<l;i++)
{
sum=sum+a[i];
System.out.print("  "+a[i]);
}
System.out.print("Sum of elements:"+sum);
}
} 