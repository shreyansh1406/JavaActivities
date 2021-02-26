import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("1.two wheeler");
		System.out.println("2.four wheeler");
		int t=Integer.parseInt(br.readLine());
		if(t==1)
		{
		System.out.println("enter vehicle make");
		String m=br.readLine();
		System.out.println("enter vehicle number");
		String no=br.readLine();
		System.out.println("enter fuel type");
		System.out.println("1.petrol");
		System.out.println("2.diesel");
		int b=Integer.parseInt(br.readLine());
		String s="";
		if(b==1)
		{
			s="petrol";
		}
		else if(b==2)
		{
			s="diesel";
		}
		else
		{
			s="";
		}
		
		System.out.println("enter fuel capacity:");
		int cap=Integer.parseInt(br.readLine());
		System.out.println("enter Engine CC:");
		int c1=Integer.parseInt(br.readLine());
		System.out.println("is kickstart avilable[yes/no]");
		String a=br.readLine();
		boolean ks=true;
		if(a.equalsIgnoreCase("Yes"))
		{
			ks=true;
		}
		else
		{
			ks=false;
		}
		
		TwoWheeler tw= new TwoWheeler(m,no,s,cap,c1,ks);
		tw.displayMake();
		tw.displayBasicInfo();
		tw.displayDetailInfo();
		
		
		}
		
		else if(t==2) {
			
			System.out.println("enter vehicle make");
			String m=br.readLine();
			System.out.println("enter vehicle number");
			String no=br.readLine();
			System.out.println("enter fuel type");
			System.out.println("1.petrol");
			System.out.println("2.diesel");
			int b=Integer.parseInt(br.readLine());
			String s="";
			if(b==1)
			{
				s="petrol";
			}
			else if(b==2)
			{
				s="diesel";
			}
			else
			{
				s="";
			}
			
			System.out.println("enter fuel capacity:");
			int cap=Integer.parseInt(br.readLine());
			System.out.println("enter Engine CC:");
			int c1=Integer.parseInt(br.readLine());
			System.out.println("Audio system");
			String a=br.readLine();
			System.out.println("no. of doors");
			int d=Integer.parseInt(br.readLine());
			
			
			FourWheelers tw= new FourWheelers(m,no,s, cap, c1,a,d);
			tw.displayMake();
			tw.displayBasicInfo();
			tw.displayDetailInfo();
			
			
		}
		
	}

}
