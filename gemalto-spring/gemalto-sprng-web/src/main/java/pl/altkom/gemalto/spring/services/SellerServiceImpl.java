/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.altkom.gemalto.spring.dao.SellerRepository;
import pl.altkom.gemalto.spring.model.Seller;

/**
 *
 * @author mmierzyn
 */
@Service
public class SellerServiceImpl {
    @Autowired
    private SellerRepository sellerRepository;
    
    public void create (Seller seller){
        sellerRepository.save(seller);
    }

    public SellerRepository getSellerRepository() {
        return sellerRepository;
    }

    public void setSellerRepository(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }
    
    
}
