package Polymorphism;

public class HDFCBank {
	
	private double interestRate = 0.15;
	
	public double GetinterestRate()
	{
		return interestRate;
	}
	
	public void SetinterestRate(double interestRate)
	{
		this.interestRate= interestRate;
	}
	
	public void GetInterest(int amount,int month)
	{
		double interest = amount*interestRate*month;
		System.out.println("Over all amount " +interest);
		System.out.println("Interest Amount : "+(interest-amount));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank H = new HDFCBank();
		H.GetInterest(50000, 10);
	}

}
