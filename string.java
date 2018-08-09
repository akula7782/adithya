import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
			char c;
		int j;
		int flag=0;
		for(j=0;j<str.length();j++)
		{
			c=str.charAt(j);
			if(Character.isLetter(c))
			{
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("No");
		else
		System.out.println("Yes");
	}
}
