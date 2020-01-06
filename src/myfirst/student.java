package myfirst;

public class student  
{

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
	    System.out.println("Final Div Result Set(((10+2)-2)*2)/2)= "+c);
	}
	public static void main(String args[])
	{
		
		student nilima =new student ();
		int sum=nilima.Sum(10,2);
		 System.out.println("First sum is "+sum);
		int sub=nilima.Sub(sum,2);
		 System.out.println("Second Sub is "+sub);
		int sum1=nilima.Sum(sub,2);
		System.out.println("Third Sum "+sum1);	
		int mul=nilima.mul(sum1,2);
		System.out.println("Fourth Mul is "+mul);	
		nilima.div(mul,2);	
		
	}
	
}