/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.spring.batch;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import pl.altkom.gemalto.spring.dao.CustomerRepository;
import pl.altkom.gemalto.spring.model.Customer;
import pl.com.softproject.utils.excelexporter.ColumnDescriptor;
import pl.com.softproject.utils.excelexporter.ExcelExporter;

/**
 *
 * @author admin
 */
@ContextConfiguration("/batch-persistance.xml")
public class ExcelExporterTest extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    CustomerRepository dao;
    
    @Test
    public void test() throws IOException {
        
        List<Customer> list = dao.findAll();
        
        ExcelExporter exp = new ExcelExporter("raport");
        
        exp.addColumn(new ColumnDescriptor("Nazwisko i imię", "name"));
        exp.addColumn(new ColumnDescriptor("NIP", "nip"));
        exp.addColumn(new ColumnDescriptor("Ulica", "address.street"));
        
        for(Customer c : list) {
            exp.createRow(c);
        }
        
        File file = File.createTempFile("export", ".xls");
        
        System.out.println(file);
        
        exp.autoSizeAllColumns();
        exp.save(file);
        
    }
    
}
