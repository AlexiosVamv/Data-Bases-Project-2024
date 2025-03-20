/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author User
 */
public class SQL_GUI {
public static String suser;
public static final String DB_URL = "jdbc:mysql://localhost:3306/project_db ";
public static final String USERNAME = "root";
public static final String PASSWORD = "AlexBam03!";
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       new DBA_Login().setVisible(true);
      
    }
    
}
