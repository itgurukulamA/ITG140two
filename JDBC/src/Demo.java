import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Demo {
 static Logger log=Logger.getLogger(Demo.class);
	public static void main(String[] args) throws ClassNotFoundException{
		//Properties.con
		System.out.println("Hello");
		 log.info("record inserted");
		 BasicConfigurator.configure();
		// TODO Auto-generated method stub
		try {
			//PropertyConfigurator.configure("log.properties");
			  System.out.println("Hello1");
		  Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itg", "root", "root");
	      PreparedStatement  a=con.prepareStatement("insert into itg140 values(78,21,'ganesh','6320036200')"); 
	      int rs = a.executeUpdate();
	      if (rs>0) {
	    	  System.out.println("Hello");
	    	  log.info("record inserted");
	      }
	      else {
	    	  log.info("not inserted");
	      }
	}
	catch(Exception e){
	    	  log.error("Exception occured"+e);
	      }
	}
}
