package Polymorphism;

public class SupermarketHeadquatres {
	String[] Veg= {"Brinjal","tomato","onion","cabbage"};
	
	public void GetVeg(String item)
	{
		for(String eachVeg :Veg)
		{
			
			if(eachVeg.equalsIgnoreCase(item))
			{
				System.out.println(eachVeg +" is available");
				//return true;
			}
		}
		//return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupermarketHeadquatres S = new SupermarketHeadquatres();
		S.GetVeg("onion");
	}

}
