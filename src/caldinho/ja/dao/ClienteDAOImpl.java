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

    private final EntityManager em;

    public ClienteDAOImpl(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void novoCliente(Cliente cliente){
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
    }
    @Override
    public Cliente getCliente(int id){
        return fetchClientes().get(id);
    }
    @Override
    public void deleteCliente(int id){
        em.getTransaction().begin();
        em.remove(getCliente(id));
        em.getTransaction().commit();
    }
    @Override
    public void atualizaCliente(Cliente cliente){
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
    }
    @Override
    public List<Cliente> fetchClientes(){
        return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
    }
    
    public List<Cliente> fetchClientes(String quesito){
        return  em.createQuery("SELECT c FROM Cliente c WHERE c.nome LIKE :busca OR c.endereco LIKE :busca OR CAST(c.telefone as CHAR) LIKE :busca").setParameter("busca", "%"+quesito+"%").getResultList();
    }
}
