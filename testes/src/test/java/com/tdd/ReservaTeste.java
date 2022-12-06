package com.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tdd.model.Quarto;

public class ReservaTeste {
    private Quarto quarto;
    private static Set<Quarto> quartos = new HashSet<>();

    @BeforeEach
    public void cargaInicial() {
        try (Scanner arquivo = new Scanner(new File("D:/Mentoria/Exercícios/Quartos.csv"))) {
            while (arquivo.hasNextLine()) {
                Scanner linha = new Scanner(arquivo.nextLine());
                linha.useDelimiter(";");
                int numero = linha.nextInt();
                int hospedes = linha.nextInt();
                int camasDeSolteiro = linha.nextInt();
                int camasDeCasal = linha.nextInt();
                double valorDiaria = linha.nextDouble();
                quarto = new Quarto(numero, hospedes, camasDeSolteiro, camasDeCasal, valorDiaria);
                quartos.add(quarto);
            }
        } catch (Exception e) {
            assertEquals("O sistema não pode encontrar o arquivo especificado", e.getMessage());
        }
    }

    @Test
    public void verificaTamanhoDaLista() {
        assertEquals(12, quartos.size());
    }

    @Test
    public void verificaQuarto101() {
        assertEquals(1, quartos.stream().filter(q -> q.getNumero() == 201).count());
    }
}
