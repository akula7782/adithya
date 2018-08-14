import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int lines=1;
		Scanner c = new Scanner(System.in);
		String var=c.nextLine();
		while(c.hasNextLine())
                        {  
                        c.nextLine();
                           lines++;
                        }
                         System.out.println(lines);
	}
}
