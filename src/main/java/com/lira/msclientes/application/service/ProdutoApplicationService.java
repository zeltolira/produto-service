package com.lira.msclientes.application.service;

import com.lira.msclientes.application.api.request.ProdutoPatchRequest;
import com.lira.msclientes.application.api.request.ProdutoRequest;
import com.lira.msclientes.application.api.response.ProdutoDetalhadoResponse;
import com.lira.msclientes.application.api.response.ProdutoListResponse;
import com.lira.msclientes.application.api.response.ProdutoResponse;
import com.lira.msclientes.application.repository.ProdutoRepository;
import com.lira.msclientes.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutoApplicationService implements ProdutoService {

    private final ProdutoRepository produtoRespository;

    @Override
    public ProdutoResponse postProduto(ProdutoRequest produtoRequest) {
        log.info("[start] ProdutoApplicationService - postProduto");
        Produto produto = produtoRespository.saveProduto(new Produto(produtoRequest));
        log.info("[finish] ProdutoApplicationService - postProduto");
        return new ProdutoResponse(produto);
    }

    @Override
    public List<ProdutoListResponse> getAllProdutos() {
        log.info("[start] ProdutoApplicationService - getAllProdutos");
        List<Produto> produtos = produtoRespository.getAllProdutos();
        log.info("[finish] ProdutoApplicationService - getAllProdutos");
        return ProdutoListResponse.converte(produtos);
    }

    @Override
    public ProdutoDetalhadoResponse getProdutoById(UUID idProduto) {
        log.info("[start] ProdutoApplicationService - getProdutoById");
        Produto produto = produtoRespository.getProdutoById(idProduto);
        log.info("[finish] ProdutoApplicationService - getProdutoById");
        return new ProdutoDetalhadoResponse(produto);
    }

    @Override
    public void patchProdutoById(UUID idProduto, ProdutoPatchRequest produtoPatchRequest) {
        log.info("[start] ProdutoApplicationService - patchProdutoById");
        Produto produto = produtoRespository.getProdutoById(idProduto);
        produto.patchProduto(produtoPatchRequest);
        produtoRespository.saveProduto(produto);
        log.info("[finish] ProdutoApplicationService - patchProdutoById");
    }

    @Override
    public void alteraStatusProdutoParaEmEstoque(UUID idProduto) {
        log.info("[start] ProdutoApplicationService - alteraStatusProdutoParaEmEstoque");
        Produto produto = produtoRespository.getProdutoById(idProduto);
        produto.alteraStatusProdutoParaEmEstoque();
        produtoRespository.saveProduto(produto);
        log.info("[finish] ProdutoApplicationService - alteraStatusProdutoParaEmEstoque");

    }

    @Override
    public void alteraStatusProdutoParaForaDeEstoque(UUID idProduto) {
        log.info("[start] ProdutoApplicationService - alteraStatusProdutoParaForaDeEstoque");
        Produto produto = produtoRespository.getProdutoById(idProduto);
        produto.alteraStatusProdutoParaForaDeEstoque();
        produtoRespository.saveProduto(produto);
        log.info("[finish] ProdutoApplicationService - alteraStatusProdutoParaForaDeEstoque");
    }

    @Override
    public void deletaProduto(UUID idProduto) {
        log.info("[start] ProdutoApplicationService - deletaProduto");
        Produto produto = produtoRespository.getProdutoById(idProduto);
        produtoRespository.deletaProduto(produto);
        log.info("[finish] ProdutoApplicationService - deletaProduto");
    }
}
