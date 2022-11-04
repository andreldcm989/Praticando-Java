import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Escreva um programação que faça o computador "pensar" em um número inteiro
 * entre 0 e 5 e
 * peça para o usuário tentar descobrir qual foi o número escolhido pelo
 * computador.
 * O programa deverá escrever na tela se o usuário na tela se o usuário venceu
 * ou perdeu.
 */

public class Exercicio3 {
    public static void main(String[] args) {

        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivinhe o numero entre 0 e 5:"));
        Random numero = new Random();
        int n = numero.nextInt(5);

        if (entrada == n) {
            JOptionPane.showMessageDialog(null, "Você ACERTOU! O numero era " + n + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Você ERROU! O numero era " + n + "!");
        }

    }
}
