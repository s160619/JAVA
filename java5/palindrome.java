class palindrome
{
public static void main(String ar[])
{
int a=121,r=0,s=0,b;
b=a;
while(a>0)
{
r=a%10;
s=(s*10)+r;
a=a/10;
}
System.out.println("reverse number:"+s);
if(s==b)
System.out.print("palindrome");
else
System.out.print("not a palindrome");
}
}