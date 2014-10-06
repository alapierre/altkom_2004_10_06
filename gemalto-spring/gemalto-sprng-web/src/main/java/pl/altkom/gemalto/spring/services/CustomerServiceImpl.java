/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.altkom.gemalto.spring.dao.CustomerRepository;
import pl.altkom.gemalto.spring.model.Customer;

/**
 *
 * @author admin
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    
    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
   
    
}
