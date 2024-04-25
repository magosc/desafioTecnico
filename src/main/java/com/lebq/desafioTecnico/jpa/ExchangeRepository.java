package com.lebq.desafioTecnico.jpa;

import com.lebq.desafioTecnico.entities.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange, String> {
}
