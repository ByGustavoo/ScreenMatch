package br.com.alura.screenmatch.collections;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;

public class Listas {
    public static void main(String[] args) {

        System.out.println("\n*************** Collections ***************\n");

        Serie lost = new Serie("Lost", 2000);

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);

        var filmeDoGuru = new Filme("Deadpool 2", 2024);
        filmeDoGuru.avalia(9.5);

        filmeDoGuru.setDuracaoEmMinutos(220);
        filmeDoGuru.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoGuru);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        System.out.println("Primeiro Filme: " + lista.getFirst().getNome());
        System.out.println("Segundo Filme: " + lista.get(1).getNome());
        System.out.println("Tamanho da Lista de Títulos: " + lista.size() + "\n");

        for (Titulo titulo : lista) {
            System.out.println("Nome: " + titulo.getNome());

            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        System.out.println("\n*************** Sem Ordernação ***************\n");

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Jason Statham");
        buscarPorArtista.add("Bryan");
        System.out.println(buscarPorArtista);

        System.out.println("\n*************** Com Ordernação ***************\n");

        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        System.out.println("\nLista de Títulos Ordenados\n");

        Collections.sort(lista);
        System.out.println(lista);
    }
}