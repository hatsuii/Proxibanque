package eu.ensup.proxibanque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class TransactionDao {
    
    
    public void faireVirement(Transaction transaction)
    {
        ConnectionDao cd = new ConnectionDao();

		cd.connection();
		try {
			String sql = "INSERT INTO `transaction` (`date`,`montant`,`compteCrediteur`,`compteDebiteur`) VALUES ('" + transaction.getDate()
					+ "','" + transaction.getMotant()+ "','" + transaction.getCompteCrediteur()+ "','" + transaction.getCompteDebiteur()+ "');";
			
			cd.stat.executeUpdate(sql);
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
        
    }
    public ArrayList<Transaction> TransactionsMois(int id, String mois) throws SQLException
    {
        ArrayList<Transaction> liste = new ArrayList<Transaction>();
        ConnectionDao cd = new ConnectionDao();
                
        Statement stm = (Statement) cd.connection();
        
        ResultSet res = stm.executeQuery("Select * from transaction where ( Select MONTH(date) ) = "+mois);

            while (res.next()) {
            Transaction bo = new Transaction();
            bo.setId(Integer.parseInt(res.getString("id")));
            bo.setCompteDebiteur(Integer.parseInt(res.getString("compteDebiteur")));
            bo.setCompteCrediteur(Integer.parseInt(res.getString("compteCrediteur")));
            bo.setDate(res.getDate("date"));
            bo.setMotant(res.getDouble("montant"));

            liste.add(bo);
        }
        
        
        return liste;
        
    }
    public ArrayList<Transaction> TransactionsSemaine(int id, int semaine) throws SQLException
    {
        ArrayList<Transaction> liste = new ArrayList<Transaction>();
        ConnectionDao cd = new ConnectionDao();
                
        Statement stm = (Statement) cd.connection();
        
        ResultSet res = stm.executeQuery("Select * from transaction where ( Select WEEK(date) ) = " + semaine);

            while (res.next()) {
            Transaction bo = new Transaction();
            bo.setId(Integer.parseInt(res.getString("id")));
            bo.setCompteDebiteur(Integer.parseInt(res.getString("compteDebiteur")));
            bo.setCompteCrediteur(Integer.parseInt(res.getString("compteCrediteur")));
            bo.setDate(res.getDate("date"));
            bo.setMotant(res.getDouble("montant"));

            liste.add(bo);
        }
        
        
        return liste;
        
    }
}
