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
public class Agence {
    
    private int id;
    private String dateCreation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public Agence() {
    }

    public Agence(int id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
    }
    
    
    

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    
}
