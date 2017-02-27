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
public class Palmito extends Caldinho {
    private static final String nome = "Creme de Palmito";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Palmito",350,"g"),
            new Ingrediente ("Caldo de Legumes",15,"g"),
            new Ingrediente("Leite",1000,"ml"),
            new Ingrediente("Alho",2,"col chá"),
            new Ingrediente("Amido", 4,"col sopa"),
            new Ingrediente("Creme de Leite", 1,"caixa")));
    private static final String receita =
            "1.Refogar no óleo duas colheres pequenas de alho\n"
            + "2.Adicionar no refogado duas xícaras de palmito e 1tbsp de caldo de legumes\n"
            + "3.Acrescentar 1 litro de leite, 750ml de água e 250ml da conserva\n"
            + "4.Assim que ferver, abaixar o fogo e deixar por 5 minutos\n"
            + "5.Bater no liquidificador com 4 colheres de amido\n"
            + "6.Deixar ferver novamente, assim que engrossar adicionar uma caixa de creme de leite\n+"
            + "7.Servir com uma colher de sopa de palmito por porção";
    private static final String fotoPath = "endereço da foto"; //PRECISAMOS TIRAR FOTO
    private static final int qtdPanela = 0; //PRECISAMOS FAZER SOPA
    @Override
    public void fazCaldo(float qtd) {
                
    }
}
