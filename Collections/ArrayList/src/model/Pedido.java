package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido implements Comparable<Pedido> {

    private String destino;
    private LocalDate dataEntrega;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String destino, LocalDate dataEntrega) {
        this.destino = destino;
        this.dataEntrega = dataEntrega;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    public void adiciona(Produto produto) {
        produtos.add(produto);
    }

    public void exclui(Produto produto) {
        produtos.remove(produto);
    }

    public double calculaNota() {
        return produtos.stream().mapToDouble(Produto::total).sum();
    }

    @Override
    public int compareTo(Pedido pedido) {
        return dataEntrega.compareTo(pedido.dataEntrega);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destino == null) ? 0 : destino.hashCode());
        result = prime * result + ((dataEntrega == null) ? 0 : dataEntrega.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        if (destino == null) {
            if (other.destino != null)
                return false;
        } else if (!destino.equals(other.destino))
            return false;
        if (dataEntrega == null) {
            if (other.dataEntrega != null)
                return false;
        } else if (!dataEntrega.equals(other.dataEntrega))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Destino: %s, Data entrega: %2$td/%2$tm/%2$tY. Produtos: %n", destino, dataEntrega));
        produtos.forEach(p -> sb.append(p.toString()));
        sb.append(String.format("Total da nota: R$ %.2f %n", calculaNota()));
        sb.append("---------------------------------------------------------");
        return sb.toString();
    }

}
