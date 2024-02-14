package br.com.alura.comex;

import java.util.Scanner;

public class ProdutoSerie {
    private String nome;

    public ProdutoSerie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        ProdutoSerie novaSerie = criarSerieTV();
        System.out.println("Série de TV criada: " + novaSerie.getNome());
    }

    public static ProdutoSerie criarSerieTV() {
        Scanner scanner = new Scanner(System.in);
        String nome;

        do {
            System.out.print("Digite o nome da série: ");
            nome = scanner.nextLine().trim();

            if (nome.isEmpty()) {
                System.out.println("O nome da série é obrigatório. Tente novamente.");
            }

        } while (nome.isEmpty());

        return new ProdutoSerie(nome);
    }
}
