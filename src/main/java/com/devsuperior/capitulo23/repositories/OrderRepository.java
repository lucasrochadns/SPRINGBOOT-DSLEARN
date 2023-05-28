package com.devsuperior.capitulo23.repositories;

import com.devsuperior.capitulo23.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Long> {

}
