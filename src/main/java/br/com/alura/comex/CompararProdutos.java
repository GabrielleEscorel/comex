package br.com.alura.comex;

public class CompararProdutos implements Comparable<CompararProdutos> {
    private String titulo;
    private String serie;
    private int anoLancamento;

    public CompararProdutos(String titulo, String serie, int anoLancamento) {
        this.titulo = titulo;
        this.serie = serie;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public int compareTo(CompararProdutos outroProduto) {
        return Integer.compare(this.anoLancamento, outroProduto.anoLancamento);
    }

    @Override
    public String toString() {
        return "CompararProdutos{" +
                "titulo='" + titulo + '\'' +
                ", serie='" + serie + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }

    public static void main(String[] args) {
        CompararProdutos dvdOutlander = new CompararProdutos("Outlander: Temporada 1", "Outlander", 2014);
        CompararProdutos dvdOrphanBlack = new CompararProdutos("Orphan Black: Temporada 1", "Orphan Black", 2013);

        int resultadoComparacao = dvdOutlander.compareTo(dvdOrphanBlack);

        if (resultadoComparacao < 0) {
            System.out.println(dvdOutlander.getTitulo() + " foi lançado antes de " + dvdOrphanBlack.getTitulo());
        } else if (resultadoComparacao > 0) {
            System.out.println(dvdOutlander.getTitulo() + " foi lançado depois de " + dvdOrphanBlack.getTitulo());
        } else {
            System.out.println("Ambos os DVDs foram lançados no mesmo ano");
        }
    }
}

