/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.controllers;

import caldinho.ja.escopo.Cliente;

/**
 *
 * @author luiz
 */
public class clienteNomeFantasia{
    public String toString(Cliente cliente){
            if(cliente.isInterno())
                return cliente.getNome() + " - " + cliente.getApartamento();
            else
                if (cliente.getApartamento() !=null)
                    return cliente.getNome() + ", " + cliente.getEndereco();
                else
                    return cliente.getNome() + ", " + cliente.getEndereco() + " - " + cliente.getApartamento();
                    
    }
}