class test
{
test(int l,int b)
{
System.out.println("area="+(l*b));
}
int display(int l,int b)
{
return (l*b);
}
void print(int l,int b)
{
System.out.print("With parameteres, without return values");
System.out.println("parameter="+(2*(l+b)));
}
int output()
{
int l=10,b=3;
return (l*b);
}
}
class main
{
public static void main(String ar[])
{
test a= new test(9,8);
int c=a.display(3,4);
int d=a.output();
System.out.println("without parameters,with return values="+d);
System.out.println("with parameters,with return values="+c);
a.print(5,6);
}
}