package com.lira.msclientes.application.service;

import com.lira.msclientes.application.api.request.ProdutoRequest;
import com.lira.msclientes.application.api.response.ProdutoResponse;
import org.springframework.stereotype.Service;

@Service
public interface ProdutoService {
    ProdutoResponse postProduto(ProdutoRequest produtoRequest);
//    List<ProdutoListResponse> getAllProdutos();
//    ProdutoDetalhadoResponse getProdutoById(UUID idProduto);
//    void patchProdutoById(UUID idProduto, ProdutoPatchRequest produtoPatchRequest);
//    void alteraStatusProdutoParaEmEstoque(UUID idProduto);
//    void alteraStatusProdutoParaForaDeEstoque(UUID idProduto);
//    void deletaProduto(UUID idProduto);
}
