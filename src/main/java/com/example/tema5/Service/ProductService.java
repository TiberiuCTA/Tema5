package com.example.tema5.Service;

import com.example.tema5.DTO.ProductDTO;
import com.example.tema5.Mapper.ProductMapper;
import com.example.tema5.Model.Product;
import com.example.tema5.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public List<ProductDTO> getProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public ProductDTO getProductById(Integer id) {
        return productMapper.toProductDTO(productRepository.findById(id).get());
    }
}
