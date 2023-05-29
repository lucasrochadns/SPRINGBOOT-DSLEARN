package com.devsuperior.capitulo23.services;

import com.devsuperior.capitulo23.domain.dto.ProductAllDTO;
import com.devsuperior.capitulo23.domain.entities.Product;
import com.devsuperior.capitulo23.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductAllDTO> findAll(){
        return productRepository.findAll().stream().
                map(p -> new ProductAllDTO(p.getId(), p.getName(), p.getDescription(), p.getPrice(), p.getImgUrl())).collect(Collectors.toList());
    }

    public void saveAll(List<ProductAllDTO> product){
        productRepository.saveAll(product.stream().map(p -> new Product(p.id(), p.name(), p.description(), p.price(), p.imgUrl())).collect(Collectors.toList()));
    }
}
