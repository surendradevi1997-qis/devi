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
		int n,k,p=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int i=1;i<=k;i++)
		{
			p=p*n;
		}
		System.out.println(p);
	}
}
