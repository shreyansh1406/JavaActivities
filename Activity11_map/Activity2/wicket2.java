package map1;

public class wicket2 {
	private String playerName;
	private Bowler bowler;
	public wicket2(String playerName, Bowler bowler) {
		super();
		this.playerName = playerName;
		this.bowler = bowler;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler getBowler() {
		return bowler;
	}
	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}
}
