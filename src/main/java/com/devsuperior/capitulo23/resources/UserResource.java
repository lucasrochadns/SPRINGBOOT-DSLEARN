package com.devsuperior.capitulo23.resources;


import com.devsuperior.capitulo23.domain.dto.UserAllDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<UserAllDTO> findAll(){
        return ResponseEntity.ok(new UserAllDTO(1L, "Lucas Rocha dos Santos", "lucarochadns@gmail.com", "38 998644844", "123456", LocalDate.of(1995, 4, 1)));
    }
}
