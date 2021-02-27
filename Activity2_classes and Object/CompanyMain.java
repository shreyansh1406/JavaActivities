import java.util.*;
public class CompanyMain
{
public static void main(String []args)
  {
  Company e=new Company();
  String s1, s2;
  String s3;
  Scanner sc = new Scanner (System.in);
  System.out.println ("enter the Company name");
  s1 = sc.nextLine ();
  System.out.println ("enter the Employees");
  s2 = sc.nextLine ();
  System.out.println ("enter the Teamlead");
  s3= sc.nextLine();
  e.setname(s1);
  e.setemp(s2);
  e.setlead(s3);
  String arr[]=s2.split(",");
  int flag=0;
  for(int i=0;i<arr.length;i++)
   {
    if(arr[i].equals(s3))
    {
     flag=1;
    }
   }
  if(flag==0)
  {  
  System.out.println("invalid input");
  System.exit(0);
  } 
  else
  {
   System.out.print("name:");
   System.out.println(e.getname());
   System.out.print("employees:");
   System.out.println(e.getemp());
   System.out.print("Teamlead:");
   System.out.println(e.getlead());
  }
}
}
