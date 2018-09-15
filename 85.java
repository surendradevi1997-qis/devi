/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String even="";
		String odd="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				even=even+str.charAt(i);
			}
			else
			{
				odd=odd+str.charAt(i);
			}
		}
		System.out.print(even+" "+odd);
	}
}
