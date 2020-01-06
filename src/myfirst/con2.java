package myfirst;

public class con2 {

	
	public void nil()
	{
		System.out.println("default Method");
		
	}
	

	public void ni1(int a)
	{
		System.out.println("one par Method");
		
	}
	public void ni2(int a,int b)
	{
		System.out.println("Two par Method");
		
	}
	public void nil3(int a,int b,int c)
	{
		
		System.out.println("Three par Method");
		this.nil();
		this.ni1(1);
		this.nil4(1,2,3,4);
		this.ni2(1,2);
			
	}
	public void nil4(int a,int b,int c,int d)
	{
		System.out.println("Four par Method");
	
	}
	 public static void main(String args[])
	 { 
		 con2 nilima=new con2();
		 nilima.nil3(1,2,3);
	 }
	
}
