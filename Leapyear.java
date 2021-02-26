import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		n=sc.nextInt();
		int r=checkLeapYear(n);
		System.out.println(r);
	}
   static int checkLeapYear(int n)
	{
	    int r=0;
	    if(n<0)
	    {
	        return -1;
	    }
	    else if (((n % 4 == 0) && (n % 100!= 0)) || (n%400 == 0))
         return 1;
         else
         return 0;
	    
	}
}
