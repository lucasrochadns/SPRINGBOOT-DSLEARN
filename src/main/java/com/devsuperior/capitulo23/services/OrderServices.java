package com.devsuperior.capitulo23.services;

import com.devsuperior.capitulo23.domain.dto.OrderAllDTO;
import com.devsuperior.capitulo23.domain.entities.Order;
import com.devsuperior.capitulo23.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class OrderServices {

    @Autowired
    private OrderRepository orderRepository;
    public List<OrderAllDTO> findAll(){
        return orderRepository.findAll().stream().map(u -> new OrderAllDTO(u.getId(), u.getMoment(), u.getOrderStatus(), u.getCliente())).collect(Collectors.toList());
    }

    public OrderAllDTO findById(Long id){
        Optional<Order> u = orderRepository.findById(id);
        return new OrderAllDTO(u.get().getId(), u.get().getMoment(), u.get().getOrderStatus(), u.get().getCliente());
    }
    public void save(OrderAllDTO orderAllDTO){
        orderRepository.save(new Order(orderAllDTO));
    }

    public void saveAll(List<OrderAllDTO> orderAllDTO){
        List<Order> conv = orderAllDTO.stream().map(x -> new Order(x)).collect(Collectors.toList());
        orderRepository.saveAll(conv);
    }
}

