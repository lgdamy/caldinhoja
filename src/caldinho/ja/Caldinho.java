package caldinho.ja;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuizGuilherme
 */
public abstract class Caldinho implements FazCaldo {
    private String nome;
    private int qtdPanela;
    private List<Ingrediente> ingredientes;
    private String receita;
    private String fotoPath;

    public int getQtdPanela() {
        return qtdPanela;
    }

    public void setQtdPanela(int qtdPanela) {
        this.qtdPanela = qtdPanela;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getFotoPath() {
        return fotoPath;
    }

    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
}
