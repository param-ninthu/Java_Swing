package CoachBookking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
  
  private Connection con;
    public Connection connect()
    {

        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root",""); // here we r getting connection with mysql
           }
        catch(SQLException n)
        {}
        return con;
        
    }
 }
    
