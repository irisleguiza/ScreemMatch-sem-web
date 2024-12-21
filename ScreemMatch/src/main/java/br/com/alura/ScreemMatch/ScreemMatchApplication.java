package br.com.alura.ScreemMatch;

import br.com.alura.ScreemMatch.model.DadosEpisodio;
import br.com.alura.ScreemMatch.model.DadosSerie;
import br.com.alura.ScreemMatch.model.DadosTemporada;
import br.com.alura.ScreemMatch.service.ConsumoAPI;
import br.com.alura.ScreemMatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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

		json = consumoApi.obterDados("https://www.omdbapi.com/?t=friends=1&episode=2&apikey=b5b81034");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);

		List<DadosTemporada> temporadas = new ArrayList<>();
		for (int i = 1; i <= dados.totalTemporadas(); i++) {
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=friends=" + i + "&apikey=b5b81034");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);

	}
}
