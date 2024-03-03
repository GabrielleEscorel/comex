package br.com.alura.comex.Modelo;

import org.apache.commons.lang3.ObjectUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Pedido {

    private String categoria;
    private String produto;
    private Cliente cliente;
    private double preco;
    private int quantidade;
    private LocalDate data;

    public Pedido(String categoria, String produto, Cliente cliente, double preco, int quantidade, LocalDate data) {
        this.categoria = categoria;
        this.produto = produto;
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public static Pedido pedidoMaisCaro(ArrayList<Pedido> pedidos) {
        return pedidos.stream()
                .max(Comparator.comparingDouble(Pedido::getPreco))
                .orElse(null);
    }

    public static Pedido pedidoMaisBarato(ArrayList<Pedido> pedidos) {
        return pedidos.stream()
                .min(Comparator.comparingDouble(Pedido::getPreco))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Categoria='" + categoria + '\'' +
                ", Produto='" + produto + '\'' +
                ", Cliente='" + cliente + '\'' +
                ", Preço=" + preco +
                ", Quantidade=" + quantidade +
                ", Data=" + data +
                '}';
    }
}
