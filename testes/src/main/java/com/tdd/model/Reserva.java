package com.tdd.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private int codigo;
    private Quarto quarto;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int totalHospedes;
    private double valorTotalDiárias;

    public Reserva() {
    }

    public Reserva(int codigo, Quarto quarto, String checkIn, String checkOut, int totalHospedes) {
        this.codigo = codigo;
        this.quarto = quarto;
        this.checkIn = LocalDate.parse(checkIn, formato);
        this.checkOut = LocalDate.parse(checkOut, formato);
        this.totalHospedes = totalHospedes;
        calculaDiarias();
    }

    public int getCodigo() {
        return codigo;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public int getTotalHospedes() {
        return totalHospedes;
    }

    public double getValorTotalDiárias() {
        return valorTotalDiárias;
    }

    public void calculaDiarias() {
        valorTotalDiárias = quarto.getValorDiaria() * ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reserva other = (Reserva) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

}
