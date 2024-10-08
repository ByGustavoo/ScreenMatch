package br.com.alura.screenmatch.desafios;

import br.com.alura.screenmatch.modelos.Pessoa;
import br.com.alura.screenmatch.modelos.Produto;
import br.com.alura.screenmatch.modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Desafios {
    public static void main(String[] args) {

        System.out.println("\n*************** Desafio 1 ***************\n");

        var primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Gustavo");
        primeiraPessoa.setIdade(19);

        var segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Giovanna");
        segundaPessoa.setIdade(19);

        var terceiraPessoa = new Pessoa();
        terceiraPessoa.setNome("Miguel");
        terceiraPessoa.setIdade(7);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(primeiraPessoa);
        listaDePessoas.add(segundaPessoa);
        listaDePessoas.add(terceiraPessoa);
        System.out.println("Tamanho da Lista de Pessoas: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa da Lista: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);

        System.out.println("\n*************** Desafio 2 ***************\n");

        var primeiroProduto = new Produto("Chocolate", 5.99, 10);
        var segundoProduto = new Produto("Refrigerante", 7.99, 20);
        var terceiroProduto = new Produto("Carne", 59.99, 10);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(primeiroProduto);
        listaDeProdutos.add(segundoProduto);
        listaDeProdutos.add(terceiroProduto);
        System.out.println("Tamanho da Lista de Produtos: " + listaDeProdutos.size());
        System.out.println("Segundo Produto da Lista: " + listaDeProdutos.get(1));

        var produtoPerecivel = new ProdutoPerecivel("Leite", 4.99, 8);
        System.out.println(produtoPerecivel);

        System.out.println("\n*************** Desafio 3 ***************\n");

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Giovanna");
        nomes.add("Miguel");
        nomes.add("Manuela");

        System.out.println("\n*************** For ***************\n");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\n*************** forEach ***************\n");
        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("\n*************** Method Reference ***************\n");
        nomes.forEach(System.out::println);
    }
}