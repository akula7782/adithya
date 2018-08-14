import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int digit=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
      int count=0;
      for (int i=0; i<str.length(); i++) {
          if (Character.isDigit(str.charAt(i))) {
              count++;  
          }
      }
      System.out.println(count);
   }
}
 

