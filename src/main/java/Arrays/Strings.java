package Arrays;

public class Strings {
	
	String name =" Sathish kumar R ";
	String name1 ="Sathish kumar r";
	
	public void GetString()
	{
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.charAt(8));
		System.out.println(name.compareTo(name1));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.trim());
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.contains("at"));
		System.out.println(name.startsWith("at"));
		System.out.println(name.endsWith("at"));
		System.out.println(name.isEmpty());
		System.out.println(name.replace("a", "A"));
		String[] afterSplit = name1.split("a");
		for(String eachvalue : afterSplit)
		{
			System.out.println(eachvalue);
		}
		System.out.println(name.substring(3,6));
		System.out.println(name.substring(3));
		char[] convetToChar = name.toCharArray();
		for(char eachvalue : convetToChar)
		{
			System.out.println(eachvalue);
		}
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(name1));
		System.out.println(name+name1);
		byte[] eah =name.getBytes();
		for(byte eachvalue : eah)
		{
			System.out.println(eachvalue);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings S = new Strings();
		S.GetString();
	}

}
