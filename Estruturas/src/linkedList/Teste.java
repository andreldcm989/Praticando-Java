package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.addAll(List.of(1, 2, 3, 5, 8, 13, 21));
        System.out.println(numeros);
        numeros.remove(3);
        System.out.println(numeros);

        // inverte a lista e imprime os objetos enquanto há um próximo
        Iterator<Integer> i = numeros.descendingIterator();
        while (i.hasNext())
            System.out.println(i.next());

    }
}
