package Polymorphism;

public class SupermarketChennaii extends SupermarketHeadquatres{

	String[] Veg= {"Drumstick","beans","onion","cabbage"};
	
	public void GetVeg(String vegList)
	{
		for(String eachVeg :Veg)
		{
			if(eachVeg.equalsIgnoreCase(vegList))
			{
				System.out.println(eachVeg +" is available");
				break;
			}
			else
			{
				System.out.println("This item is not avaialble");
			}
		}
	}
	
	public void GetHeadquatersVeg(String veg)
	{
		super.GetVeg(veg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupermarketChennaii s = new SupermarketChennaii();
		s.GetVeg("Drumstick");
		s.GetHeadquatersVeg("carrot");
	}

}
