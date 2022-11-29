package model;

public class Carro implements Comparable<Carro> {

    private String marca;
    private String modelo;
    private Double potencia;
    private Integer ano;
    private Double valor;

    public Carro() {
    }

    public Carro(String marca, String modelo, Double potencia, Integer ano, Double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPotencia() {
        return potencia;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Carro carro) {
        return this.modelo.compareTo(carro.modelo);
    }

    @Override
    public String toString() {
        return String.format("Modelo: %s | Marca: %s | Potência: %.1f | Ano: %d | Valor: R$ %.2f", modelo, marca,
                potencia, ano, valor);
    }

}
