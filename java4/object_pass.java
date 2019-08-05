class main
{
public static void main(String ar[])
{
exam a=new exam(10,20,19);
exam b=new exam(a);
int y=b.product();
System.out.println(y);
}
}
class exam
{
int d,e,f;
exam(int i,int j,intk)
{
d=i;e=j;f=k;
}
exam(exam l)
{
d=l.d;
e=l.e;
f=l.f;
}
int product()
{
return (d*e*f);
}
}