import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
                        int count = 0;
                        for (int i=0; i<input.length(); i++) {
                        if (input.charAt(i) != ' ') {
                         ++count;
                        }
                    }
                     System.out.println(count);
   }
}
