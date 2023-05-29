package com.devsuperior.capitulo23.resources;

import com.devsuperior.capitulo23.domain.dto.CategoryAllDTO;
import com.devsuperior.capitulo23.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/category")
public class CategoryResource {

    @Autowired
    private CategoryServices categoryServices;

    @GetMapping
    public ResponseEntity<List<CategoryAllDTO>> findAll(){
        List<CategoryAllDTO> dto = categoryServices.findAll();
        return ResponseEntity.ok(dto);
    }
}
