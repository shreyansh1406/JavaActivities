import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RankingMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Please provide the number of players");
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		ArrayList<Ranking> al=new ArrayList<Ranking>();  
		
		for(int i=1;i<=a;i++)
		{
		System.out.println("Enter the name of the player"+i);
		String n1=br.readLine();
		System.out.println("Enter the score of the player"+i);
		int s=Integer.parseInt(br.readLine());
		al.add(new Ranking(n1,s));
		}
		Collections.sort(al);
		System.out.println("Player Details by Score(High to low)");
		
		for(Ranking st:al){  
			System.out.println(st.getScore()+" "+st.getName());  
			}  
		
		
		

}
}
