/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.altkom.gemalto.spring.model.InvoiceItem;

/**
 *
 * @author mchodun
 */
public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long>{
    
}
