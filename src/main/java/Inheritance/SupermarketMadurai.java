package Inheritance;

public class SupermarketMadurai extends SuperMarketHeadQuaters{
	
	SuperMarketHeadQuaters sMH = new SuperMarketHeadQuaters();
	static String[]  MaduraiRate = {"Brinjal-15","tomato-95","onion-70","cabbage-10"};
	
	public void GetNameInMadurai()
	{
		System.out.println(sMH.Name +" - Madurai");
	}
	
	public void GetFruitsInMadurai()
	{
		System.out.println("****** Fruits List ******");
		for(String eachFruit : sMH.fruit)
		{
			System.out.println(eachFruit);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupermarketMadurai S = new SupermarketMadurai();
		S.GetNameInMadurai();
		//S.GetRate("tomato",MaduraiRate);
		S.GetFruitsInMadurai();
	}

}
