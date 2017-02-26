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
public class CaldoVerde extends Caldinho {
    private static final String nome = "Caldo Verde";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Batata",1000),
            new Ingrediente ("Caldo de Legumes",15),
            new Ingrediente("Calabresa",1),
            new Ingrediente("Couve-Manteiga",1),
            new Ingrediente("Sal", 3),
            new Ingrediente("Amido",2)));
    private static final String receita =
            "1.Cobrir o fundo da panela com 7 batatas grandes\n"
            + "2.Encher com água até o volume máximo\n"
            + "3.Adicionar uma 1tbsp de caldo de legumes\n"
            + "4.Colocar por 12 minutos de pressão\n"
            + "5.Bater com o mixer ja dentro do caldeirão com duas colheres de amido\n"
            + "6.Colocar a linguiça em rodelas, 3 pitadas de sal e deixar no fogo\n+"
            + "7.Quando estiver fervendo adicionar a couve cortada fininha";
    private static final String fotoPath = "endereço da foto"; //PRECISAMOS TIRAR FOTO
    private static final int qtdPanela = 0; //PRECISAMOS FAZER SOPA
    @Override
    public void fazCaldo(float qtd) {
                
    }
}
