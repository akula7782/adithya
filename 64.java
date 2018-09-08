/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m,k,p;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		k=sc.nextInt();
		p=m+k;
		if(p%2==0)
		System.out.print("even");
		else
		System.out.print("odd");
		}
}
