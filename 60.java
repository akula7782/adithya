import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum=0;
		int a[]=new int[40];
                     Scanner sc=new Scanner(System.in);
                     n=sc.nextInt();
                   for(int i=0;i<n;i++)
                   {
                   a[i]=sc.nextInt();
                   sum=sum+a[i];
      	        }
      	       System.out.println(sum);
	}
}
