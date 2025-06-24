package com.lira.msclientes.application.api;

import com.lira.msclientes.application.api.request.ProdutoPatchRequest;
import com.lira.msclientes.application.api.request.ProdutoRequest;
import com.lira.msclientes.application.api.response.ProdutoDetalhadoResponse;
import com.lira.msclientes.application.api.response.ProdutoListResponse;
import com.lira.msclientes.application.api.response.ProdutoResponse;
import com.lira.msclientes.application.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoApi {
    private final ProdutoService produtoService;

    @Override
    public ProdutoResponse postProduto(ProdutoRequest produtoRequest) {
        log.info("[start] ProdutoController - postProduto");
        ProdutoResponse produtoCriado = produtoService.postProduto(produtoRequest);
        log.info("[finish] ProdutoController - postProduto");
        return null;
    }

    @Override
    public List<ProdutoListResponse> getAllProdutos() {
        log.info("[start] ProdutoController - getAllProdutos");
        List<ProdutoListResponse> produtos = produtoService.getAllProdutos();
        log.info("[finish] ProdutoController - getAllProdutos");
        return produtos;
    }

    @Override
    public ProdutoDetalhadoResponse getProdutoById(UUID idProduto) {
        log.info("[start] ProdutoController - getProdutoById");
        ProdutoDetalhadoResponse produtoDetalhado = produtoService.getProdutoById(idProduto);
        log.info("[finish] ProdutoController - getProdutoById");
        return produtoDetalhado;
    }

    @Override
    public void patchProdutoById(UUID idProduto, ProdutoPatchRequest produtoPatchRequest) {
        log.info("[start] ProdutoController - patchProdutoById");
        log.info("[idProduto] {}", idProduto);
        produtoService.patchProdutoById(idProduto, produtoPatchRequest);
        log.info("[finish] ProdutoController - patchProdutoById");
    }

    @Override
    public void alteraStatusProdutoParaEmEstoque(UUID idProduto) {
        log.info("[start] ProdutoController - alteraStatusProdutoParaEmEstoque");
        log.info("[idProduto] {}", idProduto);
        produtoService.alteraStatusProdutoParaEmEstoque(idProduto);
        log.info("[finish] ProdutoController - alteraStatusProdutoParaEmEstoque");
    }

    @Override
    public void alteraStatusProdutoParaForaDeEstoque(UUID idProduto) {
        log.info("[start] ProdutoController - alteraStatusProdutoParaForaDeEstoque");
        log.info("[idProduto] {}", idProduto);
        produtoService.alteraStatusProdutoParaForaDeEstoque(idProduto);
        log.info("[finish] ProdutoController - alteraStatusProdutoParaForaDeEstoque");
    }

    @Override
    public void deletaProduto(UUID idProduto) {
        log.info("[start] ProdutoController - deletaProduto");
        log.info("[idProduto] {}", idProduto);
        produtoService.deletaProduto(idProduto);
        log.info("[finish] ProdutoController - deletaProduto");
    }
}

