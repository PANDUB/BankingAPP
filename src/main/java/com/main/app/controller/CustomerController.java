package com.main.app.controller;

import com.main.app.entity.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
      @PostMapping("/addCustomer")
    public String addCustomer()
    {
        String cifNumber="00000";
        return cifNumber;
    }
    @PostMapping("/newCustomer")
    public String newCustomer()
    {
        String cifNumber="00000";
        return cifNumber;
    }
    @PutMapping("/updateCustomer/{id}")
    public String updateCustomer()
    {
        String cifNumber="00000";
        return cifNumber;
    }
    @DeleteMapping("/updateCustomer/{id}")
    public String deleteCustomer()
    {
        String cifNumber="00000";
        return cifNumber;
    }
    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer()
    {
         Customer customer=new Customer();
         customer.setAge("20").setIdNumber("123456").setName("ABC");

        return customer;
    }
}
