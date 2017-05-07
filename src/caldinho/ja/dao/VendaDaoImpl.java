/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import caldinho.ja.escopo.Venda;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author lgalmeida
 */
public class VendaDaoImpl implements VendaDAO{
    private final EntityManager em;
    
    public VendaDaoImpl(EntityManager em){
        this.em=em;
    }
    @Override
    public void novaVenda(Venda venda) {
        em.getTransaction().begin();
        em.persist(venda);
        em.getTransaction().commit();
    }

    @Override
    public Venda getVenda(int id) {
        return fetchVendas().get(id);
    }

    @Override
    public void deleteVenda(int id) {
        em.getTransaction().begin();
        em.remove(getVenda(id));
        em.getTransaction().commit();
    }

    @Override
    public void atualizaVenda(Venda venda) {
        em.getTransaction().begin();
        em.merge(venda);
        em.getTransaction().commit();
    }

    
    
    public List<Venda> fetchVendas(Calendar inicio, Calendar fim) {
        return em.createQuery("SELECT v FROM Venda v where v.dataVenda BETWEEN :inicio AND :fim", Venda.class).setParameter("inicio", inicio).setParameter("fim", fim).getResultList();
    }

    @Override
    public List<Venda> fetchVendas() {
        return em.createQuery("SELECT v FROM Venda v",Venda.class).getResultList();
    }
    
}
