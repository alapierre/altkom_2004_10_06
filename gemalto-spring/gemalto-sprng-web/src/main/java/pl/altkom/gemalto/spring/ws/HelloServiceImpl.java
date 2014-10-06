/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author admin
 */
@WebService(endpointInterface = "pl.altkom.gemalto.spring.ws.HelloService")
public class HelloServiceImpl implements HelloService {
     
    public String sayHallo(@WebParam(name = "name") String name) {
        return "Hello " + name;
    }
    
}
