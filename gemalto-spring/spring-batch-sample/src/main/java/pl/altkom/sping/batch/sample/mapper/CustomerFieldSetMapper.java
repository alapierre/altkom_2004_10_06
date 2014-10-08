/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import pl.altkom.sping.batch.sample.model.Address;
import pl.altkom.sping.batch.sample.model.Customer;
import pl.altkom.sping.batch.sample.model.Report;

/**
 *
 * @author admin
 */
public class CustomerFieldSetMapper implements FieldSetMapper<Customer> {

    @Override
    public Customer mapFieldSet(FieldSet fs) throws BindException {
        
        Customer customer = new Customer();
        
        customer.setName(fs.readString("name"));
        customer.setNip(fs.readString("nip"));
        
        Address address = new Address();
        address.setPostalCode(fs.readString("postalCode"));
        address.setStreet(fs.readString("street"));
        address.setTown(fs.readString("town"));
        
        customer.setAddress(address);
        
        return customer;
        
    }
    
}
