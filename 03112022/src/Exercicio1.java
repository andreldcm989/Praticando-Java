import javax.swing.JOptionPane;

/**
 * Implementar um sistema que lê um nome e apresente o nome em
 * maiúsculo, minúsculo, seu tamanho sem os espaços em branco e o
 * tamanho do primeiro nome.
 * 
 */
public class Exercicio1 {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog(null, "Digite o primeiro nome");

        JOptionPane.showMessageDialog(null, "Maiusculo: " + nome1.toUpperCase());
        JOptionPane.showMessageDialog(null, "Minusculo: " + nome1.toLowerCase());
        JOptionPane.showMessageDialog(null, "Total de letras: " + nome1.replace(" ", "").length());
        JOptionPane.showMessageDialog(null,
                "Letras no primeiro nome: " + nome1.substring(0, nome1.indexOf(" ")).length());
    }
}
