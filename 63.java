import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int min;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(int i=0;i<10;i++)
		{
			if(min>a[i])
		              min=a[i];
		            }
		System.out.println(min);
	}
}
