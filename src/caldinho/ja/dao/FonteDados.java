/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author LuizGuilherme
 */
public class FonteDados {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CaldinhoJaPRPU");
    private FonteDados(){}
    public static EntityManager createEntityManager(){
        return emf.createEntityManager();
    }
}
