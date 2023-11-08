package basics;

public class FirstClass {
	
	// accessmodifier datatype variablename = value;
	
	protected int firstNumber = 01234567; //global variable
	static char name = 's'; // static variable
	String course = "Python";
	boolean status = true;
	double amount =12.345;
	
	int[] age = {23,45,67,23,40};
	

	int a;
	//Methods
	// 1.Method with out parameter /arguments
	// 2.Method with parameter /arguments
	
	// 3. Method with out return type
	// 4. Method with return type
	
	// syntax : accessmodifier returntype methodname(){}
	
	//constructor
	//1. Consturctor name should be same as your class name
	//2. it doesnot returntype
	//3. We no need to call this constructor
	// 1.with parameter 2. with out parameter
	
	/*public FirstClass(int a, int b)
	{
		this.a=a;
		System.out.println("Hi i am constructor !!");
	}*/
	
	 void WelcomeMessage()  //Method
	{
		System.out.println("To fita from Message" +name); // Method implementation
	}
	
	public void Add( int b)  //Method
	{
		int firstNumber = 20; //local variable 
		// a=a+1;
		int c=a+b;
		System.out.println("The addition of 2 numbers is: "+firstNumber);
	}
	
	public double Discount(int amount, double discount)  //Method
	{
		double discountamount = amount*discount;
		return discountamount;
	}
	
	public void invoice(int billAmount, double billDiscount)
	{
		System.out.println("Your actual Bill amount is: "+ billAmount);
		System.out.println("You discount percentage is: "+billDiscount);
		double discountValue = Discount(billAmount, billDiscount) ;
		System.out.println("your discout amount is: "+discountValue);
		double totalInvoice =billAmount-discountValue;
		System.out.println("your total Bill amount is: "+totalInvoice);
		
	}
	
	
	public static void main(String[] name) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		/*System.out.print("Welcome");
		System.out.print("!");*/
		System.out.println("To fita");
		FirstClass objName =new FirstClass();
		objName.WelcomeMessage(); //method call
		objName.Add(8);
		objName.invoice(1000, 0.25);
	}

}


