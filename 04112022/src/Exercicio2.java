import java.util.Scanner;

/**
 * Ler a velocidade de um carro, e se ele passar de 80km/h
 * mostrar mensagem que foi multado e o valor da multa (R$ 7 por km excedente)
 * ou mostrar que está abaixo do limite de velocidade.
 */

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade: ");
        int velocidade = sc.nextInt();

        if (velocidade <= 80) {
            System.out.println("Você está dentro da velocidade permitida!");
        } else {
            System.out.printf("Voce excedeu a velocidade em %dkm/h, e o valor da multa é R$ %d", (velocidade - 80),
                    ((velocidade - 80) * 7));
        }

        sc.close();
    }
}
