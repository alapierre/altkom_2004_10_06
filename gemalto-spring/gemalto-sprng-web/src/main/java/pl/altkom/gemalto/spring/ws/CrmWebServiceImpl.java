/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.ws;

import java.util.Collection;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import pl.altkom.gemalto.spring.model.Customer;
import pl.altkom.gemalto.spring.service.CustomerService;

/**
 *
 * @author admin
 */
@WebService(endpointInterface = "pl.altkom.gemalto.spring.ws.CrmWebService")
public class CrmWebServiceImpl implements CrmWebService {
    
    @Resource
    private WebServiceContext wscontext;
    
    @Autowired
    private CustomerService customerService;
    
    @Override
    public Customer loadById(long id) {
        
        String login = wscontext.getUserPrincipal().getName();
        
        
        
        System.out.println("login = " + login);
        
        bySpringScurity();
        
        return customerService.loadById(id);
    }
    
    private void bySpringScurity() {
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        
        Collection<? extends GrantedAuthority> roles = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        
        System.out.println(roles);
        
        System.out.println("logged user by spring = " + name); 
    }
    
}
