import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
    String s1, s2;
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter first string");
    s1 = sc.nextLine ();
    System.out.println ("enter second string");
    s2 = sc.nextLine ();
    String a = s1.substring (s1.indexOf(' ')+1);
    String b = s2.substring (s2.indexOf(' ')+1);
    a=a.toLowerCase();
    b=b.toLowerCase();
    if(a.equals(b))
    System.out.println ("Yes");
    else 
    System.out.println ("No");
    }
}

