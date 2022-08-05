package com.example.tema5.Mapper;


import com.example.tema5.DTO.CustomerDTO;
import com.example.tema5.Model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customer customer);

}
