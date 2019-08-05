import java.util.*;
class employee
{
int id,age,salary;
String name;
void input()
{
System.out.println("enter employee name:");
Scanner a=new Scanner(System.in);
name=a.nextLine();
System.out.println("enter Employee age:");
age=a.nextInt();
System.out.println("enter Employee salary:");
salary=a.nextInt();
System.out.println("enter Employee id:");
id=a.nextInt();
}
void display()
{
System.out.println("Employee details:");
System.out.println("Employee name:"+name);
System.out.println("Employee id:"+id);
System.out.println("Employe age:"+age);
System.out.println("Employee salary:"+salary);
}
}
class output
{
public static void main(String ar[])
{
employee z=new employee();
z.input();
z.display();
}
}
