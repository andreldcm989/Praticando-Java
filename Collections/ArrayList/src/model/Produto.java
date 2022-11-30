package model;

public class Produto implements Comparable<Produto> {

    private String nome;
    private Integer quantidade;
    private Double valor;

    public Produto() {
    }

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Double total() {
        return valor * quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareTo(produto.nome);
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, quantidade: %d, valor: R$ %.2f, total: %.2f; %n", nome, quantidade, valor,
                total());
    }

}
