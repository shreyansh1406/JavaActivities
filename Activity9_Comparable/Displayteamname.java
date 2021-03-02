import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Displayteamname {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no=Integer.parseInt(br.readLine());
		String teamname,playername;
		Set<Team>stteam=new TreeSet<Team>();
		boolean b=false;
		
		
		
		
		for(int i=1;i<=no;i++)
			
		{
			String str=br.readLine();
			String []pro=str.split("\\|");
			teamname=pro[0];
			playername=pro[1];
			b=false;
			for(Team t:stteam)
			{
				if(t.getName().equals(teamname))
				{
					t.addPlayer(playername);
					b=true;
				}
			}
			if(b==false)
			{
				Team t=new Team(teamname);
				t.addPlayer(playername);
				stteam.add(t);
			}
		}
		System.out.println("Team and Details:");
		for(Team t:stteam)
		{
			System.out.println(t.getName());
			List<Playerclass> li=t.getPlayerList();
			for(Playerclass p:li) {
				System.out.println("--"+p.getName());
			}
		}
	}

}
