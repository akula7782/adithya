import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
                        int n=sc.nextInt();
                        int t=n,i=0;
                        int count=0;
                        while(t!=0)
                        {
                         t=t/10;
                         count++;
                        }
                        int[] arr=new int[count];
                        while(n!=0)
                        {
                          arr[i]=n%10;
                          i++;
                          n=n/10;
                        }
                        for(int j=count-1;j>0;j--)
                        {
                          System.out.print(arr[j]);
                          System.out.print(" ");
                        }
                        System.out.print(arr[0]);
	}
}

