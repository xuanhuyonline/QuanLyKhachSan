/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Xuan Huy
 */
public class SQL {
    private Connection con;
    private String connectionURL;
    public Connection GetConnect(){
        return con;
    }
    public SQL(String sqlInstanceName, String database, String userName,String password){
        try {               
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");            
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(Dao.SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        con=null;
        this.connectionURL="jdbc:sqlserver://" + sqlInstanceName + ":1433" + ";databaseName=" + database +";user="+userName+";password="+password;
    }
    public Connection OpenConnection(){     
        try {
            if(con!=null && con.isClosed()==false)
                return con;
            con = DriverManager.getConnection(this.connectionURL);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public void CloseConnection(){     
        try {
            if(con!=null)
                con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dao.SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
