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
public class MandioqAlhoPorro extends Caldinho {
    private static final String nome = "Caldo de Mandioquinha com Alho Porró";
    private static final ArrayList<Ingrediente> ingredientes = new ArrayList<>(Arrays.asList(
            new Ingrediente ("Mandioquinha",600),
            new Ingrediente ("Caldo de Galinha",15),
            new Ingrediente("Alho-Poró",1),
            new Ingrediente("Azeite",5),
            new Ingrediente("Sal", 5),
            new Ingrediente("Amido",2)));
    private static final String receita =
            "1.Cobrir o fundo da panela com as mandioquinhas\n"
            + "2.Encher com água até o volume máximo\n"
            + "3.Adicionar uma 1tbsp de caldo de galinha\n"
            + "4.Colocar por 10 minutos de pressão\n"
            + "5.Bater com o mixer ja dentro do caldeirão com duas colheres de amido\n"
            + "6.Refogar o alho poró bem picadinho no azeite\n"
            + "7.Usar uma colher do refogado por porção";
    private static final String fotoPath = "endereço da foto"; //PRECISAMOS TIRAR FOTO
    private static final int qtdPanela = 0; //PRECISAMOS FAZER SOPA
    @Override
    public void fazCaldo(float qtd) {
                
    }
}
