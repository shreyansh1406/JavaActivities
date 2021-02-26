import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,e;
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        
        if(n<0)
        {
        System.out.println("invalid input");
        System.exit(0);
        }
        
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]<0)
            {
            System.out.println("invalid input");
            System.exit(0);
            }
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        e = sc.nextInt();
        int r=findElementCount(a,n,e);
        System.out.println("Number of Occurrence of the Element:"+r);
	}
	
	
  static int findElementCount(int a[],int n,int e)
	{
	    int c=0;
	    for(int i = 0; i < n; i++)
        {
            if(a[i] == e)
            {
                c++;
            }
        }
        return c;
	}
}
