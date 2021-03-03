import java.util.Date;

public class Player {
	
private String name;
private Date dateOfBirth;
private String skill;
private int numberOfMatches;
private int runs;
private int wickets;
private String nationality;
private double powerRating;
public Player(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
		String nationality, double powerRating) {
	super();
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.skill = skill;
	this.numberOfMatches = numberOfMatches;
	this.runs = runs;
	this.wickets = wickets;
	this.nationality = nationality;
	this.powerRating = powerRating;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public int getNumberOfMatches() {
	return numberOfMatches;
}
public void setNumberOfMatches(int numberOfMatches) {
	this.numberOfMatches = numberOfMatches;
}
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
}
public int getWickets() {
	return wickets;
}
public void setWickets(int wickets) {
	this.wickets = wickets;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public double getPowerRating() {
	return powerRating;
}
public void setPowerRating(int powerRating) {
	this.powerRating = powerRating;
}
int i=1;
@Override
public String toString() {
	System.out.println("Player"+i++);
	return  "name=" + name +"\n" + "dateOfBirth=" + dateOfBirth +"\n" + "skill=" + skill +"\n"+ "numberOfMatches="
			+ numberOfMatches+"\n" + "runs=" + runs+"\n" + "wickets=" + wickets +"\n"+ "nationality=" + nationality+"\n"
			+ "powerRating=" + powerRating+ "\n" ;
}

public boolean equals(Object o)
{
	if(o==this)
	{
		return true;
	}
	 if (!(o instanceof Player)) { 
         return false; 
     } 
        
     Player c = (Player) o; 
     return name.equals(c.name)
             && skill.equals(c.skill)&& nationality.equals(c.nationality) ; 
 } 





}


