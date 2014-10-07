/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.jaxb;

import pl.com.softproject.commons.model.invoice.Invoice;

/**
 *
 * @author admin
 */
public class InvoiceSerilizer extends BaseXMLSerializer<Invoice>{
    
    public InvoiceSerilizer() {
        super("pl.com.softproject.commons.model.invoice", 
                "invoice.xsd", 
                "http://www.softproject.com.pl/commons/model/invoice http://schema.softproject.com.pl/commons/invoice.xsd");
    }
    
}
