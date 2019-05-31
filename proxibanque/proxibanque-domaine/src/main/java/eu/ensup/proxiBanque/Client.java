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
public class Client {
    
    private int id;
    private String nom;
    private String prenom;
    private String cp;
    private String ville;
    private String telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Client(int id, String nom, String prenom, String cp, String ville, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cp = cp;
        this.ville = ville;
        this.telephone = telephone;
    }

    public Client() {
    }
    
    
    
    
}
