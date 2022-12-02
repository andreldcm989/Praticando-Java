package model;

import java.io.Serializable;

import service.ICalculaNota;

public class Produto implements Serializable, ICalculaNota {

    private String nome;
    private String marca;
    private double valor;
    private int quantidade;

    public Produto(String nome, String marca, double valor, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("Produto: %-25s | Marca: %-15s | Qtde.: %-4d | Valor: R$ %.2f", nome, marca,
                quantidade,
                valor);
    }

}
