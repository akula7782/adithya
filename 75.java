import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String str;
		char[] b =new char[1000];
		int len,a,i;
		Scanner ob = new Scanner(System.in);
		str=ob.next();     
		len =str.length();
			 for(i=0;i<len;i++)
			{
			    b[i] = str.charAt(i);
				if(len%2==0)
		        {
				     a = len/2;
					 if((a==i) || (a==i+1))
					{
					  System.out.print("*");
					}
					else
					{
			         System.out.print(b[i]);
					}
			    }
				else
		        {
				     a = len/2;
					 if(a==i)
					{
					  System.out.print("*");
					}
					else
					{
			         System.out.print(b[i]);
					}
			    }
			}
	}
}
