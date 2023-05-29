package com.devsuperior.capitulo23.repositories;

import com.devsuperior.capitulo23.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
