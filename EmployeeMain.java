import java.util.*;
public class EmployeeMain
{
public static void main(String []args)
{
Employee e=new Employee();
String s1, s2;
String m;
Scanner sc = new Scanner (System.in);
System.out.println ("enter the name");
s1 = sc.nextLine ();
System.out.println ("enter the address");
s2 = sc.nextLine ();
System.out.println ("enter the mob");
m = sc.nextLine();
e.setname(s1);
e.setadd(s2);
e.setmob(m);
System.out.println("Employee Details");
System.out.print("Name:");
System.out.println(e.getname());
System.out.print("Address:");
System.out.println(e.getadd());
System.out.print("Mobile:");
System.out.println(e.getmob());
}
}
