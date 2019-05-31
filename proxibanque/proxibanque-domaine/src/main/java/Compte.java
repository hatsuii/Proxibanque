package eu.ensup.proxiBanque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorris
 */
public class Compte {
    
    private int num_cpt;
    private int solde;
    private String date_ouverture;

    public int getNum_cpt() {
        return num_cpt;
    }

    public void setNum_cpt(int num_cpt) {
        this.num_cpt = num_cpt;
    }

    public int getSolde() {
        return solde;
    }

    public Compte(int num_cpt, int solde, String date_ouverture) {
        this.num_cpt = num_cpt;
        this.solde = solde;
        this.date_ouverture = date_ouverture;
    }

    public Compte() {
    }
    
    

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getDate_ouverture() {
        return date_ouverture;
    }

    public void setDate_ouverture(String date_ouverture) {
        this.date_ouverture = date_ouverture;
    }
    
    
}
