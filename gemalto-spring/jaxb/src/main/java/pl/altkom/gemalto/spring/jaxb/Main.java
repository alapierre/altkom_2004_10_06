/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.jaxb;

import java.io.File;
import pl.com.softproject.commons.model.invoice.Invoice;

/**
 *
 * @author admin
 */
public class Main {
    
    public static void main(String[] args) {
        
        InvoiceSerilizer serilizer = new InvoiceSerilizer();
        
        Invoice invoice = serilizer.fromFile(new File("src/main/resources/FS 1_MAG_05_2012.xml"));
        
        for(Invoice.Items.Item item : invoice.getItems().getItem()) {
            System.out.println(item.getName());
        }
        
        toXML();
    }
    
    public static void toXML() {
        
        InvoiceSerilizer serilizer = new InvoiceSerilizer();
        
        Invoice invoice = new Invoice();
        
        invoice.setBuyer("ala ma kota");
        
        String str = serilizer.toString(invoice, false);
        
        System.out.println(str);
    }
    
}
