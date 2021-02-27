import java.util.*;
import java.io.*;  
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the total runs Scored");
		try {
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int n1= Integer.parseInt(inp.readLine());
		System.out.println("Enter the total over faced");
		 int n2= Integer.parseInt(inp.readLine());
	     float r;
	     r = n1/n2;
	     System.out.println("The result is" +r);
	         
	      
	      } catch (Exception e) {
	         System.out.println ("the Exception is "+e);
	      }

	}

}
