package com.harshita.resttemplatedemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.harshita.resttemplatedemo.model.FinalResponse;
import org.springframework.beans.PropertyBatchUpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/product")
    public FinalResponse getAllProducts() throws JsonProcessingException {
        FinalResponse entity = restTemplate.getForObject("https://fakestoreapi.com/products/1", FinalResponse.class);
        return entity;
    }

    @GetMapping("/products")
    public FinalResponse[] getProducts(){
        FinalResponse[] response = restTemplate.getForObject("https://fakestoreapi.com/products", FinalResponse[].class);
        return response;
    }





}