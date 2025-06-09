package com.lira.msclientes.promocao;


import com.lira.msclientes.domain.TipoPromocao;

import java.math.BigDecimal;

public interface DescontoStrategy {
    BigDecimal calcularDesconto(BigDecimal preco, int quantidade);
    TipoPromocao getTipo();
    default boolean isAplicavel(int quantidade){
        return true;
    }
}
