package com.lira.msclientes.application.repository;

import com.lira.msclientes.domain.Produto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository {
    Produto saveProduto(Produto produto);
    List<Produto> getAllProdutos();
    Produto getProdutoById(UUID idProduto);
    void deletaProduto(Produto produto);
}
