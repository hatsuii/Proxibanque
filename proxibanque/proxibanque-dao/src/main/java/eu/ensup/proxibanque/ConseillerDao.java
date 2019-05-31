package eu.ensup.proxibanque.dao;

import eu.ensup.proxibanque.domaine.Client;
import eu.ensup.proxibanque.domaine.CompteCourant;
import eu.ensup.proxibanque.domaine.CompteEpargne;
import eu.ensup.proxibanque.domaine.Conseiller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ConseillerDao {

	public ArrayList<Client> selectAllClient() throws SQLException {

		ConnectionDao cd = new ConnectionDao();
                
		
	    ArrayList<Client> liste = new ArrayList<Client>();
            Statement stm = (Statement) cd.connection();
            ResultSet res = stm.executeQuery("SELECT * FROM client");

            while (res.next()) {
            Client bo = new Client();
            bo.setId(Integer.parseInt(res.getString("id")));
            bo.setNom(res.getString("nom"));
            bo.setPrenom(res.getString("prenom"));
            bo.setCp(res.getString("cp"));
            bo.setEmail(res.getString("email"));
            bo.setTelephone(res.getString("telephone"));
            bo.setVille(res.getString("ville"));

            liste.add(bo);
        }
		
		cd.deconnection();
                return liste;
	}
 public Conseiller getIdConseiilerByUserPassword(String login, String password) throws SQLException
        {
            Conseiller bo = new Conseiller();
            ConnectionDao cd = new ConnectionDao();
                
		
                ArrayList<Conseiller> liste = new ArrayList<Conseiller>();
            Statement stm =  cd.connection();
            ResultSet res = stm.executeQuery("SELECT * FROM Conseiller where login = '"+ login +"' and password = '"+password+"'");

            while (res.next()) {
            
            bo.setId(Integer.parseInt(res.getString("id")));
            bo.setNom(res.getString("nom"));
            bo.setPrenom(res.getString("prenom"));
            bo.setIdAgence(res.getString("idAgence"));
            bo.setProfil(res.getString("profil"));

            liste.add(bo);
        }
            
            return bo;
        }
	public static void insertClient(Client client) throws SQLException {

		ConnectionDao cd = new ConnectionDao();


                Statement stm = cd.connection();
		try {
			String sql = "INSERT INTO `client` (`nom`,`prenom`,`cp`,`ville`,`telephone`,`email`) VALUES ('" + client.getNom()
					+ "','" + client.getPrenom()+ "','" + client.getCp() + "','" + client.getVille() + "','" + client.getTelephone()
					+ "','" + client.getEmail() + "');";
			
			stm.executeUpdate(sql);
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
	}

	public static void deleteClient(Client client) throws SQLException {

		ConnectionDao cd = new ConnectionDao();

		Statement stm = cd.connection();
		try {
			String sql = "DELETE FROM `client` WHERE `id`='" + client.getId() + "';";
			stm.executeUpdate(sql);
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
	}
        
        public Conseiller getIdConseiilerByUserPassword(String login, String password) throws SQLException
        {
            Conseiller bo = new Conseiller();
            ConnectionDao cd = new ConnectionDao();
                
		
                ArrayList<Conseiller> liste = new ArrayList<Conseiller>();
            Statement stm =  cd.connection();
            ResultSet res = stm.executeQuery("SELECT * FROM Conseiller where login = '"+ login +"' and password = '"+password+"'");

            while (res.next()) {
            
            bo.setId(Integer.parseInt(res.getString("id")));
            bo.setNom(res.getString("nom"));
            bo.setPrenom(res.getString("prenom"));
            bo.setIdAgence(res.getString("idAgence"));
            bo.setProfil(res.getString("profil"));

            liste.add(bo);
        }
            
            return bo;
        }

	public void updateClient(Client client) throws SQLException {

		ConnectionDao cd = new ConnectionDao();
		Statement stm = cd.connection();
                
		try {
			String sql = "UPDATE `client` SET `nom`='" + client.getNom()+ "' ,`prenom`='" + client.getPrenom() + "',`cp`='"
					+ client.getCp() + "',`email`='" + client.getEmail()+ "',`ville`='" + client.getVille() +  "',`telephone`='" + client.getTelephone() + "' WHERE `id`='"
					+ client.getId() + "';";
                        
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		cd.deconnection();
	}

	public ArrayList<CompteCourant> listeComptesCourantClient(Client client) throws SQLException {

		ConnectionDao cd = new ConnectionDao();

		
		
	// "'; SELECT * FROM `compte_epargne` WHERE `idClient`='" + client.getId() + "';";
	    ArrayList<CompteCourant> liste = new ArrayList<CompteCourant>();
            Statement stm = (Statement) cd.connection();
            ResultSet res = stm.executeQuery("SELECT * FROM `compte_courant` WHERE `idClient`='" + client.getId() + "';");

            while (res.next()) {
            CompteCourant bo = new CompteCourant();
            bo.setNum_cpt(Integer.parseInt(res.getString("num_compte")));
            bo.setSolde(Double.parseDouble(res.getString("solde")));
            bo.setAutorisationDecouvert(Double.parseDouble(res.getString("decouvert")));
            bo.setIdClient(Integer.parseInt(res.getString("idClient")));
            bo.setDate_ouverture(res.getString("date_ouverture"));
            bo.setIdAgence(res.getString("idAgence"));
            

            liste.add(bo);
		
		
		cd.deconnection();
	}
            return liste;
        }
        
        
        public ArrayList<CompteEpargne> listeComptesEpargneClient(Client client) throws SQLException {

		ConnectionDao cd = new ConnectionDao();

		
		
	    ArrayList<CompteEpargne> liste = new ArrayList<CompteEpargne>();
            Statement stm = (Statement) cd.connection();
            ResultSet res = stm.executeQuery("SELECT * FROM `compte_epargne` WHERE `idClient`='" + client.getId() + "';");

            while (res.next()) {
            CompteEpargne bo = new CompteEpargne();
            bo.setNum_cpt(Integer.parseInt(res.getString("num_compte")));
            bo.setSolde(Double.parseDouble(res.getString("solde")));
            bo.setTauxRemuneration(Double.parseDouble(res.getString("taux_remuneration")));
            bo.setIdClient(Integer.parseInt(res.getString("idClient")));
            bo.setDate_ouverture(res.getString("date_ouverture"));
            bo.setIdAgence(res.getString("idAgence"));
            

            liste.add(bo);
		
		
		cd.deconnection();
	}
            return liste;
        }

        public void faireVirement(Client crediteur, Client debiteur) throws SQLException
        {
                String sql ="UPDATE compte_courant \n" +
                            "SET solde = '"+crediteur.getCompteCourant().get(0).getSolde()+"'\n" +
                            "WHERE idClient = " +crediteur.getId()+"";
                String sql2 ="UPDATE compte_courant \n" +
                            "SET solde = '"+debiteur.getCompteCourant().get(0).getSolde()+"'\n" +
                            "WHERE idClient = " +debiteur.getId()+"";
                ConnectionDao cd = new ConnectionDao();
               Statement stm = cd.connection();
		stm.executeUpdate(sql);
		stm.executeUpdate(sql2);
                cd.deconnection();
                
        }
}
