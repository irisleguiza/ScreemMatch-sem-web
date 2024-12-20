package br.com.alura.ScreemMatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
