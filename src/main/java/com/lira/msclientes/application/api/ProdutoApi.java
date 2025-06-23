package com.lira.msclientes.application.api;

import com.lira.msclientes.application.api.request.ProdutoPatchRequest;
import com.lira.msclientes.application.api.request.ProdutoRequest;
import com.lira.msclientes.application.api.response.ProdutoDetalhadoResponse;
import com.lira.msclientes.application.api.response.ProdutoListResponse;
import com.lira.msclientes.application.api.response.ProdutoResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/v1/produto")
public interface ProdutoApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProdutoResponse postProduto(@Valid @RequestBody ProdutoRequest produtoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ProdutoListResponse> getAllProdutos();

    @GetMapping(value = "/{idProduto}")
    @ResponseStatus(code = HttpStatus.OK)
    ProdutoDetalhadoResponse getProdutoById(@PathVariable UUID idProduto);

    @PatchMapping(value = "/{idProduto}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchProdutoById(@PathVariable UUID idProduto, @Valid @RequestBody ProdutoPatchRequest produtoPatchRequest);

    @PatchMapping(value = "/{idProduto}/emEstoque")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void alteraStatusProdutoParaEmEstoque(@PathVariable UUID idProduto);

    @PatchMapping(value = "/{idProduto}/foraDeEstoque")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void alteraStatusProdutoParaForaDeEstoque(@PathVariable UUID idProduto);

    @DeleteMapping(value = "/{idProduto}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaProduto(@PathVariable UUID idProduto);
}
