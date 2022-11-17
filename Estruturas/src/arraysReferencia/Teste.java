package arraysReferencia;

public class Teste {
    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[5];
        Pessoa p1 = new Pessoa();
        System.out.println(p1.toString());
        pessoas[1] = p1;
        System.out.println(pessoas[1]);

    }
}
