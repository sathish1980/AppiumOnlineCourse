package basics;

import java.sql.SQLException;

public final class Loops extends SecondClass {
	
	int amount =70;
	int bab=40;
	
	// DRY
	//three types of loop
	// for loop , while loop , do while lopp
	// for(intialization;condition; increment/decrement)
	
	public final void div(int a , int b) throws Throwable
	{
		try
		{
			amount=amount+10;
			// finalize();
			int c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is incorrect data");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	
	public void sampleForLoop()
	{
		try
		{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		
		System.out.println("&&&&&&&&&&&&&&");
		for(int i=0;i<=100;i++)
		{
			
			if(i==50 || i==90)
			{
				continue;
			}
			System.out.println(i);
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public void whileloop() {
		
		int i=101;
		while(i<=100)
		{
			System.out.println(i);
			i=i+1;
		}
	}
	
public void dowhileloop() throws SQLException,NullPointerException,ArithmeticException
{
		
		int i=50;
		do
		{
			System.out.println(i);
			i=i+1;
		}while (i<=100);
	}

public void age(int ages)
{
	if(ages==50)
	{
		// throw new ArithmeticException ("You are 50");
			throw new NullPointerException ("You are 50");
		//throw new SQLException ("You are 50");
	}
	
	System.out.println("Your age is : "+ages);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		//L. div(10,0);
		L.sampleForLoop();
		L.whileloop();
		// L.dowhileloop();
		L.age(50);
		
	}

}
