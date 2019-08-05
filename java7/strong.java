class strong
{
public static void main(String ar[])
{
int a=121,r=0,sum=0,b=0,i=0,f=1;
b=a;
while(a!=0)
{
r=a%10;
for(i=1;i<=r;i++)
{f=f*i;}
sum=sum+f;
a=a/10;
}
System.out.println("Sum is="+sum);
if(b==sum)
System.out.println("Strong number");
else
System.out.print("Not a Strong number");
}
}