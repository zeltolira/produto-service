package com.lira.msclientes.application.api.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lira.msclientes.domain.StatusProduto;
import com.lira.msclientes.domain.TipoPromocao;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProdutoRequest {
    @NotBlank
    private String nomeProduto;
    @NotNull(message = "O preço é obrigatório.")
    @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero.")
    private BigDecimal precoProduto;
    @NotNull(message = "O status do produto é obrigatório.")
    private StatusProduto statusProduto = StatusProduto.EM_ESTOQUE;
    private TipoPromocao promocao;
}
