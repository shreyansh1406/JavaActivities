import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class List2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Team 1 \n");
		String t1 = br.readLine();
		System.out.println("Enter team 2 \n");
		String t2 =br.readLine();
		System.out.println("Enter team 3 \n");
		String t3 = br.readLine();
		System.out.println("Enter team 4 \n");
		String t4 = br.readLine();
		System.out.println("Enter team 5 \n");
		String t5 = br.readLine();
		ArrayList al = new ArrayList();
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		al.add(t5);
		System.out.println(al);	
		System.out.println("Enter the swap positions \n");
		int swap1 = Integer.parseInt(br.readLine());
		int swap2 = Integer.parseInt(br.readLine());
		Collections.swap(al, swap1, swap2);
		System.out.println("the end result after swaping is:" + al);
		
	}
}