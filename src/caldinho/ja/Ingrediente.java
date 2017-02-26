/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja;

/**
 *
 * @author LuizGuilherme
 */
public class Ingrediente {
    private String nome;
    private float qtd;
    
    public Ingrediente(String nome, float qtd){
        this.nome = nome;
        this.qtd = qtd;
    }
    public Ingrediente(String nome){
        this.nome = nome;
    }
    
    public Ingrediente(){}

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
