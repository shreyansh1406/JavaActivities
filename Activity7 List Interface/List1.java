import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class List1{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Playerdetails \n");
		System.out.println("Enter the PlayerName \n");
		String playerName = br.readLine();
		System.out.println("Enter Age \n");
		int age = Integer.parseInt(br.readLine());
		System.out.println("EnterCountry \n");
		String country = br.readLine();
		ArrayList al = new ArrayList();
		al.add(playerName);
		al.add(age);
		al.add(country);
		System.out.println(al);
		System.out.println("Enter Player Skill \n");
		String skill = br.readLine();
		System.out.println("Enter Position to add skill \n");
		int skillPosition = Integer.parseInt(br.readLine());
		al.add(skillPosition, skill);
		System.out.println(al);
		System.out.println("Enter Array Elemnt to be removed \n");
		int positionRemove = Integer.parseInt(br.readLine());
		al.remove(positionRemove);
		System.out.println(al);		
		
		

		
		
	}
	
}