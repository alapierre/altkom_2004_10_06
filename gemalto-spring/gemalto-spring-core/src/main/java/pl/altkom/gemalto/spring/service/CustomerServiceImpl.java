/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    public Customer loadById(long id) {
        return customerRepository.findOne(id);
    }
    
    @Transactional
    public void save(Iterable<Customer> list) {
        customerRepository.save(list);
    }
    
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
