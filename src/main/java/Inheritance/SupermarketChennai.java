package Inheritance;

public class SupermarketChennai extends SuperMarketHeadQuaters{
	
	String[] Rate = {"Brinjal-35","tomato-45","onion-20","cabbage-30"};
	
	public void GetName()
	{
		Name = Name +"sathish";
		System.out.println(Name +" - Chennai");
		GetFruit("Orange");
	}
	
	public void GetRate(String VegName,String[] Rate)
	{
		for(String eachVeg :Rate)
		{
			String[] eachVegItem =eachVeg.split("-");
			if(VegName.equalsIgnoreCase(eachVegItem[0]))
			{
				System.out.println(VegName+" price is: "+eachVegItem[1]);
				break;
			}
		}
	}
	
	public void CheckAvailabilityAndShowRate(String veg)
	{
		if(GetVeg(veg) == true)
		{
			GetRate(veg,Rate);
		}
		else
		{
			System.out.println("The requested veg is not avaialbe .please try on tomorrow");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupermarketChennai s = new SupermarketChennai();
		s.GetName();
		s.CheckAvailabilityAndShowRate("tomato");
	}

}
