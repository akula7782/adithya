import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String s1, s2;
      Scanner in = new Scanner(System.in);
        s1 = in.next();
         s2 = in.next();
         if (s1.compareTo(s2) > 0)
         System.out.println(s1);
      else if (s1.compareTo(s2) < 0)
         System.out.println(s2);
      else   
         System.out.println("equal");
   }
	
	}

