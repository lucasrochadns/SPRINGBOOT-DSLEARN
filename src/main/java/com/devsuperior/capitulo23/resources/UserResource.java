package com.devsuperior.capitulo23.resources;


import com.devsuperior.capitulo23.domain.dto.UserAllDTO;
import com.devsuperior.capitulo23.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value="/{id}")
    public ResponseEntity<UserAllDTO> findById(@PathVariable long id){
       UserAllDTO userAllDTO = userServices.findById(id);
       return ResponseEntity.ok().body(userAllDTO);
    }

    @PostMapping
    public ResponseEntity save(UserAllDTO userAllDTO){
        userServices.save(userAllDTO);
        return ResponseEntity.ok(HttpStatus.NO_CONTENT);
    }
}
