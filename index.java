import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int a[]=new int[m];
		for(i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
			}
			for(i=0;i<m;i++)
			{
				System.out.println(a[i]+ " " +i);
			}
	}
}
