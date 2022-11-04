import java.util.Scanner;

/**
 * Receber uma string, transformar cada caractere em número
 * 
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        String numero = in.nextLine();
        int[] numeros = new int[numero.length()];
        int total = 1;

        for (int i = 0; i < numero.length(); i++) {
            numeros[i] = Integer.parseInt(numero.substring(i, i + 1));
        }

        for (int i = 0; i < numeros.length; i++) {
            total *= numeros[i];
        }

        System.out.println(total);

        in.close();
    }
}
