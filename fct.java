/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     	int n,i,fact=1;
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			}
			System.out.println(fact+ " ");
			}
}
