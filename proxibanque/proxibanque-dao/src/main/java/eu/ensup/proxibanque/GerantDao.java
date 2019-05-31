package eu.ensup.proxibanque.dao;

import eu.ensup.proxibanque.domaine.Conseiller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GerantDao extends ConseillerDao{
	
	public ArrayList<Conseiller> selectAllConseiller() throws SQLException {

		ConnectionDao cd = new ConnectionDao();

	   
	    ArrayList<Conseiller> liste = new ArrayList<Conseiller>();
            Statement stm = cd.connection();
            ResultSet res = stm.executeQuery("SELECT * FROM conseiller");

            while (res.next()) {
            Conseiller bo = new Conseiller();
            bo.setId(Integer.parseInt(res.getString("id")));
            bo.setNom(res.getString("nom"));
            bo.setPrenom(res.getString("prenom"));
            bo.setProfil(res.getString("profil"));
            bo.setIdAgence(res.getString("idAgence"));
            bo.setLogin(res.getString("login"));
            bo.setPassword(res.getString("password"));

            liste.add(bo);
        }
            
		cd.deconnection();
                return liste;
	}
	
	public static void selectTransaction(Conseiller conseiller) throws SQLException {

		ConnectionDao cd = new ConnectionDao();

		Statement stm = cd.connection();
		System.out.println("connexion etablie");
		System.out.println(conseiller);
		try {
			String sql = "SELECT * FROM `transaction` ORDER BY `date` asc;";
			System.out.println("execution requete");
			stm.executeUpdate(sql);
			System.out.println("requete executée");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();
	}
	

}