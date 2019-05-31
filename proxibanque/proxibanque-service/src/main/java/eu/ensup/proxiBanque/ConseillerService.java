/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensup.proxibanque.service;

import eu.ensup.proxibanque.dao.ConseillerDao;
import eu.ensup.proxibanque.dao.GerantDao;
import eu.ensup.proxibanque.dao.TransactionDao;
import eu.ensup.proxibanque.domaine.Client;
import eu.ensup.proxibanque.domaine.CompteCourant;
import eu.ensup.proxibanque.domaine.CompteEpargne;
import eu.ensup.proxibanque.domaine.Conseiller;
import eu.ensup.proxibanque.domaine.Transaction;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class ConseillerService {
    
    public ArrayList<Client> listerClients() throws SQLException
    {
        ArrayList<Client> liste = null ;
        ConseillerDao dao = new ConseillerDao();
        liste = dao.selectAllClient();
        
        
        return liste;
    }
    
    public void mettreAjourClient(Client client)
    {
        ConseillerDao dao = new ConseillerDao();
        dao.updateClient(client);
        
    }
    
    public Client listerComptesClient(Client client) throws SQLException
    {
        ConseillerDao dao = new ConseillerDao();
        Client c = new  Client();
        ArrayList<CompteCourant> listeCourant = dao.listeComptesCourantClient(client);
        ArrayList<CompteEpargne> listeEpargne = dao.listeComptesEpargneClient(client);
        c.setCompteCourant(listeCourant);
        c.setCompteEpargne(listeEpargne.get(0));
        
        return c;
        
    }
    
    public void faireVirement(Client crediteur, Client debiteur, Double somme) throws SQLException
    {
        ConseillerDao dao = new ConseillerDao();
        crediteur.getCompteCourant().get(0).setSolde(crediteur.getCompteCourant().get(0).getSolde() + somme);
        debiteur.getCompteCourant().get(0).setSolde(debiteur.getCompteCourant().get(0).getSolde() - somme);
        dao.faireVirement(crediteur, debiteur);
        Transaction transaction = new Transaction();
        transaction.setMotant(somme);
        transaction.setDate(Date.valueOf(LocalDate.MIN));
        transaction.setCompteCrediteur(crediteur.getCompteCourant().get(0).getNum_cpt());
        transaction.setCompteDebiteur(debiteur.getCompteCourant().get(0).getNum_cpt());
        TransactionDao tdao = new TransactionDao();
        tdao.faireVirement(transaction);
    }
    
    public ArrayList<Conseiller> listerConseiller() throws SQLException
    {
        ArrayList<Conseiller> liste = new ArrayList<Conseiller>();
        GerantDao dao = new GerantDao();
        liste = dao.selectAllConseiller();
        return liste;
                
    }
    
    
    
}
