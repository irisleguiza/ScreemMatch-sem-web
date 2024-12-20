package br.com.alura.ScreemMatch;

import br.com.alura.ScreemMatch.model.DadosSerie;
import br.com.alura.ScreemMatch.service.ConsumoAPI;
import br.com.alura.ScreemMatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreemMatchApplication  implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreemMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=friends&apikey=b5b81034");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
