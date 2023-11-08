package Polymorphism;

public abstract class AbstractionClass {
	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public abstract void GetDiscount(int amount);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*AbstractionClass A = new AbstractionClass();
		A.GetDiscount(100);*/
	}

}
