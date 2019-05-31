package eu.ensup.proxibanque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author David
 *
 */
public class ConnectionDao {

	private static Statement statement;

	public Statement connection() throws SQLException { // connexion a la bdd
		 java.sql.Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost/proxibanquebdd?user=root&password=");
            statement = conn.createStatement();
            
        } catch (ClassNotFoundException e) {

            System.out.println("Connextion avec la base de données impossible");
        }
        return statement;
	}

	public void deconnection() {
		try {
//			cnx.close();
//			stat.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}
}