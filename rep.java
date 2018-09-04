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
		int i,count=0;
		int b=s.nextInt();
		int c=s.nextInt();
		int a[]=new int[b];
		for(i=0;i<b;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<b;i++)
		{
			if(a[i]==c)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
