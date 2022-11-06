import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

/**
 * Faça um programa que mostre na tela uma contagem
 * regressiva para o estouro de fogos de artifício,
 * indo de 10 até 0, com uma pausa de 1 segundo
 * entre eles.
 */

public class Exercicio2 {

    public static void main(String[] args) {

        Timer contagem = new Timer();
        TimerTask tarefa = new TimerTask() {
            int seg = 10;

            @Override
            public void run() {
                if (seg == -1) {
                    JOptionPane.showMessageDialog(null, "Feliz ano novo!");
                    System.exit(0);
                } else {
                    System.out.println(seg);
                    seg--;
                }
            }
        };
        contagem.scheduleAtFixedRate(tarefa, 0, 1000);
    }

}
