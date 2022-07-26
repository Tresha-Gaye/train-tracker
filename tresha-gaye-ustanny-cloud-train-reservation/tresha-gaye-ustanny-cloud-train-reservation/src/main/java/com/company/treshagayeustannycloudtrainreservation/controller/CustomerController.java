package com.company.treshagayeustannycloudtrainreservation.controller;

import com.company.treshagayeustannycloudtrainreservation.model.Customer;
import com.company.treshagayeustannycloudtrainreservation.service.CustomerServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class CustomerController {

    @Autowired
    CustomerServiceLayer customerServiceLayer;

    @PostMapping("/customer")
    public Customer addStation (@RequestBody Customer customer) {
        return customerServiceLayer.createCustomer(customer);
    }

    @GetMapping("/customer")
    public List<Customer> getAllStations () {

        return customerServiceLayer.findAllCustomers();
    }

    @GetMapping ("/customer/{customerId}")
    public Customer getStationById (@PathVariable Integer customerId){
        return customerServiceLayer.getCustomerById(customerId);
    }

    @PutMapping("/customer")
    public void updateStation(@RequestBody Customer customer) {
        customerServiceLayer.updateCustomer(customer);
    }

    @DeleteMapping ("/customer/{customerId}")
    public void deleteStation(@PathVariable Integer customerId) {
        customerServiceLayer.deleteCustomer(customerId);
    }
}