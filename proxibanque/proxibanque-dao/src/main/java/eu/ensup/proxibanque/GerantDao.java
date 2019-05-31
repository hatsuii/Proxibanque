package eu.ensup.proxibanque.dao;

import java.sql.SQLException;

import eu.ensup.proxibanque.dao.ConnectionDao;
import eu.ensup.proxibanque.domaine.Gerant;

public class GerantDao {
	
	public static void selectAllConseiller(Conseiller conseiller) {

		ConnectionDao cd = new ConnectionDao();

		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(conseiller);
		try {
			String sql = "SELECT `id`,`nom`,`prenom`,`profil` FROM `conseiller` ORDER BY `nom` asc;";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete executée");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}
	
	public static void selectTransaction(Conseiller conseiller) {

		ConnectionDao cd = new ConnectionDao();

		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(conseiller);
		try {
			String sql = "SELECT * FROM `transaction` ORDER BY `date` asc;";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete executée");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}
	

}
