package com.devsuperior.capitulo23.repositories;

import com.devsuperior.capitulo23.domain.OrderItem;
import com.devsuperior.capitulo23.domain.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
