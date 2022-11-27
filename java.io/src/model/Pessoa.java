package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private static int TotalPessoas = 0;

    private String nome;
    private long cpf;
    private LocalDate nascimento;
    private String cidade;

    public Pessoa() {
    }

    public Pessoa(String nome, long cpf, LocalDate nascimento, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.cidade = cidade;
        TotalPessoas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long calculaIdade() {
        return ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }

    public static int getTotalPessoas() {
        return TotalPessoas;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s | CPF: %011d | Nascimento: %tD | Cidade: %s | Idade: %d anos;%n",
                nome, cpf, nascimento, cidade, calculaIdade());
    }

}
