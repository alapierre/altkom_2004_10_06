/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.ws;

import javax.jws.WebService;

/**
 *
 * @author admin
 */
@WebService
public interface HelloService {

    String sayHallo(String name);
    
}
