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
    @ManyToOne
    private Cliente compras;
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "VENDA_ID")
    private int venda_id;
    
    @ManyToOne @JoinColumn(name = "CLIENTE_ID")
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
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public int getVenda_id() {
        return venda_id;
    }

    public void setVenda_id(int venda_id) {
        this.venda_id = venda_id;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    

}
