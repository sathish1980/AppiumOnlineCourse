package Polymorphism;

public class Interfaceimplementation extends Invoice implements Interface1,Interface2 {

	@Override
	public void tax(int amount) {
		// TODO Auto-generated method stub
		double tax = amount*0.15;
		System.out.println(tax);
	}

	@Override
	public void tax1(int amount) {
		// TODO Auto-generated method stub
		double tax = amount*0.25;
		System.out.println(tax);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 I = new Interfaceimplementation();
		I.tax(1000);
	}

	

}
