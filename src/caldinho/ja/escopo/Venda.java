/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.escopo;

import javax.persistence.*;

/**
 *
 * @author lgalmeida
 */
@Entity
public class Venda {
    @Id @GeneratedValue
    private int id;
    @ManyToOne
    private Cliente cliente;
    private int[] caldinhos;//0-caldo verde 1-mandioquinha 2-abobora 3-palmito 4-feijao 5-canja 6-ervilha
    private int[] adicionais;//0-torradinha 1-cebolinha 2-bacon 3-queijo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }
/////SETTERS CALDINHOS/////
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setQtdCaldoVerde(int n){
        this.caldinhos[0]=n;
    }
    public void setQtdMandioquinha(int n){
        this.caldinhos[1]=n;
    }
    public void setQtdAbobora(int n){
        this.caldinhos[2]=n;
    }
    public void setQtdPalmito(int n){
        this.caldinhos[3]=n;
    }
    public void setQtdFeijao(int n){
        this.caldinhos[4]=n;
    }
    public void setQtdCanja(int n){
        this.caldinhos[5]=n;
    }
    public void setQtdErvilha(int n){
        this.caldinhos[6]=n;
    }
////GETTERS CALDINHOS////
    public int getQtdCaldoVerde(){
        return this.caldinhos[0];
    }
    public int getQtdMandioquinha(){
        return this.caldinhos[1];
    }
    public int getQtdAbobora(){
        return this.caldinhos[2];
    }
    public int getQtdPalmito(){
        return this.caldinhos[3];
    }
    public int getQtdFeijao(){
        return this.caldinhos[4];
    }
    public int getQtdCanja(){
        return this.caldinhos[5];
    }
    public int getQtdErvilha(){
        return this.caldinhos[6];
    }
    
//////SETTERS ADICIONAIS/////
    
    public void setQtdTorradinha(int n){
        this.adicionais[0] = n;
    }
    public void setQtdCebolinha(int n){
        this.adicionais[1] = n;
    }
    public void setQtdBacon(int n){
        this.adicionais[2] = n;
    }
    public void setQtdQueijo(int n){
        this.adicionais[3] = n;
    }
    
///////GETTERS ADICIONAIS///////
    
    public int getQtdTorradinha(){
        return this.adicionais[0];
    }
    public int getQtdCebolinha(){
        return this.adicionais[1];
    }
    public int getQtdBacon(){
        return this.adicionais[2];
    }
    public int getQtdQueijo(){
        return this.adicionais[3];
    }

}
