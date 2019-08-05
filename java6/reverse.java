class reverse
{
public static void main(String ar[])
{
int a=123,r=0,s=0;
while(a>0)
{
r=a%10;
s=(s*10)+r;
a=a/10;
}
System.out.print("reverse number:"+s);
}
}