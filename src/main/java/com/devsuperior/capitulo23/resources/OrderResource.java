package com.devsuperior.capitulo23.resources;

import com.devsuperior.capitulo23.domain.dto.OrderAllDTO;
import com.devsuperior.capitulo23.domain.dto.UserAllDTO;
import com.devsuperior.capitulo23.domain.enums.OrderStatus;
import com.devsuperior.capitulo23.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/order")
public class OrderResource {

    @Autowired
    private OrderServices orderServices;

    @GetMapping
    public ResponseEntity<List<OrderAllDTO>> findAll(){
        return ResponseEntity.ok(orderServices.findAll());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<OrderAllDTO> findById(@PathVariable long id){
        OrderAllDTO orderAllDTO = orderServices.findById(id);
        return ResponseEntity.ok().body(orderAllDTO);
    }

    @PostMapping
    public ResponseEntity save(OrderAllDTO orderAllDTO){
        orderServices.save(orderAllDTO);
        return ResponseEntity.ok(HttpStatus.NO_CONTENT);
    }
}
