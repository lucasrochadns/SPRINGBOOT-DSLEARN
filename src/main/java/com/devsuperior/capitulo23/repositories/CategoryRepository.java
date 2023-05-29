package com.devsuperior.capitulo23.repositories;


import com.devsuperior.capitulo23.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
