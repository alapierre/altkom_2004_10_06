/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.sping.batch.sample.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pl.altkom.sping.batch.sample.model.Address;
import pl.altkom.sping.batch.sample.model.Customer;

/**
 *
 * @author admin
 */
public class CustomerRowMapper implements RowMapper<Customer>{

    @Override
    public Customer mapRow(ResultSet rs, int i) throws SQLException {
        
        Customer customer = new Customer();
        
        customer.setName(rs.getString("name"));
        customer.setNip(rs.getString("nip"));
        
        Address address = new Address();
        address.setPostalCode(rs.getString("postalCode"));
        address.setStreet(rs.getString("street"));
        address.setTown(rs.getString("town"));
        
        customer.setAddress(address);
        
        return customer;
    }
    
}
