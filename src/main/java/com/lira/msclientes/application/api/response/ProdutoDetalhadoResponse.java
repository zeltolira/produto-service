package com.lira.msclientes.application.api.response;

import com.lira.msclientes.domain.Produto;
import com.lira.msclientes.domain.StatusProduto;
import com.lira.msclientes.domain.TipoPromocao;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@ToString
public class ProdutoDetalhadoResponse {

    private UUID idProduto;
    private String nomeProduto;
    private BigDecimal precoProduto;
    private StatusProduto statusProduto;
    private TipoPromocao promocao;
    private LocalDateTime dataHoraCriacao;

    public ProdutoDetalhadoResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nomeProduto = produto.getNomeProduto();
        this.precoProduto = produto.getPrecoProduto();
        this.statusProduto = produto.getStatusProduto();
        this.promocao = produto.getPromocao();
        this.dataHoraCriacao = produto.getDataHoraCriacao();
    }
}
