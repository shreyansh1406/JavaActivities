package test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws ParseException, NumberFormatException, IOException {
			// TODO Auto-generated method stub
	int n;
	System.out.println("enter the number of players");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(br.readLine());
	Player [] pl = new Player[n];
	for(int i=0;i<n;i++) {
		String s;
		s=br.readLine();
		pl[i]=Player. createPlayer(s);
	}
	HashMap<String, Integer> h = new HashMap<String, Integer>(); 
	 
	for (int i = 0; i < n; i++) { 
	
	 if (h.containsKey(pl[i].nationality)) { 
	     h.put(pl[i].nationality, h.get(pl[i].nationality) + 1); 
	 } 
	 
	 else { 
	     h.put(pl[i].nationality, 1); 
	 }
	 Set<Map.Entry<String, Integer> > set = h.entrySet(); 
	 String k = ""; 
	 int value = 0; 
	
	 for (Map.Entry<String, Integer> me : set) {  
	     if (me.getValue() > value) { 
	         value = me.getValue(); 
	         k = me.getKey(); 
	     } 
	 } 
	
	System.out.println("The nationality with maximum players "+k);
	System.exit(0);

} 
} 

	}