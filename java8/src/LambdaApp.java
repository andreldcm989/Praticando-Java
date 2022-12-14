import java.io.File;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

import model.Produto;

public class LambdaApp {
        public static void main(String[] args) throws Exception {
                Scanner arquivo = new Scanner(new File("Produtos.csv"), "UTF-8");
                Collection<Produto> produtos = new LinkedHashSet<>();

                while (arquivo.hasNextLine()) {
                        Scanner itens = new Scanner(arquivo.nextLine());
                        itens.useDelimiter(";");
                        String nome = itens.next();
                        String marca = itens.next();
                        int quantidade = itens.nextInt();
                        double valor = itens.nextDouble();
                        Produto p = new Produto(nome, marca, valor, quantidade);
                        produtos.add(p);
                }
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                System.out.println("Todos os produtos");
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                produtos.forEach(System.out::println);
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                System.out.println("Produtos Dell");
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                produtos.stream().filter(p -> p.getMarca().equalsIgnoreCase("dell")).forEach(System.out::println);
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                System.out.println("Mais de 10 produtos");
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                produtos.stream().filter(p -> p.getQuantidade() > 10)
                                .sorted((p1, p2) -> Integer.compare(p1.getQuantidade(), p2.getQuantidade()))
                                .forEach(System.out::println);
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                System.out.println("Valor Total produtos Dell");
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                System.out.println("Quantidade: " + produtos.stream().filter(p -> p.getMarca().equalsIgnoreCase("dell"))
                                .mapToInt(Produto::getQuantidade).sum());
                System.out.println("Valor total: R$ "
                                + produtos.stream().filter(p -> p.getMarca().equalsIgnoreCase("dell"))
                                                .mapToDouble(Produto::getValor).sum());
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                System.out.println("Notebooks 14 polegadas");
                System.out.println(
                                "--------------------------------------------------------------------------------------------");
                produtos.stream()
                                .filter(p -> p.getNome().toLowerCase().contains("14"))
                                .forEach(System.out::println);

                arquivo.close();
        }
}
