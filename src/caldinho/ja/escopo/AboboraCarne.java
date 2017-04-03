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
public class AboboraCarne extends Caldinho {
    private static final String nome = "Caldo de Abóbora com Carne";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Moranga",1,"un"),
            new Ingrediente ("Caldo de Galinha",15,"g"),
            new Ingrediente("Carne Moída",500,"g"),
            new Ingrediente("Cebola",1,"un"),
            new Ingrediente("Alho", 2,"col chá"),
            new Ingrediente("Sal", 6, "pt"),
            new Ingrediente("Amido",2,"col sopa")));
    private static final String receita =
            "1.Refogar na panela de pressão uma cebola e duas colheres pequenas de alho\n\n"
            + "2.Colocar na panela a moranga cortada às pressas sem as sementes\n\n"
            + "3.Adicionar uma 1tbsp de caldo de galinha e água até o volume máximo\n\n"
            + "4.Cozinhar por 10 minutos na pressão\n\n"
            + "5.Bater com o mixer ja dentro do caldeirão com duas colheres de amido\n\n"
            + "6.Fritar a carne moída com 1/2tbsp de caldo de carne\n\n"
            + "7.Misturar a carne na sopa e em seguida adicionar 6 pitadas de sal";
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
