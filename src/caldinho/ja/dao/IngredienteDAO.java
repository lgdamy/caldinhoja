/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import caldinho.ja.escopo.Ingrediente;
import java.util.List;

/**
 *
 * @author LuizGuilherme
 */
public interface IngredienteDAO {
    public void novoIngrediente(Ingrediente ingrediente);
    public Ingrediente getIngrediente(int id);
    public void deleteIngrediente(int id);
    public void atualizaIngrediente(Ingrediente ingrediente);
    public List<Ingrediente> fetchIngredientes();
}
