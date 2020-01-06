package myfirst;

public class Constructor
{
public Constructor()
{		
this(2,3,4);
System.out.println("Default con");
}
public Constructor(int a)
{
this();
System.out.println("One parameter con");
}
public Constructor(int a,int b)
{
	this(1,2,3,4);
 System.out.println("Two parameter con");
}
public Constructor(int a,int b,int c)
{
 System.out.println("Three parameter con");
}
public Constructor(int a,int b,int c,int d)
{
this(1);
System.out.println("Four parameter con");
}
 public static void main(String args[])
 { 
	 Constructor nilima=new Constructor(1,2);
 }
}