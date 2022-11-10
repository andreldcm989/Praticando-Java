
public class Exercicio4 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 0; i <= 500; i += 3) {
            if (i % 2 == 1)
                soma += i;
        }

        System.out.println(soma);
    }
}
