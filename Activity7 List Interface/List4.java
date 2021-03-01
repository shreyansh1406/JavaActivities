import java.util.*;

public class List4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfMatch = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<numberOfMatch; i++)
		{
			int j = sc.nextInt();
			al.add(j);	
		}
		int Fifty = 0, Hun = 0;

		 for (Integer i : al) 
		 {
	          if(i>50 && i<100)
	          {
	        	  Fifty++;
	          } 
        if( i >=100)
	          {
	        	Hun++;  
          }
		
		 }
		 System.out.println(Fifty);
		 System.out.println(Hun);

	}
}