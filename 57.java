import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,m,count=0;
              Scanner sc=new Scanner(System.in);
              n=sc.nextInt();
              k=sc.nextInt();
              int a[]=new int[20];
              for(int i=0;i<n;i++)
              {
           	 a[i]=sc.nextInt();
              if(a[i]==k)
              {
              	count++;
              }
              }
            System.out.println(count);  
	}
}
