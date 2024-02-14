package br.com.alura.comex;

public class Produto {
    public static void main(String[] args) {
        String nomeLivro = "A Seleção";
        String descricaoLivro1 = "Para trinta e cinco garotas, a Seleção é a chance de uma vida. É a oportunidade de ser alçada a um ";
        String descricaoLivro2 = "mundo de vestidos deslumbrantes e joias valiosas. De morar em um palácio, conquistar o coração do belo ";
        String descricaoLivro3 = "príncipe Maxon e um dia ser a rainha. America Singer, no entanto, estar entre as Selecionadas é um pesadelo.";
        double valorLivro = 35.99;

        System.out.println("Nome: " + nomeLivro);
        System.out.println();
        System.out.println("Descrição: " +descricaoLivro1 + System.lineSeparator() + descricaoLivro2 + System.lineSeparator() + descricaoLivro3 );
        System.out.println();
        System.out.println("Preço: R$"+valorLivro);
    }

}
