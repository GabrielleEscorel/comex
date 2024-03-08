package br.com.alura.comex.Modelo;

public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double procoUnitario) {
        this.precoUnitario = procoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString () {
        return "Produto{" +
                "Nome='" + nome + '\'' +
                ", Descricao='" + descricao + '\'' +
                ", PreçoUnitario='" + precoUnitario + '\'' +
                ", Quantidade=" + quantidade;
                }
    }

