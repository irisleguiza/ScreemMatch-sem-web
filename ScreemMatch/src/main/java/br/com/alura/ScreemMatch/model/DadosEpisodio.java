package br.com.alura.ScreemMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Episodie")Integer numeroEpisodio,
        @JsonAlias("imbdRating") String avaliacao,
        @JsonAlias("Released") String dataLancamento){
}
