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
public class CompteCourant extends Compte{
    
     private double autorisationDecouvert;

    public double getAutorisationDecouvert() {
        return autorisationDecouvert;
    }

    public void setAutorisationDecouvert(double autorisationDecouvert) {
        this.autorisationDecouvert = autorisationDecouvert;
    }

    public CompteCourant(double autorisationDecouvert) {
        this.autorisationDecouvert = autorisationDecouvert;
    }

    public CompteCourant() {
    }
    
}
