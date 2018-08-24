import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  int n,t1=1,t2=1,i=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;++i)
                       {
                       	 System.out.println(t1+" ");
                        int sum = t1 + t2;
                         t1 = t2;
                         t2 = sum;
                         
                   }
		}
}
