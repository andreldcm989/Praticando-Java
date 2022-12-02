package service;

import model.Produto;

public interface ICalculaNota {

    default double calcula(Produto produto) {
        return produto.getValor() * produto.getQuantidade();
    }
}
