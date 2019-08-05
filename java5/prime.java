class prime
{
public static void main(String ar[])
{
int a=11,i,c=0,b;
for(i=2;i<=(a/2);i++)
{
b=a%i;
if(b==0)
c=c+1;
}
if(c==0)
System.out.print("prime number");
else
System.out.print("not a prime");
}
}