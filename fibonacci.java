import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	          int n,t1,t2,i=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		t1=sc.nextInt();
		t2=sc.nextInt();
		 System.out.println(t2);
                       while (i<n)
                       {
                        int sum = t1 + t2;
                        System.out.println(sum);
                        t1 = t2;
                         t2 = sum;
                         i++;
                   }
		
	}
}
