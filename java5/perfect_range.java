class perfect
{
public static void main(String ar[])
{
int b,s=0,i,a,r=0;
for(a=1;a<=500;a++)
{
for(i=1;i<a;i++)
{
r=a%i;
if(r==0)
s=s+i;
}
if(s==a)
System.out.println(a);
s=0;
}
}
}