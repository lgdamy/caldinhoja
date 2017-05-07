/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import caldinho.ja.escopo.Venda;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author lgalmeida
 */
public interface VendaDAO {
    public void novaVenda(Venda venda);
    public Venda getVenda(int id);
    public void deleteVenda(int id);
    public void atualizaVenda(Venda venda);
    public List<Venda> fetchVendas();
}
