import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Pedido;
import model.Produto;

public class Conjuntos {
    public static void main(String[] args) {

        Pedido p1 = new Pedido("São Paulo", LocalDate.of(2022, 12, 24));
        Pedido p2 = new Pedido("Araguari", LocalDate.of(2022, 12, 05));
        Pedido p6 = new Pedido("Araguari", LocalDate.of(2022, 12, 05));
        Pedido p3 = new Pedido("Uberlândia", LocalDate.of(2022, 11, 30));
        Pedido p4 = new Pedido("Curitiba", LocalDate.of(2023, 02, 1));

        p1.adiciona(new Produto("TV", 3, 2499.00));
        p1.adiciona(new Produto("Notebook", 5, 5250.00));
        p1.adiciona(new Produto("SmartPhone", 2, 1800.00));
        p1.adiciona(new Produto("SmarTV", 8, 5000.00));
        p2.adiciona(new Produto("TV", 1, 2499.00));
        p2.adiciona(new Produto("Notebook", 3, 5250.00));
        p2.adiciona(new Produto("SmartPhone", 10, 1800.00));
        p2.adiciona(new Produto("SmarTV", 6, 5000.00));

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.addAll(Arrays.asList(p1, p2, p3, p4));

        pedidos.forEach(p -> {
            if (p.getProdutos().size() > 0) {
                List<Produto> prod = new ArrayList<>(p.getProdutos());
                prod.sort((pr1, pr2) -> pr1.getQuantidade().compareTo(pr2.getQuantidade()));
                System.out.println(prod);
            }
        });

        System.out.println(p2.equals(p6));
        System.out.println(pedidos.contains(p6));

    }
}
