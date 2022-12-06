package com.tdd;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new File("Quartos.csv"))) {
            System.out.println("leu!");
        } catch (Exception e) {
            System.out.println("Não leu");
        }

    }
}
