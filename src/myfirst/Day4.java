package myfirst;

import java.util.Scanner;

public class Day4 {

	public int sum(int x1,int x2)
	{
	 
     int c;
     c=x1+x2;
     return c;
	}
	public int sub(int x1,int x2)
	{
		int c;
	    c=x1-x2;
	    return c;
	}
	public int mul(int x1,int x2)
	{
		int c;
	    c=x1*x2;
	    return c;
	}
	public void div(int x1,int x2)
	{
		int c;
	    c=x1/x2;
	    System.out.println("Final Div Result Set(((x1-x2)*x3)-x4)+x5)/X6= "+c);
	}
	
public static void main(String args[])	
{ 
	
 System.out.println("Enter X1 value");
 Scanner nilima = new Scanner(System.in);
 int x1=nilima.nextInt();
 System.out.println("X1=" +x1);
 
 System.out.println("Enter X2 value");
 int x2=nilima.nextInt();
System.out.println("X2=" +x2);
 
 System.out.println("Enter X3 value");
 int x3=nilima.nextInt();
 System.out.println("X3=" +x2);
 
 System.out.println("Enter X4 value");
 int x4=nilima.nextInt();
 System.out.println("X4=" +x4);
 nilima.close();
 
 System.out.println("Result Set");
 Day4 nil=new Day4();
 int sub=nil.sub(x1,x2);
 System.out.println("Sub Result" +sub);
 
 int mul=nil.mul(sub,x2);
 System.out.println("Mul Result"+mul);
 
 int sub1=nil.sub(mul,x2);
 System.out.println("Sub Result"+sub1);
 
 
 int sum1=nil.sum(sub1,x2);
 System.out.println("Sum1 Result"+sum1);
 
 nil.div(sum1,x2);

 
 
 
	 }
}
