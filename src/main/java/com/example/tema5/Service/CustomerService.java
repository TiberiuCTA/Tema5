package com.example.tema5.Service;

import com.example.tema5.DTO.CustomerDTO;
import com.example.tema5.Mapper.CustomerMapper;
import com.example.tema5.Model.Customer;
import com.example.tema5.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    public List<CustomerDTO> getCustomers() {
        return customerRepository.findAll().stream().map(customerMapper::toCustomerDTO).collect(Collectors.toList());
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public CustomerDTO getCustomerById(Integer id) {
        return customerMapper.toCustomerDTO(customerRepository.findById(id).get());
    }

}
