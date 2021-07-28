/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author zeesh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {
private Connection con;
	public Connection letsConnect() {
		
		try {
                    
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// CLASS DRIVER FOR THE CALL TO SQL
			String url = "jdbc:sqlserver://localhost:1433;databaseName=SuperMarket;integratedSecurity=true;";
			con = DriverManager.getConnection(url);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	private void TaST() {
		// TODO Auto-generated method stub

	}
}

