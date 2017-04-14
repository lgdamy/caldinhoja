/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.escopo;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author LuizGuilherme
 */
@Entity
public class Ingrediente implements Serializable {
    @Id @GeneratedValue
    private int id;
    private String nome;
    private float qtd;
    private String unidade;
    
    public Ingrediente(String nome, float qtd, String unidade){
        this.nome = nome;
        this.qtd = qtd;
        this.unidade = unidade;
    }
    public Ingrediente(String nome){
        this.nome = nome;
    }
    
    public Ingrediente(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

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

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    
    
}
