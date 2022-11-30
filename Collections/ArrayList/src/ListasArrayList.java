import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

import model.Carro;

public class ListasArrayList {
    public static void main(String[] args) throws Exception {
        System.out.println(Locale.getDefault());
        Carro c1 = new Carro("Chevrolet", "Onix LT", 1.4, 2022, 58990.00);
        Carro c2 = new Carro("Chevrolet", "Onix LTZ", 1.6, 2020, 56890.00);
        Carro c3 = new Carro("Chevrolet", "Onix LTS", 1.4, 2018, 60990.00);
        Carro c4 = new Carro("Chevrolet", "Onix Plus", 2.0, 2023, 89990.00);

        ArrayList<Carro> carros = new ArrayList<>();
        carros.addAll(Arrays.asList(c1, c2, c3, c4));
        System.out.println("Ordem de inserção:");
        carros.forEach(carro -> System.out.println(carro));

        System.out.println("--------------------------------------");
        System.out.println("Ordem natural, definida na classe (por modelo):");
        Collections.sort(carros);
        carros.forEach(carro -> System.out.println(carro));

        System.out.println("--------------------------------------");
        System.out.println("Ordenando por ano, do mais novo para mais antigo:");
        carros.sort((car1, car2) -> car2.getAno().compareTo(car1.getAno()));
        carros.forEach(carro -> System.out.println(carro));

        System.out.println("--------------------------------------");
        System.out.println("Ordenando por valor com Comparator, do mais barato para mais caro:");
        carros.sort(Comparator.comparing(Carro::getValor));
        carros.forEach(carro -> System.out.println(carro));

    }
}
