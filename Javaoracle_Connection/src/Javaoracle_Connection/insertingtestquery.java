package Javaoracle_Connection;
import java.sql.*;

public class insertingtestquery
{
public static void main(String[] args)
{
	Connection con = null;
    Statement stmt = null;
    
try
{
	//Table name is person
String query1 =  "insert into person values(9,'Nick')";

String query2 =  "insert into person values(90,''Nikhil')";

String query3 =  "insert into person values(80,'Gaurav')";
		 
//Loading and registering Oracle database thin driver			 
Class.forName("oracle.jdbc.driver.OracleDriver");

//Creating a connection between Java program and Oracle database.
 con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","workspacename", "password");

//Creating a Statement object to excute SQL statements 
 stmt = con.createStatement();

//Executing a SQL INSERT query using executeUpdate()  method of Statement object.
int count = stmt.executeUpdate(query1);
System.out.println("Number of rows updated in database =  " + count);

//Executing next SQL INSERT query using executeUpdate()  method of Statement object.
count = stmt.executeUpdate(query2);
System.out.println("Number of rows updated in database = " + count);

//Executing next SQL INSERT query using executeUpdate()  method of Statement object.
count = stmt.executeUpdate(query3);
System.out.println("Number of rows updated in database = " + count);

}
catch (ClassNotFoundException e) {
    e.printStackTrace();
} catch (SQLException e) {
    e.printStackTrace();
} finally {
    try {
        stmt.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}//main() defintion ends 

}//class definition ends 