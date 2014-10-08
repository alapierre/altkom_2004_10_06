/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.processor;

import org.springframework.batch.item.ItemProcessor;
import pl.altkom.sping.batch.sample.model.Customer;
import pl.altkom.sping.batch.sample.model.Report;

/**
 *
 * @author admin
 */
public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        
        System.out.println("customer " + customer);
        
        customer.setMargin(Math.random());
        
        System.out.println("margin " + customer.getMargin());
        
        return customer;
        
    }
    
}
