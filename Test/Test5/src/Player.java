import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

@Override
public String toString() {
	System.out.println("Player");
	return  "name=" + name +"\n" + "dateOfBirth=" + dateOfBirth +"\n" + "skill=" + skill +"\n"+ "numberOfMatches="
			+ numberOfMatches+"\n" + "runs=" + runs+"\n" + "wickets=" + wickets +"\n"+ "nationality=" + nationality+"\n"
			+ "powerRating=" + powerRating+ "\n" ;
}

static Map<String,Integer>calculateNationalityCount(List<String> list) {
	
	
}




}

