package Polymorphism;

public class Invoice extends AbstractionClass{
	
	public void GetDetails(String Name)
	{
		System.out.println("Hi! "+ Name +" Welcome to the shop");
	}

	
	public void GetDiscount(int amount) {
		// TODO Auto-generated method stub
		int discount = amount-50;
		System.out.println(discount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionClass I = new Invoice();
		I.GetDiscount(1000);
	}

	

}
