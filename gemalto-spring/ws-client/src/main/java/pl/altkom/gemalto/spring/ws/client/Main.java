/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.ws.client;

import java.net.Authenticator;
import pl.altkom.gemalto.spring.ws.CrmWebServiceImplService;
import pl.altkom.gemalto.spring.ws.Customer;



/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {

        Authenticator.setDefault(new WSAuthenticator());
        
        
        CrmWebServiceImplService service = new CrmWebServiceImplService();
        Customer res = service.getCrmWebServiceImplPort().loadById(1);
        
        System.out.println(res.getName());
        System.out.println(res.getNip());
        System.out.println(res.getId());
        
    }

}
