import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("André Luiz da Cruz", "12/03/1988", 1.91, 92.2);
        Pessoa p2 = new Pessoa("André Luis da Cruz", "11/01/1999", 1.62, 82.2);
        Pessoa p3 = new Pessoa("Ana Paula", "29/07/1992", 1.69, 92.2);
        Pessoa p4 = new Pessoa("Alberto Lima", "12/05/1988", 1.71, 93.2);
        Pessoa p5 = new Pessoa("Valentina Pessoa", "16/01/1969", 1.62, 80.3);
        Pessoa p6 = new Pessoa("Vitor Selva", "31/07/1975", 1.741, 85.3);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
        System.out.println("Ordem de inserção:");
        pessoas.forEach(curso -> System.out.println(curso));
        System.out.println("-------------------------");

        System.out.println("Ordem natural implementada na classe Pessoa:");
        Collections.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("---------------------------");
        System.out.println("Por idade:");
        pessoas.sort(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return Long.compare(p1.getIdade(), p2.getIdade());
            }
        });
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("------------------------------");
        System.out.println("Por idade DECRESCENTE, com LAMBDA:");
        pessoas.sort((o1, o2) -> Long.compare(o2.getIdade(), o1.getIdade()));
        pessoas.forEach(p -> System.out.println(p));

    }
}
