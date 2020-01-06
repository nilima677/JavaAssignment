package myfirst;

public class Student2 {

	public int Sum(int a,int b)
	{
	 
     int c;
     c=a+b;
     return c;
	}
	public int Sub(int a,int b)
	{
		int c;
	    c=a-b;
	    return c;
	}
	public int mul(int a,int b)
	{
		int c;
	    c=a*b;
	    return c;
	}
	public void div(int a,int b)
	{
		int c;
	    c=a/b;
	    System.out.println("Final Div Result Set(((10-2)+2)*)-2)/2)= "+c);
	}
	public static void main(String args[])
	{
		
		student nilima =new student ();
		int sub=nilima.Sub(10,2);
		System.out.println("First Sub is "+sub);
		int sum=nilima.Sum(sub,2);
		System.out.println("Second Sum is "+sum);
		int mul=nilima.mul(sum,2);
		System.out.println("Third mul "+mul);	
		int subagain=nilima.Sub(mul,2);
		System.out.println("Fourth sub is "+subagain);	
		nilima.div(subagain,2);	
		
	}
	
}




