package com.devsuperior.capitulo23.services;

import com.devsuperior.capitulo23.domain.dto.CategoryAllDTO;
import com.devsuperior.capitulo23.domain.entities.Category;
import com.devsuperior.capitulo23.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;

    public void saveAll(List<Category> category){
       categoryRepository.saveAll(category);
    }
    public List<CategoryAllDTO> findAll(){
        return categoryRepository.findAll().stream().map(x -> new CategoryAllDTO(x.getId(), x.getName())).collect(Collectors.toList());
    }
}
