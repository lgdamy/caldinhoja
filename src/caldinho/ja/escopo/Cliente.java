/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.escopo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author lgalmeida
 */
@Entity
public class Cliente implements Serializable {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name = "CLIENTE_ID")
    private int cliente_id; //PK
    private String nome;
    private int ddd;
    private int telefone;
    private boolean interno;
    private String endereco;
    private String apartamento;
    private List<Venda> compras;
    
    
    @Override
    public String toString(){
        String retorna=nome;
        if (interno==true) 
            retorna += " - "+ apartamento;
        else
            if ( apartamento != null && !apartamento.isEmpty())
                retorna += ", " + endereco + " - " + apartamento;
            else
                retorna += ", " + endereco;
        return retorna;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean isInterno() {
        return interno;
    }

    public void setInterno(boolean interno) {
        this.interno = interno;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
    
    
      
}
