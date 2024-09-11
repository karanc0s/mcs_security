package com.example.products_ser.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductsController {



    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello World,, by Products Ser");
    }
}
