import javax.swing.JOptionPane;

/**
 * Faça um programa que leia uma frase e verifique:
 * quantas vezes a letra A aparece;
 * posição da primeira letra A;
 * última posição da letra A.
 */

public class Exercicio5 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase");
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == 'a')
                cont++;
        }
        JOptionPane.showMessageDialog(
                null,
                "Ocorrências da letra A: " + cont
                        + "\nPrimeira ocorrência de A: " + frase.toLowerCase().indexOf("a")
                        + "\nUltima ocorrência de A: " + frase.toLowerCase().lastIndexOf("a"));
    }
}
