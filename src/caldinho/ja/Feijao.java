/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caldinho.ja;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author LuizGuilherme
 */
public class Feijao extends Caldinho {
    private static final String nome = "Caldinho de Feijão";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Feijão",500,"g"),
            new Ingrediente ("Caldo de Carne",15,"g"),
            new Ingrediente("Bacon",300,"g"),
            new Ingrediente("Cebola",1,"un"),
            new Ingrediente("Cebolinha",1,"ramo"),
            new Ingrediente("Alho", 4,"col chá")));
    private static final String receita =
            "1.Colocar 3 xícaras de feijão e a capa do bacon na panela de pressão\n\n"
            + "2.Depois de colocar água até o volume máximo, adicione 1tbsp de caldo de carne\n\n"
            + "3.Cozinhar por 40 minutos na pressão\n\n"
            + "4.Triturar  uma cebola e uma cebolinha no mixer pequeno até virar uma papa\n\n"
            + "5.Agregar tudo no feijão, bater com o mixer atpe virar caldo\n\n"
            + "6.Fritar o bacon em cubos com quatro colheres pequena de alho\n\n"
            + "7.Misturar tudo e cozinhar por mais dez minutos\n\n"
            + "8.Enfeitar com 3 folhas de salsinha por porção";
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
