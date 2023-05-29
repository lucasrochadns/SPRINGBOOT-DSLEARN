package com.devsuperior.capitulo23.resources;

import com.devsuperior.capitulo23.domain.dto.ProductAllDTO;
import com.devsuperior.capitulo23.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value="/product")
public class ProductResource {

    @Autowired
    private ProductServices productServices;

    @GetMapping
    public ResponseEntity<List<ProductAllDTO>> findAll(){
        return ResponseEntity.ok(productServices.findAll());
    }
}
