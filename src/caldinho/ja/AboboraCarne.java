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
public class AboboraCarne extends Caldinho {
    private static final String nome = "Caldo de Abóbora com Carne";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Moranga",1),
            new Ingrediente ("Caldo de Galinha",15),
            new Ingrediente("Carne Moída",500),
            new Ingrediente("Cebola",1),
            new Ingrediente("Alho", 2),
            new Ingrediente("Sal", 6),
            new Ingrediente("Amido",2)));
    private static final String receita =
            "1.Refogar na panela de pressão uma cebola e duas colheres pequenas de alho\n"
            + "2.Colocar na panela a moranga cortada às pressas sem as sementes\n"
            + "3.Adicionar uma 1tbsp de caldo de galinha e água até o volume máximo\n"
            + "4.Cozinhar por 10 minutos na pressão\n"
            + "5.Bater com o mixer ja dentro do caldeirão com duas colheres de amido\n"
            + "6.Fritar a carne moída com 1/2tbsp de caldo de carne\n+"
            + "7.Misturar a carne na sopa e em seguida adicionar 6 pitadas de sal";
    private static final String fotoPath = "endereço da foto"; //PRECISAMOS TIRAR FOTO
    private static final int qtdPanela = 0; //PRECISAMOS FAZER SOPA
    @Override
    public void fazCaldo(float qtd) {
                
    }
}
