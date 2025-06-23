package com.lira.msclientes.application.service;

import com.lira.msclientes.application.api.request.ProdutoPatchRequest;
import com.lira.msclientes.application.api.request.ProdutoRequest;
import com.lira.msclientes.application.api.response.ProdutoDetalhadoResponse;
import com.lira.msclientes.application.api.response.ProdutoListResponse;
import com.lira.msclientes.application.api.response.ProdutoResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ProdutoService {
    ProdutoResponse postProduto(ProdutoRequest produtoRequest);
    List<ProdutoListResponse> getAllProdutos();
    ProdutoDetalhadoResponse getProdutoById(UUID idProduto);
    void patchProdutoById(UUID idProduto, ProdutoPatchRequest produtoPatchRequest);
    void alteraStatusProdutoParaEmEstoque(UUID idProduto);
    void alteraStatusProdutoParaForaDeEstoque(UUID idProduto);
    void deletaProduto(UUID idProduto);
}
