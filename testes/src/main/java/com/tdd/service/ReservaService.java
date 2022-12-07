package com.tdd.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaService {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void reservarQuarto(String checkIn, String checkOut) {
        LocalDate chIn = LocalDate.parse(checkIn, dtf);
        LocalDate chOut = LocalDate.parse(checkOut, dtf);
        if (chOut.isBefore(chIn)) {
            throw new IllegalArgumentException("A data de check-out deve ser um dia após o check-in.");
        }
    }
}
