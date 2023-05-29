package com.devsuperior.capitulo23.repositories;


import com.devsuperior.capitulo23.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
