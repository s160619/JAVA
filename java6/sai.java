import java.util.*;
class buffer
{
public static void main(String ar[])
{
System.out.print("Enter a String:");
Scanner  a=new Scanner(System.in);
String s=a.nextLine();
StringBuffer d=new StringBuffer(s);
System.out.println(d.replace(4,10,"Talluri"));
}
}