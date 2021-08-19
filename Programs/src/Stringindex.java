
public class Stringindex {
	public static void main(String args[])
	{
		try
		{
	    String s="Nandini Srinivas";
		char ch = s.charAt(20);
		System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		}

}
