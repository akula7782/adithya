import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1;
          Scanner sc=new Scanner(System.in);
          n1=sc.nextInt();

        
        for(int i = 1; i <= n1; ++i) {
            if (n1 % i == 0) {
                System.out.print(i+" ");
            }
        }
	}
}
