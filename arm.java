/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0,rem,n,tp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		tp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			}
			if(tp==sum)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
			}
			}

