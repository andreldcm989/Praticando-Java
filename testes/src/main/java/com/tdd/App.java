package com.tdd;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.tdd.model.Quarto;
import com.tdd.model.Reserva;

public class App {
    public static void main(String[] args) throws Exception {

        // Set<Quarto> quartos = new HashSet<>();
        // DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Scanner arquivo = new Scanner(new
        // File("D:/Mentoria/Exercícios/Quartos.csv"));
        // while (arquivo.hasNextLine()) {
        // Scanner linha = new Scanner(arquivo.nextLine());
        // linha.useDelimiter(";");
        // int numero = linha.nextInt();
        // int hospedes = linha.nextInt();
        // int camasDeSolteiro = linha.nextInt();
        // int camasDeCasal = linha.nextInt();
        // double valorDiaria = linha.nextDouble();
        // Quarto quarto = new Quarto(numero, hospedes, camasDeSolteiro, camasDeCasal,
        // valorDiaria);
        // quartos.add(quarto);
        // }

        // Scanner arquivo2 = new Scanner(new
        // File("D:/Mentoria/Exercícios/Reservas.csv"));
        // while (arquivo2.hasNextLine()) {
        // Scanner linha = new Scanner(arquivo2.nextLine());
        // linha.useDelimiter(";");
        // int codigo = linha.nextInt();
        // int numeroQuarto = linha.nextInt();
        // Quarto quarto = quartos.stream().filter(q -> q.getNumero() ==
        // numeroQuarto).findFirst().get();
        // LocalDate checkIn = LocalDate.parse(linha.next(), formato);
        // LocalDate checkOut = LocalDate.parse(linha.next(), formato);
        // Reserva reserva = new Reserva(codigo, quarto, checkIn, checkOut, codigo);
        // quarto.salvarReserva(reserva);
        // }

        // System.out.println(quartos.stream().filter(q -> q.getNumero() ==
        // 101).mapToInt(q -> q.getReservas().size())
        // .findFirst().getAsInt());

        // arquivo.close();
        // arquivo2.close();
    }
}
