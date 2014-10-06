/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.ws;

import javax.jws.WebParam;
import javax.jws.WebService;
import pl.altkom.gemalto.spring.model.Customer;

/**
 *
 * @author admin
 */
@WebService
public interface CrmWebService {

    Customer loadById(@WebParam(name = "id") long id);
    
}
