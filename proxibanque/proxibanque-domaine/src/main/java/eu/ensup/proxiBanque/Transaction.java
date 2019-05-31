package eu.ensup.proxiBanque;


import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorris
 */
public class Transaction {
    
    private int id;
    private Date date;
    private int compteCrediteur;
    private int compteDebiteur;
    private int motant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCompteCrediteur() {
        return compteCrediteur;
    }

    public void setCompteCrediteur(int compteCrediteur) {
        this.compteCrediteur = compteCrediteur;
    }

    public int getCompteDebiteur() {
        return compteDebiteur;
    }

    public void setCompteDebiteur(int compteDebiteur) {
        this.compteDebiteur = compteDebiteur;
    }

    public int getMotant() {
        return motant;
    }

    public void setMotant(int motant) {
        this.motant = motant;
    }

    public Transaction() {
    }
    
    
}
