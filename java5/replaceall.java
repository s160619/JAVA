import java.util.*;
class string_fun
{
public static void main(String ar[])
{
System.out.print("Enter a String:");
Scanner a=new Scanner(System.in);
String s=a.nextLine();
System.out.print(s.replaceAll("a","A"));
}
}