/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import caldinho.ja.escopo.Venda;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author lgalmeida
 */
public class VendaDaoImpl implements VendaDAO{
    private EntityManager em;
    
    public VendaDaoImpl(EntityManager em){
        this.em=em;
    }
    @Override
    public void novaVenda(Venda venda) {
        em.persist(venda);
    }

    @Override
    public Venda getVenda(int id) {
        return fetchVendas().get(id);
    }

    @Override
    public void deleteVenda(int id) {
        em.remove(getVenda(id));
    }

    @Override
    public void atualizaVenda(Venda venda) {
        em.merge(venda);
    }

    @Override
    public List<Venda> fetchVendas() {
        return em.createQuery("SELECT v FROM Venda v", Venda.class).getResultList();
    }
    
}
