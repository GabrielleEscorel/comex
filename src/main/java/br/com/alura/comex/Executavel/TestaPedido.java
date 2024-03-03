package br.com.alura.comex.Executavel;

import br.com.alura.comex.Modelo.Pedido;
import br.com.alura.comex.Modelo.Produto;
import br.com.alura.comex.Modelo.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestaPedido {
    public static void main(String[] args) {
    Produto produtoAudiovisual1 = new Produto();
        produtoAudiovisual1.setNome("Orphan Black");
        produtoAudiovisual1.setDescricao("Orphan Black série sobre clonagem humana.");
        produtoAudiovisual1.setPrecoUnitario(45.00);
        produtoAudiovisual1.setQuantidade(10);

    Produto produtoAudiovisual2 = new Produto();
        produtoAudiovisual2.setNome("Outlander");
        produtoAudiovisual2.setDescricao("Outlander é uma série que mistura romance e viagem no tempo, acompanhando Claire Randall em suas aventuras entre o século XX e XVIII na Escócia.");
        produtoAudiovisual2.setPrecoUnitario(50.00);
        produtoAudiovisual2.setQuantidade(7);

    Produto produtoAudiovisual3 = new Produto();
        produtoAudiovisual3.setNome("Stranger Things");
        produtoAudiovisual3.setDescricao("Stranger Things: suspense supernatural nos anos 80 com crianças e mistérios.");
        produtoAudiovisual3.setPrecoUnitario(55.00);
        produtoAudiovisual3.setQuantidade(11);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marina Alves");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Luiz Mateus");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Julia Perrigo");

        System.out.println("Produto: " + produtoAudiovisual1.getNome());
        System.out.println("Preço: " + produtoAudiovisual1.getPrecoUnitario());
        System.out.println("Data: " + LocalDate.now());

        Pedido pedido1 = new Pedido("Série", produtoAudiovisual1.getNome(), cliente1, produtoAudiovisual1.getPrecoUnitario(), 10,LocalDate.now());
        Pedido pedido2 = new Pedido("Série", produtoAudiovisual2.getNome(), cliente2, produtoAudiovisual2.getPrecoUnitario(), 7, LocalDate.now());
        Pedido pedido3 = new Pedido("Série", produtoAudiovisual3.getNome(), cliente3, produtoAudiovisual3.getPrecoUnitario(), 11, LocalDate.now());

    ArrayList<Pedido> pedidos = new ArrayList<>();
    pedidos.add(pedido1);
    pedidos.add(pedido2);
    pedidos.add(pedido3);

    Pedido pedidoMaisCaro = Pedido.pedidoMaisCaro(pedidos);
    Pedido pedidoMaisbarato = Pedido.pedidoMaisBarato(pedidos);

    if (pedidoMaisCaro != null) {
        System.out.println("Pedido mais caro:");
        System.out.println("Produto: " + pedidoMaisCaro.getProduto());
        System.out.println("Preço: " + pedidoMaisCaro.getPreco());
    } else {
        System.out.println("Não foi possivel encontrar o pedido mais caro.");
    }

        if (pedidoMaisbarato != null) {
            System.out.println("Pedido mais baratos:");
            System.out.println("Produto: " + pedidoMaisbarato.getProduto());
            System.out.println("Preço: " + pedidoMaisbarato.getPreco());
        } else {
            System.out.println("Não foi possivel encontrar o pedido mais barato.");
        }
    }
}
