package com.cloud.ms.training.controller;

import com.cloud.ms.training.DTO.CustomerDetailsDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @PutMapping("/update-customer-details")
    public CustomerDetailsDTO updateCustomerDetails(@RequestBody CustomerDetailsDTO customerDetailsDTO) {
        System.out.println("Updating customer: " + customerDetailsDTO);
        return customerDetailsDTO;
    }


    @GetMapping("/get-customer-details/{name}")
    public CustomerDetailsDTO getCustomerDetails(@PathVariable String name){
        CustomerDetailsDTO customerInfo = new CustomerDetailsDTO();
        customerInfo.setName(name);
        customerInfo.setAge(25);
        customerInfo.setContactNumber(8897);
        customerInfo.setCity("Hyderabad");
        return customerInfo;

//        http://localhost:8080/api/get-customer-details/abc
    }

    @PostMapping("/update-customer-details")
    public CustomerDetailsDTO updateNewCustomerDetails(@RequestBody CustomerDetailsDTO customerDetailsDTO){
        return customerDetailsDTO;
    }

    @DeleteMapping("/delete-customer-details")
    public String deleteCustomerDetails(@RequestParam String name) {
        System.out.println("Deleted customer: " + name);
        return "Customer " + name + " deleted successfully";
    }

}
