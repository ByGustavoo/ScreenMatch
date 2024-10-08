package br.com.alura.screenmatch.modelos;

import java.time.Instant;
import java.util.Date;

public class ProdutoPerecivel extends Produto {

    private Date dataValidade;

    public ProdutoPerecivel(String nome, Double preco, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValidade = Date.from(Instant.now());
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return getNome() + ", Preço: " + getPreco() + ", Quantidade: " + getQuantidade() + ", Data de Validade: " + getDataValidade();
    }
}