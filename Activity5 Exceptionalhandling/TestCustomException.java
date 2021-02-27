import java.util.*;
class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
}  
public class TestCustomException 
{  
	 public static void main(String[] args) {
		try{  
			System.out.println("enter Age:");
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age<18)  
			      throw new InvalidAgeException("not valid");  
			     else  
			      System.out.println("welcome to vote");  
			    
		      }
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
			}  
		    
		  }  	
	}


