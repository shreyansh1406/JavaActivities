import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {

	public static void main(String[] args) throws IOException, ParseException {
	System.out.println("enter no. of players");
	List<Player> playerList=new ArrayList<Player>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      System.out.println("enter palyerlist");
      for(int i =0;i<a;i++) {
    	  String b=br.readLine();
          String b1[]=b.split(",");
          int nom=Integer.parseInt(b1[3]);
          int runs=Integer.parseInt(b1[4]);
          int w=Integer.parseInt(b1[5]);
          double po=Double.parseDouble(b1[5]);
          Date date=new SimpleDateFormat("dd-MM-yyyy").parse(b1[1]);
          Player p1=new Player(b1[0],date,b1[2],nom,runs,w,b1[7],po);
          playerList.add(p1);
          p1.calculateNationalityCount(playerList);
      }
    
     
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String a=br.readLine();
//        System.out.println("enter player 2 detail");
//        String b=br.readLine();
//        String a1[]=a.split(",");
//        String b1[]=b.split(",");
//        int nom=Integer.parseInt(a1[3]);
//        int runs=Integer.parseInt(a1[4]);
//        int w=Integer.parseInt(a1[5]);
//        double po=Double.parseDouble(a1[5]);
//        Date date=new SimpleDateFormat("dd-MM-yyyy").parse(a1[1]);
//        Player p1=new Player(a1[0],date,a1[2],nom,runs,w,a1[7],po);
//        
//        
//        int no=Integer.parseInt(a1[3]);
//        int run=Integer.parseInt(a1[4]);
//        int wi=Integer.parseInt(a1[5]);
//        double p=Double.parseDouble(a1[5]);
//        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(a1[1]);
//        Player p2=new Player(b1[0],date1,b1[2],no,run,wi,b1[7],p);
//        
//        System.out.println(p1);
//        System.out.println(p2);
//        if (p1.equals(p2)) { 
//            System.out.println("Player 1 is same as Player 2"); 
//        } else { 
//            System.out.println("Player 1 and Player 2 are different "); 
//        } 
        
	}

}
