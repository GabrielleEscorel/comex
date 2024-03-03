package br.com.alura.comex.Executavel;

import br.com.alura.comex.Modelo.Cliente;
import br.com.alura.comex.Modelo.Pedido;
import br.com.alura.comex.Modelo.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaPedidoOrdenado {
    public static void main(String[] args) {
        Produto produtoCinematografico1 = new Produto();
        produtoCinematografico1.setNome("Pânico");
        produtoCinematografico1.setDescricao("Jovens enfrentam um assassino mascarado que usa jogos mentais e referências de filmes para aterrorizá-los.");
        produtoCinematografico1.setPrecoUnitario(35.99);
        produtoCinematografico1.setQuantidade(15);

        Produto produtoCinematografico2 = new Produto();
        produtoCinematografico2.setNome("A Casa de Cera");
        produtoCinematografico2.setDescricao("A Casa de Cera: Grupo fica preso em uma cidade aparentemente deserta, descobrindo que seus habitantes são figuras enceradas, enquanto tentam sobreviver aos horrores que se revelam.");
        produtoCinematografico2.setPrecoUnitario(39.90);
        produtoCinematografico2.setQuantidade(12);

        Produto produtoCinematografico3 = new Produto();
        produtoCinematografico3.setNome("Jogos Mortais");
        produtoCinematografico3.setDescricao("Serial killer coloca vítimas em jogos macabros que testam sua sobrevivência e moralidade, desafiando-os a escapar de armadilhas mortais.");
        produtoCinematografico3.setPrecoUnitario(42.00);
        produtoCinematografico3.setQuantidade(5);

        Produto produtoCinematografico4 = new Produto();
        produtoCinematografico4.setNome("Corra");
        produtoCinematografico4.setDescricao("Thriller psicológico que aborda questões raciais, envolvendo um jovem negro que descobre segredos perturbadores ao visitar a família de sua namorada branca.");
        produtoCinematografico4.setPrecoUnitario(30.00);
        produtoCinematografico4.setQuantidade(15);

        Produto produtoCinematografico5 = new Produto();
        produtoCinematografico5.setNome("Tamara");
        produtoCinematografico5.setDescricao("Horror sobrenatural sobre uma estudante vingativa que retorna dos mortos após ser alvo de bullying, buscando vingança com poderes sobrenaturais.");
        produtoCinematografico5.setPrecoUnitario(45.90);
        produtoCinematografico5.setQuantidade(3);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marina Alves");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Luiz Mateus");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Julia Perrigo");

        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido("Filme", produtoCinematografico1.getNome(), cliente1, produtoCinematografico1.getPrecoUnitario(), 2, LocalDate.now());
        Pedido pedido2 = new Pedido("Filme", produtoCinematografico2.getNome(), cliente2, produtoCinematografico2.getPrecoUnitario(), 3, LocalDate.now());
        Pedido pedido3 = new Pedido("Filme", produtoCinematografico3.getNome(), cliente3, produtoCinematografico3.getPrecoUnitario(), 2, LocalDate.now());
        Pedido pedido4 = new Pedido("Filme", produtoCinematografico5.getNome(), cliente2, produtoCinematografico5.getPrecoUnitario(), 1, LocalDate.now());
        Pedido pedido5 = new Pedido("Filme", produtoCinematografico4.getNome(), cliente3, produtoCinematografico4.getPrecoUnitario(), 6, LocalDate.now());

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);


        Collections.sort(pedidos, Comparator.comparingDouble(Pedido::getPreco).reversed());
        System.out.println("Pedidos ordenados pelo maior valor:");
        for (Pedido pedido : pedidos) {
            System.out.println("Produto: " + pedido.getProduto());
            System.out.println("Preço: " + pedido.getPreco());
            System.out.println();
        }

        Collections.sort(pedidos, Comparator.comparingDouble(Pedido::getPreco));
        System.out.println("Pedidos ordenados pelo menor valor:");
        for (Pedido pedido : pedidos) {
            System.out.println("Produto: " + pedido.getProduto());
            System.out.println("Preço: " + pedido.getPreco());
            System.out.println();


        }
    }
}
