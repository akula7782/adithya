import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, mini;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        mini = a[0];
        for(int i = 1; i < n; i++)
        {
            if(mini>a[i])
            {
                mini = a[i];
            }.
        }
        System.out.println(" "+mini);
    }
}
	
