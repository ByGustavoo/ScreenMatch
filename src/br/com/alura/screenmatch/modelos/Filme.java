package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    public Filme(String nome, int anoDeLancamento) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
}