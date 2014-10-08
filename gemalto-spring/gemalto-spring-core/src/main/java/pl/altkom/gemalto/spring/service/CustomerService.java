/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.service;

import pl.altkom.gemalto.spring.model.Customer;

/**
 *
 * @author admin
 */
public interface CustomerService {

    void create(Customer customer);

    Customer loadById(long id);

    void save(Iterable<Customer> list);
    
}
