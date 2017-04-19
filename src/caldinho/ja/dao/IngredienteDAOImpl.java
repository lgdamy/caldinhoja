/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import caldinho.ja.escopo.Ingrediente;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author lgalmeida
 */
public class IngredienteDAOImpl implements IngredienteDAO {

    private EntityManager em;

    public IngredienteDAOImpl(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void novoIngrediente(Ingrediente ingrediente){
        em.persist(ingrediente);
    }
    @Override
    public Ingrediente getIngrediente(int id){
        return fetchIngredientes().get(id);
    }
    @Override
    public void deleteIngrediente(int id){
        em.remove(getIngrediente(id));
    }
    @Override
    public void atualizaIngrediente(Ingrediente ingrediente){
        em.merge(ingrediente);
    }
    @Override
    public List<Ingrediente> fetchIngredientes(){
        return em.createQuery("SELECT i FROM Ingrediente i", Ingrediente.class).getResultList();
    }
}
