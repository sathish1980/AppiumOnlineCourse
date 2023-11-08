package Polymorphism;

public class Methodoverloading {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading M = new Methodoverloading();
		M.add(3, 4,6);
		M.add(2.5, 3.8);
	}

}
