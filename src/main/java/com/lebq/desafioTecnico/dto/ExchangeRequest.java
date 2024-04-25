package com.lebq.desafioTecnico.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRequest {

    private String id;
    private String username;
    private Double initialAmmount;
    private Double finalAmmount;
    private Double exchange;
    private Date processDate;
}
