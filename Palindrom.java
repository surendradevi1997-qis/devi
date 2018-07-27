/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=121,rev=0,res,temp;
		temp=n;
		while(n!=0)
		{
			res=n%10;
			rev=rev*10+res;
			n=n/10;
		}
		if(temp==rev)
		{
		System.out.println(rev+"is a polindrom ");
		}
		else
		{
			System.out.println(rev+"is not a polindrom ");
		}
	}
}
