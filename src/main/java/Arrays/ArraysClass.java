package Arrays;

public class ArraysClass {
	
	int[] age = {10,13,67,89,5,67};
	
	String[] course =new String[4];
	
	public void AddCourse()
	{
		course[0]="JAVA";
		course[1]="Python";
		course[2]="C#";
		course[3]=".Net";
		//course[4]="c++";
		//course[5]="Ruby";
		System.out.println(course);
		for(String eachvalue : course)
		{
			System.out.println(eachvalue);
		}
	}
	
	public void GetAge()
	{
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		
		for(int eachvalue : age)
		{
			System.out.println(eachvalue);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysClass A = new ArraysClass();
		A.AddCourse();
	}

}
