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
		int p,t,r,l;
		p=s.nextInt();
		t=s.nextInt();
		r=s.nextInt();
		l=p*t*r/100;
		System.out.print(l);
	}
}
