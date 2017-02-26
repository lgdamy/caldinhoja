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
            new Ingrediente ("Feijão",500),
            new Ingrediente ("Caldo de Carne",15),
            new Ingrediente("Bacon",300),
            new Ingrediente("Cebola",1),
            new Ingrediente("Cebolinha",1),
            new Ingrediente("Alho", 4)));
    private static final String receita =
            "1.Colocar 3 xícaras de feijão e a capa do bacon na panela de pressão\n"
            + "2.Depois de colocar água até o volume máximo, adicione 1tbsp de caldo de carne\n"
            + "3.Cozinhar por 40 minutos na pressão\n"
            + "4.Triturar  uma cebola e uma cebolinha no mixer pequeno até virar uma papa\n"
            + "5.Agregar tudo no feijão, bater com o mixer atpe virar caldo\n"
            + "6.Fritar o bacon em cubos com quatro colheres pequena de alho\n+"
            + "7.Misturar tudo e cozinhar por mais dez minutos\n"
            + "8.Enfeitar com 3 folhas de salsinha por porção";
    private static final String fotoPath = "endereço da foto"; //PRECISAMOS TIRAR FOTO
    private static final int qtdPanela = 0; //PRECISAMOS FAZER SOPA
    @Override
    public void fazCaldo(float qtd) {
                
    }
}
