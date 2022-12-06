package com.tdd.model;

import java.time.LocalDate;

public class Reserva {

    private int codigo;
    private Quarto quarto;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int totalHospedes;
    private double valorTotalDiárias;

    public Reserva() {
    }

    public Reserva(int codigo, Quarto quarto, LocalDate checkIn, LocalDate checkOut, int totalHospedes) {
        this.codigo = codigo;
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.totalHospedes = totalHospedes;
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
