/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gfplus.testicod;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author guigamehdi
 */
@Named
public class user {
private EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
private EntityManager em = emf.createEntityManager();
    /** Creates a new instance of user */
    public user() {
    }

public void allo(){
    System.out.println("bachaaaaaaaaaaaaaaaa");
}

}
