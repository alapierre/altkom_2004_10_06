/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.writter;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import pl.altkom.gemalto.spring.dao.CustomerRepository;
import pl.altkom.gemalto.spring.model.Customer;
import pl.altkom.gemalto.spring.service.CustomerService;

/**
 *
 * @author admin
 */
public class CustomerItemWriter implements ItemWriter<Customer>{

    @Autowired
    private CustomerRepository dao;
    
    @Override
    public void write(List<? extends Customer> list) throws Exception {
        
        for(Customer c : list) {
            System.out.println(c);
            
        }
        dao.save(list);
    }
    
}
