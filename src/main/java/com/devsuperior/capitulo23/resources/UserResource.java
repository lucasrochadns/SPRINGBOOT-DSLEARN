package com.devsuperior.capitulo23.resources;


import com.devsuperior.capitulo23.domain.dto.UserAllDTO;
import com.devsuperior.capitulo23.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserServices userServices;

    @GetMapping
    public ResponseEntity<List<UserAllDTO>> findAll(){
        return ResponseEntity.ok(userServices.findAll());
    }
}
