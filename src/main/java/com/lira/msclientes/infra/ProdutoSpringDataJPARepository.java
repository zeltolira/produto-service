package com.lira.msclientes.infra;

import com.lira.msclientes.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoSpringDataJPARepository extends JpaRepository <Produto, UUID> {
}
