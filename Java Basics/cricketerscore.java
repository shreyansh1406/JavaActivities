import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,s;
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array with id");
        n = sc.nextInt();
        
        if(n<0)
        {
        System.out.println("invalid array size");
        System.exit(0);
        }
        
        int a[] = new int[n];
        System.out.println("Enter all the Scores:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]<0)
            {
            System.out.println("invalid input");
            System.exit(0);
            }
        }
        System.out.print("Enter the given Score along with id:");
        s = sc.nextInt();
        if(s<0)
            {
            System.out.println("invalid input");
            System.exit(0);
            }
        findCricketerId(a,n,s);
        
	}
	
	
  static void  findCricketerId(int a[],int n,int e)
	{
	    int cricketer[]=new int[n];
	    int c=0;
	    for(int i = 1; i < n; i+=2)
        {
            if(a[i]>e)
            {
                cricketer[i]=a[i-1];
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(cricketer[i]==0)
            continue;
            else
            System.out.println("Crickter's id is "+ cricketer[i]);
            
        }
	}
}
