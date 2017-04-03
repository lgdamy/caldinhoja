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
public class MandioqAlhoPorro extends Caldinho {
    private static final String nome = "Caldo de Mandioquinha com Alho Porró";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Mandioquinha",600,"g"),
            new Ingrediente ("Caldo de Galinha",15,"g"),
            new Ingrediente("Alho-Poró",1,"maço"),
            new Ingrediente("Azeite",5,"ml"),
            new Ingrediente("Sal", 5,"pt"),
            new Ingrediente("Amido",2,"col sopa")));
    private static final String receita =
            "1.Cobrir o fundo da panela com as mandioquinhas\n\n"
            + "2.Encher com água até o volume máximo\n\n"
            + "3.Adicionar uma 1tbsp de caldo de galinha\n\n"
            + "4.Colocar por 10 minutos de pressão\n\n"
            + "5.Bater com o mixer ja dentro do caldeirão com duas colheres de amido\n\n"
            + "6.Refogar o alho poró bem picadinho no azeite\n\n"
            + "7.Usar uma colher do refogado por porção";
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
