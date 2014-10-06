/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.ws;

import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import pl.altkom.gemalto.spring.model.Customer;
import pl.altkom.gemalto.spring.services.CustomerService;

/**
 *
 * @author admin
 */
@WebService(endpointInterface = "pl.altkom.gemalto.spring.ws.CrmWebService")
public class CrmWebServiceImpl implements CrmWebService {
    
    @Autowired
    private CustomerService customerService;
    
    @Override
    public Customer loadById(long id) {
        return customerService.loadById(id);
    }
    
}
