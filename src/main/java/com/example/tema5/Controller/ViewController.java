package com.example.tema5.Controller;

import com.example.tema5.DTO.CustomerDTO;
import com.example.tema5.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("customers")
public class ViewController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("allCustomers", customerService.getCustomers());
        return "customers";
    }

    @GetMapping("/{id}")
    public String getCustomerById(@PathVariable(value = "id") Integer id, Model model) {
        CustomerDTO customer = customerService.getCustomerById(id);
        model.addAttribute("customerById", customer);
        return "customers";
    }


}
