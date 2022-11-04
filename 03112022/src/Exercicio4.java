import javax.swing.JOptionPane;

/**
 * Verifique se no nome digitado possui o nome "silva"
 */

public class Exercicio4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome completo:");
        if (nome.toLowerCase().contains("silva")) {
            JOptionPane.showMessageDialog(null, "Seu nome contém SILVA!");
        } else {
            JOptionPane.showMessageDialog(null, "Seu nome NÃO contém SILVA!");
        }

    }
}
