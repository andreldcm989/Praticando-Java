import javax.swing.JOptionPane;

/**
 * Criar um sistema que receba um numero entre 0 e 9999 e retorne
 * Número
 * Unidade
 * Dezena
 * Centena e
 * Milhar
 */

public class Exercicio2 {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 0 e 9999"));
        while (n < 0 || n > 9999) {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero inválido. Digite um número entre 0 e 9999"));
        }

        if (n < 10) {
            JOptionPane.showMessageDialog(null, "Unidade: "
                    + n.toString().charAt(0) + "\nDezena: 0\nCentena: 0\nMilhar: 0");
        } else if (n < 100) {
            JOptionPane.showMessageDialog(null, "Unidade: " + n.toString().charAt(1)
                    + "\nDezena: " + n.toString().charAt(0) + "\nCentena: 0\nMilhar: 0");
        } else if (n < 1000) {
            JOptionPane.showMessageDialog(null, "Unidade: " + n.toString().charAt(2)
                    + "\nDezena: " + n.toString().charAt(1)
                    + "\nCentena: " + n.toString().charAt(0) + "\nMilhar: 0");
        } else {
            JOptionPane.showMessageDialog(null, "Unidade: " + n.toString().charAt(3)
                    + "\nDezena: " + n.toString().charAt(2)
                    + "\nCentena: " + n.toString().charAt(1)
                    + "\nMilhar: " + n.toString().charAt(0));
        }
    }
}
