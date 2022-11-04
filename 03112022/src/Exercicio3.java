import javax.swing.JOptionPane;

/**
 * Receba o nome de uma cidade e responda se começa com santo
 */
public class Exercicio3 {
    public static void main(String[] args) {
        String cidade = JOptionPane.showInputDialog(null, "Digite o nome da cidade");

        if (cidade.length() < 5) {
            JOptionPane.showMessageDialog(null, "A cidade NÃO começa com Santo!");
        } else if (cidade.substring(0, 5).equalsIgnoreCase("santo")) {
            JOptionPane.showMessageDialog(null, "A cidade começa com Santo!");
        } else {
            JOptionPane.showMessageDialog(null, "A cidade NÃO começa com Santo!");
        }
    }

}
