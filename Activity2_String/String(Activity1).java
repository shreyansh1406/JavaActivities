import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    String s1, s2;
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter first string");
    s1 = sc.nextLine ();
    System.out.println ("enter second string");
    s2 = sc.nextLine ();
    String a = s1.substring (0, 1);
    String b = s1.substring (1, s1.length ());
    b=b.toLowerCase();
    a = a.toUpperCase();
    s1 = a+b;
    System.out.println ("The Final String is");
    System.out.print (s1+" ");
    System.out.println (s2.toUpperCase());
      
 }

}
