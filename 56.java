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
		Scanner s=new Scanner(System.in);
		int count=0;
		int count1=0;
		int count2=0;
		String sc=s.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(sc.charAt(i)))
			{
			count++;
			}
			else if(Character.isAlphabetic(sc.charAt(i)))
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		if(count>0&&count1>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
