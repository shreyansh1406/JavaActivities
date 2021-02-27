import java.util.*;
public class Arrayindexout {

	public static void main(String[] args) {
		try
		{
			
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number of overs \n");
			int overs = sc.nextInt();
			System.out.println("Enter run for runs for each over");
			int [] arr = new int[overs];
			for (int i = 0; i < overs; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the over number");
			int on = sc.nextInt();
			System.out.println("Runs Scored in this over " + arr[on-1]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e);
		}
	}
}


