class perfect
{
public static void main(String ar[])
{
int a=60,b,s=0,i,r=0;
b=a;
for(i=1;i<a;i++)
{
r=a%i;
if(r==0)
s=s+i;
}
if(s==b)
System.out.print("perfect number");
else
System.out.print("not a perfect number");
}
}