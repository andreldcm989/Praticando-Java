package com.tdd;

import com.tdd.service.ReservaService;

public class App {
    public static void main(String[] args) throws Exception {
        ReservaService reservaService = new ReservaService();
        reservaService.reservarQuarto("12/01/2023", "18/01/2023");
    }
}
