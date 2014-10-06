/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.gemalto.spring.dao.InvoiceRepository;

/**
 *
 */
@ContextConfiguration("/gemalto-sprng-web-core.xml")
@TransactionConfiguration(defaultRollback = false)
public class TestContext extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    private InvoiceRepository invoiceRepository;
    
    @Test
    public void test() {
        System.out.println("!!!");
        
        invoiceRepository.findAll();
        
    }
    
}
