import java.util.*;
public class Innings
{
private String teamname;
private String inningsname;
private int runs;

public void setname(String teamname)
{
this.teamname=teamname;
}
public String getname()
{
return teamname;
}

public void setinn(String inningsname)
{
this.inningsname=inningsname;
}
public String getinn()
{
return inningsname;
}

public void setrun(int runs)
{
this.runs=runs;
}
public int getrun()
{
return runs;
}

public void displayInningsDetails()
{

String s1, s2;
int r;
Scanner sc = new Scanner(System.in);
System.out.println("enter the team name");
s1 = sc.nextLine();
System.out.println("enter the session");
s2 = sc.nextLine();
System.out.println("enter the runs");
r= sc.nextInt();
setname(s1);
setinn(s2);
setrun(r);
System.out.print("Name:");
System.out.println(getname());
System.out.print("Scored:");
System.out.println(getrun()); 
if(s2.equals("first"))
System.out.println("need"+" "+(r+1)+" "+"to win");
else
System.out.println("match ended");  
}
}