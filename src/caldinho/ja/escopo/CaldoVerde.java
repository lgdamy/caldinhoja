/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja.escopo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author LuizGuilherme
 */
public class CaldoVerde extends Caldinho {
    private static final String nome = "Caldo Verde";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Batata",1000,"g"),
            new Ingrediente ("Caldo de Legumes",15,"g"),
            new Ingrediente("Calabresa",1,"un"),
            new Ingrediente("Couve-Manteiga",1,"maço"),
            new Ingrediente("Sal", 3,"pt"),
            new Ingrediente("Amido",2,"col sopa")));
    private static final String receita =
            "1.Cobrir o fundo da panela com 7 batatas grandes\n\n"
            + "2.Encher com água até o volume máximo\n\n"
            + "3.Adicionar uma 1tbsp de caldo de legumes\n\n"
            + "4.Colocar por 12 minutos de pressão\n\n"
            + "5.Bater com o mixer ja dentro do caldeirão com duas colheres de amido\n\n"
            + "6.Colocar a linguiça em rodelas, 3 pitadas de sal e deixar no fogo\n\n"
            + "7.Quando estiver fervendo adicionar a couve cortada fininha";
    private static final String fotoPath = "endereço da foto"; //PRECISAMOS TIRAR FOTO
    private static final int qtdPanela = 0; //PRECISAMOS FAZER SOPA
    @Override
    public void fazCaldo(float qtd) {
                
    }

    public static String getNome() {
        return nome;
    }

    public static ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public static String getReceita() {
        return receita;
    }

    public static String getFotoPath() {
        return fotoPath;
    }

    public static int getQtdPanela() {
        return qtdPanela;
    }
    
}
