/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.writter;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import pl.altkom.gemalto.spring.model.Customer;

/**
 *
 * @author admin
 */
public class CustomerItemWriter implements ItemWriter<Customer>{

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        
    }
    
}
