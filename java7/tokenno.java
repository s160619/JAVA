import java.util.*;
class buffer
{
public static void main(String ar[])
{
System.out.print("Enter a String:");
Scanner  a=new Scanner(System.in);
String s=a.nextLine();
StringTokenizer b=new StringTokenizer(s, ",_ ");
int n=b.countTokens();
System.out.println("No.of tokens="+n);
}
}