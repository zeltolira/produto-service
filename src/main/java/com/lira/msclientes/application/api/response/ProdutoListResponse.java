package com.lira.msclientes.application.api.response;

import com.lira.msclientes.domain.Produto;
import com.lira.msclientes.domain.StatusProduto;
import com.lira.msclientes.domain.TipoPromocao;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@ToString
public class ProdutoListResponse {
    private UUID idProduto;
    private String nomeProduto;
    private BigDecimal precoProduto;
    private StatusProduto statusProduto;
    private TipoPromocao promocao;
    private LocalDateTime dataHoraCriacao;

    public static List<ProdutoListResponse> converte(List<Produto> produtos) {
        return produtos.stream()
                .map(ProdutoListResponse::new)
                .collect(Collectors.toList());
    }


    public ProdutoListResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nomeProduto = produto.getNomeProduto();
        this.precoProduto = produto.getPrecoProduto();
        this.statusProduto = produto.getStatusProduto();
        this.promocao = produto.getPromocao();
        this.dataHoraCriacao = produto.getDataHoraCriacao();
    }
}
