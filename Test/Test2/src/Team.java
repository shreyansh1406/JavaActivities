import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private List<Player> playerList=new ArrayList<Player>();
	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	public void addPlayerToTeam(Player player) 
	{
		playerList.add(player);
		
	}
	public Boolean removePlayerFromTeam(String name)
	{
		for(Player p: playerList)
		{
			if(p.getName().equals(name))
			{
				
			}
		}
	}

}
