package Inheritance;

public class SuperMarketHeadQuaters {
	
	String Name = "SAT Super MArket";
	String[] Veg= {"Brinjal","tomato","onion","cabbage"};
	String[] fruit = {"apple","orange","banana","grapes"};
	String[] nuts= {"walnet","drygrapes","chasew"};
	
	public boolean GetVeg(String item)
	{
		for(String eachVeg :Veg)
		{
			
			if(eachVeg.equalsIgnoreCase(item))
			{
				System.out.println(eachVeg +" is available");
				return true;
			}
		}
		return false;
	}
	
	public boolean GetFruit(String item)
	{
		for(String eachVeg :fruit)
		{
			
			if(eachVeg.equalsIgnoreCase(item))
			{
				System.out.println(eachVeg +" is available");
				return true;
			}
		}
		return false;
	}
	
	public boolean GetNuts(String item)
	{
		for(String eachVeg :nuts)
		{
			System.out.println(eachVeg);
			if(eachVeg.equalsIgnoreCase(item))
			{
				return true;
			}
		}
		return false;
	}
	

	/*public static void main(String[] a)
	{
		SuperMarketHeadQuaters s = new SuperMarketHeadQuaters();
		System.out.println(s.GetVeg("tomato"));
	}*/
}
