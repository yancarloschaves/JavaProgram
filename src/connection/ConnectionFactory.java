
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//faz a conexão com o banco de dados
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://db4free.net:3306/testebdjoezao";
    private static final String USER = "testebancouser";
    private static final String PASS = "testebancopsw";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("ERRO NA CONEXÃO",ex);
        }
        
        
    }
            
    public static void CloseConnection(Connection con) {
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
    
    public static void CloseConnection(Connection con, PreparedStatement stmt){ 
        if(stmt != null){
            
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
            
            CloseConnection(con);
        }
        
    }
    
}
