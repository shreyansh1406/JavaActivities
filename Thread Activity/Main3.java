import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int upperRange;
	int lowerRange;
	System.out.println("enter ranges");
	upperRange=Integer.parseInt(br.readLine());
	lowerRange=Integer.parseInt(br.readLine());
	

	Scores ss=new Scores(upperRange,lowerRange);
	
	
	
		ss.start();
		try
		{
			ss.join(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		ss.getScores();
		}
	}
