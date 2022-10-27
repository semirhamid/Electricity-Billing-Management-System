package Project;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author semha
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electric", "root","0461104763");
        return con;
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
            
        }catch(ClassNotFoundException e){
        JOptionPane.showConfirmDialog(null, e.getMessage());
        }
        return null;
    }
    }

    
