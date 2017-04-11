/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.dao;

import caldinho.ja.escopo.Cliente;
import java.util.List;

/**
 *
 * @author lgalmeida
 */
public interface ClienteDAO {
    public void novoCliente(Cliente cliente);
    public Cliente getCliente(int id);
    public void deleteCliente(int id);
    public void atualizaCliente(Cliente cliente);
    public List<Cliente> fetchClientes();
}
