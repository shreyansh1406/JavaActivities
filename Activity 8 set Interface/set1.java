import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class set1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of players");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter P1 \n");
		String t1 = br.readLine();
		System.out.println("Enter Player 2 \n");
		String t2 =br.readLine();
		System.out.println("Enter Player 3 \n");
		String t3 = br.readLine();
		System.out.println("Enter Player 4 \n");
		String t4 = br.readLine();
		System.out.println("Enter Player 5 \n");
		String t5 = br.readLine();
		HashSet<String> hs = new HashSet<String>();
		hs.add(t1);
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		System.out.println(hs.size());
		

		
		
	}
}