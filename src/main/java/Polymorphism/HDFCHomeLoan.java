package Polymorphism;

public class HDFCHomeLoan extends HDFCBank {
	
	public void GetHomeloanInterest(int amount,int month)
	{
		SetinterestRate(0.30);
		double interest = amount*GetinterestRate()*month;
		System.out.println("Over all amount " +interest);
		System.out.println("Interest Amount : "+(interest-amount));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCHomeLoan H =new HDFCHomeLoan();
		H.GetHomeloanInterest(50000, 10);
	}

}
