package Interviewquestions;

public class MultiplyNextNumber {
	
	int[] numbers = {1,2,3,4,5};
	
	public void MultiplyNumbers()
	{
		for(int i=0;i<numbers.length;i++)
		{
			int tempJ=1;
			for(int j=0;j<numbers.length;j++)
			{
				if(i!=j)
				{
					tempJ=tempJ*numbers[j];
				}
			}
			System.out.println("I value is "+i+" :"+tempJ);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyNextNumber M = new MultiplyNextNumber();
		M.MultiplyNumbers();
	}

}
