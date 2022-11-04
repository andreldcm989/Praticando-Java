import javax.swing.JOptionPane;

/**
 * Leia o nome completo de alguem e mostre o primeiro e último nome
 * Deixar a primeira letra do nome em maiúsculo.
 */

public class Exercicio6 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome completo:");
        String[] lista = nome.split("\s");
        JOptionPane.showMessageDialog(null, "Primeiro nome: " + lista[0]);
        JOptionPane.showMessageDialog(null, "Ultimo nome: " + lista[lista.length - 1]);
    }
}
