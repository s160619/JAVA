class coprime
{
public static void main(String ar[])
{
boolean i=true;
int g=0;
int r;
int a=2;
int b=3;
while(i)
{
r=a%b;
if(r==0)
{
g=b;
System.out.print("gcd="+b);
i=false;
}
else
{
a=b;
b=r;
}
}
if(g==1)
System.out.print("coprimes");
}
}

