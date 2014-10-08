/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import pl.altkom.gemalto.spring.model.Customer;

/**
 *
 * @author admin
 */
public class CustomerJpaItemReader implements ItemReader<Customer> {

    @Override
    public Customer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        
        return null;
        
    }
    
}
