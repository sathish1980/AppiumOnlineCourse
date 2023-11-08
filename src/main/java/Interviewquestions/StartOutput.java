package Interviewquestions;

public class StartOutput {
	
	public void PrintStartOutput(double value)
	{
		for(double i=1.0;i<=5.0;)
		{
			if(value==i)
			{
				break;	
			}
			else
			{
				System.out.println("full");
			}
			i=i+0.5;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartOutput S = new StartOutput();
		S.PrintStartOutput(3.5);
	}
	

}
