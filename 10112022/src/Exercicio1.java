// # Crie um programa que leia dois valores e mostre um menu na tela:
// # [1]Somar
// # [2]multiplicar
// # [3]maior
// # [4]novos números
// # [5]sair do programa
// # Seu prgrama deverá realizar o operação solicitada em cada caso.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Escolha uma operação desejada:"
                + "\n[1]Somar"
                + "\n[2]Multiplicar"
                + "\n[3]Maior"
                + "\n[4]Menor"
                + "\n[5]Sair");
        System.out.print("Digite a opção: ");
        int escolha = sc.nextInt();
        sc.nextLine();
        System.out.println();
        switch (escolha) {
            case 1:
                System.out.println("Operação escolhida: SOMAR " + n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Operação escolhida: Multiplicar " + n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 3:
                System.out.println("Operação escolhida: MAIOR entre " + n1 + " e " + n2 + " = " + Math.max(n1, n2));
                break;
            case 4:
                System.out.println("Operação escolhida: MENOR entre " + n1 + " 3 " + n2 + " = " + Math.min(n1, n2));
                break;
            case 5:
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println("Programa finalizado, obrigado!");

        sc.close();
    }
}
