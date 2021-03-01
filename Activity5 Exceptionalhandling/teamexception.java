import java.util.*;
class Teamnamenotfoundexception extends Exception
{
	Teamnamenotfoundexception()
	{
		System.out.println();
	}
}
public class teamexception {

	public static void main(String[] args) throws Teamnamenotfoundexception {
		String Teamarray[]= {"Chennai Super Kings",

"Sun Risers Hyderabad",

"Delhi Capitals",

"Kings XI Punjab",

"Kolkata Knight Riders",

"Mumbai Indians",

"Rajasthan Royals",

"Royal Challengers Bangalore"

	};
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expected winner team of IPL Season 13");
		String a=sc.nextLine();
		try 
		{
		
		for(int i=0;i<Teamarray.length;i++)
		{
			if(a.equalsIgnoreCase(Teamarray[i]))
				flag=1;
		}
		if(flag==0)
			throw new Teamnamenotfoundexception();
		}
		catch(Exception m)
		{
			System.out.print(m+":Entered team is not a part of IPL Season 13");
			System.exit(0);
		}  
		flag=0;
		System.out.println("Enter the expected runner up team of IPL Season 13");
		String b=sc.nextLine();
		try
		{
		for(int i=0;i<Teamarray.length;i++)
		{
			if(b.equalsIgnoreCase(Teamarray[i]))
				flag=1;
		}
		if(flag==0)
			throw new Teamnamenotfoundexception();
		}
		catch(Exception m)
		{
			System.out.print(m+":\"Entered team is not a part of IPL Season 13\"");
			System.exit(0);
		} 
		
		if(flag==1)
		{
			System.out.println("Expected IPL Season 13 winner:"+a);
			System.out.println("Expected IPL Season 13 runner:"+b);
		}
		

}
}
