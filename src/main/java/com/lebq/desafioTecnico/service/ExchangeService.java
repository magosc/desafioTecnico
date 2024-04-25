package com.lebq.desafioTecnico.service;

import com.lebq.desafioTecnico.dto.User;
import com.lebq.desafioTecnico.entities.Exchange;
import com.lebq.desafioTecnico.jpa.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ExchangeService {

    @Autowired
    ExchangeRepository repository;

    @Autowired
    RestTemplate restTemplate;

    public void save(Exchange exchange){
        repository.save(exchange);
    }

    public void delete(Exchange exchange){
        repository.delete(exchange);
    }

    public List<Exchange> getAll(){
        return repository.findAll();
    }

    public List<User> getUserDetails(){
        ResponseEntity<User[]> response = restTemplate.getForEntity(
                "https://gorest.co.in/",
                User[].class
        );
        User[] users = response.getBody();
        List<User> u = Arrays.asList(users);
        return u;
    }
}
