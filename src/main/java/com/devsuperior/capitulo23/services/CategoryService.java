package com.devsuperior.capitulo23.services;

import java.util.List;
import java.util.Optional;

import com.devsuperior.capitulo23.domain.Category;
import com.devsuperior.capitulo23.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
