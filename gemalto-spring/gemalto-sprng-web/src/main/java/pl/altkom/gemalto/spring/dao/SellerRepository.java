/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.dao;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.altkom.gemalto.spring.model.Seller;

/**
 *
 * @author mmierzyn
 */
public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
