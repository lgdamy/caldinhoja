/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import caldinho.ja.escopo.Cliente;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author lgalmeida
 */
public class ClienteDAOImpl implements ClienteDAO {

    private EntityManager em;

    public ClienteDAOImpl(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void novoCliente(Cliente cliente){
        em.persist(cliente);
    }
    @Override
    public Cliente getCliente(int id){
        return fetchClientes().get(id);
    }
    @Override
    public void deleteCliente(int id){
        em.remove(getCliente(id));
    }
    @Override
    public void atualizaCliente(Cliente cliente){
        em.merge(cliente);
    }
    @Override
    public List<Cliente> fetchClientes(){
        return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
    }
}
