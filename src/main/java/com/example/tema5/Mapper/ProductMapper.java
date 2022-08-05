package com.example.tema5.Mapper;

import com.example.tema5.DTO.ProductDTO;
import com.example.tema5.Model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toProductDTO(Product product);
}
