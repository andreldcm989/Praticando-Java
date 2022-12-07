package com.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tdd.model.Quarto;
import com.tdd.model.Reserva;

public class ReservaTeste {
    private Quarto quarto;
    private Reserva reserva;
    private static Set<Quarto> quartos = new HashSet<>();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @BeforeEach
    public void cargaInicialQuartos() throws Exception {
        Scanner arquivo = new Scanner(new File("D:/Mentoria/Exercícios/Quartos.csv"));
        Scanner arquivo2 = new Scanner(new File("D:/Mentoria/Exercícios/Reservas.csv"));
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

        while (arquivo2.hasNextLine()) {
            Scanner linha = new Scanner(arquivo2.nextLine());
            linha.useDelimiter(";");
            int codigo = linha.nextInt();
            int numeroQuarto = linha.nextInt();
            Quarto quarto = quartos.stream().filter(q -> q.getNumero() == numeroQuarto).findFirst().get();
            LocalDate checkIn = LocalDate.parse(linha.next(), formato);
            LocalDate checkOut = LocalDate.parse(linha.next(), formato);
            reserva = new Reserva(codigo, quarto, checkIn, checkOut, codigo);
            quarto.salvarReserva(reserva);
        }

        arquivo.close();
        arquivo2.close();

    }

    @Test
    public void verificaTamanhoDaLista() {
        assertEquals(12, quartos.size());
    }

    @Test
    public void verificaQuarto101() {
        assertEquals(1, quartos.stream().filter(q -> q.getNumero() == 201).count());
    }

    @Test
    public void qtdeReservas101() {
        int tamanho = quartos.stream().filter(q -> q.getNumero() == 101).mapToInt(q -> q.getReservas().size())
                .findFirst().getAsInt();
        assertEquals(43, tamanho);

    }
}
