/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensup.proxibanque.service;

import eu.ensup.proxibanque.dao.GerantDao;
import eu.ensup.proxibanque.domaine.Conseiller;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class AuthentificationService {
    
    
    public boolean connect(String login, String password ) throws SQLException
    {
        boolean b = false;
        GerantDao dao = new GerantDao();
        ArrayList<Conseiller> liste = dao.selectAllConseiller();
        for (int i = 0; i<liste.size(); i++)
        {
            if (liste.get(i).getLogin().equalsIgnoreCase(login) && liste.get(i).getPassword().equalsIgnoreCase(login))b = true;
        }
        return b;
    }
    
}
