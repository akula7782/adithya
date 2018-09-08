import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,i=2;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		boolean flag=false;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			i++;
		}
		if(!flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}

	
