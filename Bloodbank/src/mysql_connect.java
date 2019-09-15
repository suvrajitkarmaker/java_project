
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class mysql_connect {

    
   
public static Connection connectDB()    
{
    Connection conn=null;
try
{
Class.forName("com.mysql.jdbc.Driver");

conn = DriverManager.getConnection("jdbc:mysql://localhost/bloodbank","root","");
System.out.print("Database is connected !");
//Statement stt = conn.createStatement();
return conn;
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
return null;
}     
}
}