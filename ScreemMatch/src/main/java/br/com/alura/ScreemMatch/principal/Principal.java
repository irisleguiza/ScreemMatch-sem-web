package br.com.alura.ScreemMatch.principal;

import br.com.alura.ScreemMatch.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in):
    private ConsumoAPI consumo = new ConsumoAPI();

    private final String ENDERECO = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=b5b81034";

    public void exibeMenu() {
        System.out.println("Digite o nome da serie para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados("ENDERECO + nomeSerie.replace("" , " + " + API_KEY");

    }
}