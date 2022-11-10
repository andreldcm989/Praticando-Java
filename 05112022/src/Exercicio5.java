
/**
 * Implementação de cálculo de jornada de trabalho
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<LocalTime> jornada = new ArrayList<>();

        String resp = "s";

        while (resp.equals("s")) {
            System.out.println("Insira um horario: ");
            LocalTime reg = LocalTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("HH:mm:ss"));
            jornada.add(reg);
            System.out.println("Deseja inserir mais um? (s/n)");
            resp = sc.nextLine();
        }

        System.out.println();
        System.out.println("REGISTROS: ");
        for (LocalTime localTime : jornada) {
            System.out.print(localTime + " | ");
        }

        System.out.println();
        LocalTime total = LocalTime.of(0, 0, 0);
        for (int i = 0; i < jornada.size(); i++) {
            if (i % 2 != 0) {
                total = total.plus(ChronoUnit.MILLIS.between(jornada.get(i - 1), jornada.get(i)), ChronoUnit.MILLIS);
            }
        }

        System.out.println("Total da jornada: " + total);

        sc.close();
    }
}
