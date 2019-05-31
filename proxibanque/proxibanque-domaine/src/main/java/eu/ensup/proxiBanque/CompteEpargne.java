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
public class CompteEpargne extends Compte{
    
   private double tauxRemuneration;

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public CompteEpargne(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

   
    public CompteEpargne() {
    }

    
    
    
}
