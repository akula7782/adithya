import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner s=new Scanner(System.in);
	  String string=s.nextLine();
	  int i,co=0;
	  char c;
	 for(i=0;i<string.length();i++)
	  {
	  	c=string.charAt(i);
	  	if(Character.isLetter(c))  
	  	{
	  	continue;	
	  	}
	         if(c==' ') 
	         {
	         	continue;
	         }
	  	if(Character.isDigit(c))  
	  	{
	  	continue;	
	  	}
	           else
	 	{
	 		co++;
	 	}
	 }
	 System.out.println(co);
	
	}
}
