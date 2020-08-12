package jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {

	static void validate(int age) {
		if(age < 18) {
			try {
				throw new ArithmeticException("not valid");
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
		}
		else  
		      System.out.println("welcome to vote");  
	}
	public static void main(String[] args) {
		validate(8);
		System.out.println("rest of the code");

	}


}
