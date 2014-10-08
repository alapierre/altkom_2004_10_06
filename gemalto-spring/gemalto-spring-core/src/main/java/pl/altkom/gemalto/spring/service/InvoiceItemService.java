/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.service;

import pl.altkom.gemalto.spring.dao.InvoiceItemRepository;
import pl.altkom.gemalto.spring.model.InvoiceItem;

/**
 *
 * @author mchodun
 */
public interface InvoiceItemService {

    void addItem(InvoiceItem invoiceItem);

    InvoiceItemRepository getInvoiceItemRepository();

    void setInvoiceItemRepository(InvoiceItemRepository invoiceItemRepository);

    void deleteItem(InvoiceItem invoiceItem);
    
}
