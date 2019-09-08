/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 7_amdi
 */
public class conn {
    public static Connection connect()
    {
    try 
        {
  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
  String conn="jdbc:mysql://localhost:3306/mysql";
      Connection con= DriverManager.getConnection(conn, "root", "hamdi123321");
  
            JOptionPane.showMessageDialog(null, "Connected Successfully");
            
            return con;
        }
       
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "User Name or Password is invalid ");
      return null;
        }
    }
    
    
    }
    

