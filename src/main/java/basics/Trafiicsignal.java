package basics;

public class Trafiicsignal {
	
	
	public void GetSignal(String lightcolor,String vehicle ,boolean patient)
	{
		if(lightcolor.equals("Green"))
		{
			System.out.println("You are good to go");
		}
		else if(lightcolor.equals("Red"))
		{
			if(!(vehicle.equals("ambulance") && (patient==true)))
			{
				System.out.println("I am abulance please give a way for me!!!");
			}
			else
			{
			System.out.println("You have to stop");
			}
			
		}
		else if(lightcolor.equals("Orange"))
		{
			System.out.println("You are ready to go");		
		}
		else
		{
			System.out.println("You have entered incorrect color");
		}
	}
	
	public void gender(String Gencode)
	{
		switch(Gencode)
		{
		case "M":
			System.out.println("You are MAle");
			break;
		case "F":
			System.out.println("You are FeMAle");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("Given incorrect code");
			break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trafiicsignal T = new Trafiicsignal();
		T.GetSignal("Red","ambulance",false);
		T. gender("z");
	}

}
