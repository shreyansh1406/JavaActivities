import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date; 
public class MatchSortMain {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
			System.out.println("Enter the no of matches");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			ArrayList<Match> al=new ArrayList<Match>();  
				
			for(int i=1;i<=a;i++)
			{
			System.out.println("Enter match date in (MM-dd-yyyy) ");
			String d=br.readLine();
			   
			System.out.println("Enter team 1 ");
			String n1=br.readLine();
			System.out.println("Enter team 2 ");
			String n2=br.readLine();
			al.add(new Match(d,n1,n2));
			}
			Collections.sort(al);
			System.out.println("Player Details by Score(High to low)");
				
			for(Match st:al){  
				System.out.println("Team 1 "+st.getTeamOne());  
				System.out.println("Team 2 "+st.getTeamTwo());  
				System.out.println("Match held on"+st.getMatchDate());  
					}  
				

	}

}
