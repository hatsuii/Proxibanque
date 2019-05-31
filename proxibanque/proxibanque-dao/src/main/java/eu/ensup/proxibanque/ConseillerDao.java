package eu.ensup.proxibanque;

import java.sql.SQLException;

import eu.ensup.proxibanque.dao.ConnectionDao;
import eu.ensup.proxibanque.dao.Conseiller;
import eu.ensup.proxibanque.domaine.Client;

public class ConseillerDao {

	public static void selectAllClient(Client client) {

		ConnectionDao cd = new ConnectionDao();

		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(client);
		try {
			String sql = "SELECT * FROM `client` ORDER BY `nom` asc;";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete execut�e");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}

	public static void insertClient(Client client) {

		ConnectionDao cd = new ConnectionDao();

		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(client);
		try {
			String sql = "INSERT INTO `client` (`nom`,`prenom`,`cp`,`ville`,`telephone`) VALUES ('" + client.getNom()
					+ "','" + client.getPrenom() + "','" + client.getCp() + "','" + client.getVille() + "','" + client.getTelephone()
					+ "');";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete execut�e");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}

	public static void deleteClient(Client client) {

		ConnectionDao cd = new ConnectionDao();

		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(client);
		try {
			String sql = "DELETE FROM `client` WHERE `id`='" + client.getId() + "';";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete execut�e");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}

	public static void updateClient(Client client) {

		ConnectionDao cd = new ConnectionDao();

		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(client);
		try {
			String sql = "UPDATE `client` SET `nom`='" + client.getNom() + "' ,`prenom`='" + client.getPrenom() + "',`cp`='"
					+ client.getCp() + "',`ville`='" + client.getVille() + "',`telephone`='" + client.getTelephone() + "' WHERE `id`='"
					+ client.getId() + "';";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete execut�e");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}

	public static void listeComptesClient(Client client) {

		ConnectionDao cd = new ConnectionDao();

		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(client);
		try {
			String sql = "SELECT * FROM `compte_courant` WHERE `idClient`='" + client.getId()
					+ "'; SELECT * FROM `compte_epargne` WHERE `idClient`='" + client.getId() + "';";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete execut�e");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}
	public static Conseiller LectureConseiller(Conseiller conseiller){
		
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		System.out.println("connexion etablie");
		try {
			String sql = "SELECT * FROM `conseiller` WHERE `id`='" + conseiller.getId()'";";
			cd.stat.executeQuery(sql);
			Conseiller cons = new Conseiller();
            cons.setId(Integer.parseInt(res.getString("id")));
            cons.setNom(res.getString("nom"));
            cons.setPrenom(res.String("prenom"));
            cons.setProfil(res.String("profil"));
            
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
		return cons;
	}

}
