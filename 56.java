import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String d;
     int v=0;
     int u=0;
     Scanner s=new Scanner(System.in);
     d=s.next();
     char a[]=d.toCharArray();
     for(int i=0;i<a.length;i++){
         if((a[i]>='A'&&a[i]<='Z')||(a[i]>='a'&&a[i]<='z')){
             v=1;
         }
    else if(a[i]>='0'&&a[i]<='9'){
        u=1;
 }
     }
     int sum=v+u;
     if(sum==2){
         System.out.println("Yes");
     }
 else{
 	System.out.println("No");
	}
}
}
