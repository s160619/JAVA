class prime
{
public static void main(String ar[])
{
int a,i,c=0,b;
for(a=2;a<=100;a++)
{
for(i=2;i<=(a/2);i++)
{
b=a%i;
if(b==0)
c=c+1;
}
if(c==0)
System.out.println(a);
c=0;
}
}
}