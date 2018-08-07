/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum=0,rem,temp,k,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
    	k=sc.nextInt();
    	for(i=n+1;i<k;i++)
	  {
		temp=i;
		sum=0;
		
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
			if(sum==i)
			{
				System.out.println(sum+ "is a armstrong ");
			}
			else
			{
				System.out.println(i+ "is not a armstrong ");	
			}
		
		}
	}
}
