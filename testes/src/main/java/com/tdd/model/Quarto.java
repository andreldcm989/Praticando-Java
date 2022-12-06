package com.tdd.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Quarto {

    private int numero;
    private int hospedes;
    private int camasDeSolteiro;
    private int camasDeCasal;
    private double valorDiaria;
    private Collection<Reserva> reservas = new HashSet<>();

    public Quarto() {
    }

    public Quarto(int numero, int hospedes, int camasDeSolteiro, int camasDeCasal, double valorDiaria) {
        this.numero = numero;
        this.hospedes = hospedes;
        this.camasDeSolteiro = camasDeSolteiro;
        this.camasDeCasal = camasDeCasal;
        this.valorDiaria = valorDiaria;
    }

    public int getNumero() {
        return numero;
    }

    public int getHospedes() {
        return hospedes;
    }

    public int getCamasDeSolteiro() {
        return camasDeSolteiro;
    }

    public int getCamasDeCasal() {
        return camasDeCasal;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
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
        Quarto other = (Quarto) obj;
        if (numero != other.numero)
            return false;
        return true;
    }

    public Collection<Reserva> getReservas() {
        return Collections.unmodifiableCollection(reservas);
    }

    public void salvarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void excluirReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

}
