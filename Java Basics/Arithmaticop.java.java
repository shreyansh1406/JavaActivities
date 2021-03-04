import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    float a1, a2;
    int a3;
    Scanner sc = new Scanner (System.in);

      System.out.println ("Enter the first Argument");
      a1 = sc.nextFloat ();
      System.out.println ("Enter the Second argument");
      a2 = sc.nextFloat ();

      System.out.println ("Enter the third argument");

      a3 = sc.nextInt ();
    float r = PerformArithmaticoperation (a1, a2, a3);
    if (r == -1)
      System.out.println ("Invlaid input");
    else
    {
        System.out.println ("The final result is");
        System.out.println (r);
    }

  }
  static float PerformArithmaticoperation (float a1, float a2, int a3)
  {
    if (a1 < 0 || a2 < 0 || a1 > 32767 || a2 > 32767)
      {
	return -1;

      }
    else if (a3 > 4 || a3 < 1)
      {
	return -1;
      }
    else

      {
	float r = 0;

	switch (a3)
	  {
	  case 1:

	    r = a1 + a2;

	    break;

	  case 2:

	    r = a1 - a2;

	    break;

	  case 3:

	    r = a1 * a2;

	    break;

	  case 4:
        
	    r = a1 / a2;

	    break;

	  default:

	    System.out.println ("You enter wrong input");

	    break;
	  }
	return (r);
      }

  }
}