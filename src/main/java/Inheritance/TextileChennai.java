package Inheritance;

public class TextileChennai extends SuperMarketHeadQuaters{
	
	String[] Dress = {"Phant","shirt","t-shirt"};
	
	public void GetTextileName()
	{
		System.out.println(Name + " - Textile");
	}
	
	public void GetDress()
	{
		System.out.println("***** Dresses *****");
		for(String eachDress :Dress)
		{
			System.out.println(eachDress);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextileChennai T = new TextileChennai();
		T.GetTextileName();
		T.GetDress();
	}

}
