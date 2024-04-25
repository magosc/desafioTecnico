package com.lebq.desafioTecnico.controller;

import com.lebq.desafioTecnico.dto.ExchangeRequest;
import com.lebq.desafioTecnico.entities.Exchange;
import com.lebq.desafioTecnico.service.ExchangeService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class ExchangeController {

    @Autowired
    ExchangeService service;

    @Autowired
    Mapper mapper;

    @GetMapping(value = "/exchange")
    public List<ExchangeRequest> getExchange(){
        List<Exchange> all = service.getAll();
        List<ExchangeRequest> list = new LinkedList<>();
        for(Exchange dto:all){
            ExchangeRequest map = mapper.map(dto, ExchangeRequest.class);
            list.add(map);
        }
        return list;
    }

    @PostMapping(value = "/exchange")
    public void saveExchange(@RequestBody ExchangeRequest exchangeRequest){
        Exchange map = mapper.map(exchangeRequest, Exchange.class);
        service.save(map);
    }
}
