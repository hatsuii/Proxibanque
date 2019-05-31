package eu.ensup.proxibanque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author David
 *
 */
public class ConnectionDao {

	public Connection cnx;
	public Statement stat;

	// Connexion a la base de donn�es
	public Connection connection() { // connexion a la bdd
		String url = "jdbc:mysql://localhost/proxibanquebdd";
		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(url, login, password);
			stat = cnx.createStatement();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

		return cnx;
	}

	// Deconnexion de la base de donn�es
	public void deconnection() { // d�connexion de la base
		try {
			cnx.close();
			stat.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}
}
