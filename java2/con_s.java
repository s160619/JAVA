class test
{
test()
{
System.out.print("Constructor ");
}
void display()
{
System.out.println("hai ");
}
void print()
{
System.out.println("world");
}
}
class main
{
public static void main(String ar[])
{
test a= new test();
a.display();
a.print();
test b= new test();
}
}