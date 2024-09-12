package com.Client.client.clientController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Clientcon {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/client")
    public String m1() {
        String Address = restTemplate.getForObject("http://localhost:8082/add", String.class);
        return "id:1,clientname:XYZ,email:XYZ@gmail.com" + Address;
    }

}
