import java.util.Scanner;

class MyCustomException extends Exception  
{
  MyCustomException (String s1)
  {
	  super(s1);
  }

}  
    
public class TestCustomException2  
{  
   
    public static void main(String args[])  
    {  
        try  
        {  
        	String user ="nandini";
        	int password=123;
        	
        	Scanner s=new Scanner (System.in);
        	System.out.println("enter username:");
        	System.out.println("enter password:");
        	
        	String user1=s.nextLine();
        	int passcode= s.nextInt();
        	
        	if(user.equals(user1) && password==passcode)
        	{
        		System.out.println("login success");
        	}
        	else {
        		 throw new MyCustomException("Credentials missmatch, Please enter correct credentials to login into our site");
        	}
          
             
        }  
        catch (MyCustomException ex)  
        {  
        	System.out.println(ex.getMessage());
            System.out.println("Please enter correct credentials");  
              
        }  
  
    
    }  
}  