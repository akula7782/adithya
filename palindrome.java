/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0,rem,rev,m;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		m=n;
		while(n>0)
	{
		rem=n%10;
		sum=sum*10+rem;
		n=n/10;
		}
		if(sum==m)
		{
		System.out.println(" given number"+m+"palindrome");		}
		else
	            {
		  System.out.println("given number"+m+"not palindrome");
				
	            }
     }
	
}
	
