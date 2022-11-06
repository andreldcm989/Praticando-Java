import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Recebo uma string com letras repetidas e
 * imprimir a letra e sua quantidade;
 * se tiver mais de 9 repetições, reinicia a contagem em um novo elemento
 */

public class Exercicio4 {
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null, "Entre com o texto:");
        List<String> resultado = new ArrayList<>();
        String letra = "";

        for (int i = 0; i < texto.length(); i++) {
            if (letra.contains(String.valueOf(texto.charAt(i))) || i == 0) {
                letra += String.valueOf(texto.charAt(i));
            } else {
                resultado.add(letra);
                letra = String.valueOf(texto.charAt(i));
            }
            if (i == texto.length() - 1) {
                resultado.add(letra);
            }
        }
        System.out.println(resultado.contains("A"));
        StringBuilder saida = new StringBuilder("[ ");

        for (String s : resultado) {
            if (s.length() > 9) {
                saida.append((s.substring(0, 1) + "9, "));
                saida.append((s.substring(0, 1) + (s.length() - 9) + ", "));
            } else {
                saida.append(s.substring(0, 1) + s.length() + ", ");
            }
        }

        saida.deleteCharAt(saida.lastIndexOf(","));
        saida.append("]");
        System.out.println(saida);

    }
}
