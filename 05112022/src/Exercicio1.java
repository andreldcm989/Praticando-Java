import javax.swing.JOptionPane;

/**
 * Escreva um programa que pergunte o salário de um funcionário e
 * calcule o valor do seu aumento. Para salários superiores a R$ 1.250,00
 * calcule um aumento de 10%. Para inferiores ou iguais, o aumento é 15%.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salario:"));
        System.out.println(salario);
        String taxa;
        if (salario <= 1250.00) {
            salario *= 1.15;
            taxa = "10%";
        } else {
            salario *= 1.1;
            taxa = "15%";
        }
        JOptionPane.showMessageDialog(null, "O salário foi reajustado em " + taxa
                + ".\nO novo salário é R$ " + String.format("%.2f", salario));
    }
}
