package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private LocalDate nascimento;
    private Long idade;
    private Double altura;
    private Double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, String nascimento, Double altura, Double peso) {
        this.nome = nome;
        this.nascimento = LocalDate.parse(nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.altura = altura;
        this.peso = peso;
        this.idade = setIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Long getIdade() {
        return idade;
    }

    public Long setIdade() {
        return ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }

    @Override
    public String toString() {
        return nome + " | " + nascimento + " | " + idade + " anos, " + altura
                + "m | " + peso + " kg.";
    }

}
