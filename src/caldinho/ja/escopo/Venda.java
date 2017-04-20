/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.escopo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author lgalmeida
 */
@Entity
public class Venda implements Serializable {
    @Id @GeneratedValue
    private int id;
    @ManyToOne
    private Cliente cliente;
    /**
     * 0-caldo verde 1-mandioquinha 2-abobora 3-palmito 4-feijao 5-canja 6-ervilha
     */
    private int[] caldinhos;//0-caldo verde 1-mandioquinha 2-abobora 3-palmito 4-feijao 5-canja 6-ervilha
    /**
     * 0-torradinha 1-cebolinha 2-bacon 3-queijo
     */
    private int[] adicionais;//0-torradinha 1-cebolinha 2-bacon 3-queijo
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataVenda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Calendar getData() {
        return dataVenda;
    }

    public void setData(Calendar dataVenda) {
        this.dataVenda = dataVenda;
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

    /**
     * Método para pegar os caldinhos em um vetor só
     * @return [0]-Caldo Verde,[1]-Mandioquinha, [2]-Abóbora [3]-Palmito [4]-Feijão [5]-Canja [6]-Ervilha
     */
    public int[] getCaldinhos() {
        return caldinhos;
    }
    /**
     * Método para setar os caldinhos em um vetor só
     * @param caldinhos  [0]-Caldo Verde,[1]-Mandioquinha, [2]-Abóbora [3]-Palmito [4]-Feijão [5]-Canja [6]-Ervilha
     */
    public void setCaldinhos(int[] caldinhos) {
        this.caldinhos = caldinhos;
    }
    /**
     * Método para pegar os adicionais em um vetor só
     * @return [0]-Torradinhas,[1]-Cebolinhas,[2]-Bacon,[3]-Queijo
     */
    public int[] getAdicionais() {
        return adicionais;
    }
    /**
     * Método para setar todos os adicionais em um vetor só
     * @param adicionais [0]-Torradinhas,[1]-Cebolinhas,[2]-Bacon,[3]-Queijo
     */
    public void setAdicionais(int[] adicionais) {
        this.adicionais = adicionais;
    }
    

}
