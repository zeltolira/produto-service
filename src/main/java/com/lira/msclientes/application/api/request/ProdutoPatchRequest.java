package com.lira.msclientes.application.api.request;

import com.lira.msclientes.domain.StatusProduto;
import com.lira.msclientes.domain.TipoPromocao;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@ToString
public class ProdutoPatchRequest {
    @NotNull
    private String nomeProduto;
    @NotNull
    private BigDecimal precoProduto;
    private StatusProduto statusProduto;
    @NotNull
    private TipoPromocao promocao;
    private LocalDateTime dataHoraUltimaAteracao;
}
