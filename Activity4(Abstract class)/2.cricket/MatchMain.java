import java.util.*;
public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		System.out.println("Enter the Match Format");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1)
		{
			System.out.println("Enter the Current Score");
			int o1=sc.nextInt();
			System.out.println("Enter the Current Over");
			int o2=sc.nextInt();
			System.out.println("Enter the Target Score");
			int o3=sc.nextInt();
			System.out.println("Requirements");
			ODIMatch obj=new ODIMatch();
			System.out.print("Need "+(o3-o1));
			int c =obj.calculateBalls(o2);
			float d=obj.calculateRunRate(o1,o2,o3);
			obj.display(d,c);
			
			
		}
		else if(a==2)
		{
			System.out.println("Enter the Current Score");
			int o1=sc.nextInt();
			System.out.println("Enter the Current Over");
			int o2=sc.nextInt();
			System.out.println("Enter the Target Score");
			int o3=sc.nextInt();
			System.out.println("Requirements");
			T20Match obj=new T20Match ();
			System.out.print("Need "+(o3-o1));
			int c =obj.calculateBalls(o2);
			float d=obj.calculateRunRate(o1,o2,o3);
			obj.display(d,c);
		}
		else
		{
			System.out.println("Enter the Current Score");
			int o1=sc.nextInt();
			System.out.println("Enter the Current Over");
			int o2=sc.nextInt();
			System.out.println("Enter the Target Score");
			int o3=sc.nextInt();
			System.out.println("Requirements");
			TestMatch obj=new TestMatch();
			System.out.print("Need "+(o3-o1));
			int c =obj.calculateBalls(o2);
			float d=obj.calculateRunRate(o1,o2,o3);
			obj.display(d,c);
		}
		

	}

}
