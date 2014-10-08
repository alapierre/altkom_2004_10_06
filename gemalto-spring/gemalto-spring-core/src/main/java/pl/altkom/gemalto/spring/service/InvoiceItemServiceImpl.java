/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.altkom.gemalto.spring.dao.InvoiceItemRepository;
import pl.altkom.gemalto.spring.model.InvoiceItem;

/**
 *
 * @author mchodun
 */
@Service
public class InvoiceItemServiceImpl implements InvoiceItemService {

    @Autowired
    private InvoiceItemRepository invoiceItemRepository;

    @Override
    public void addItem(InvoiceItem invoiceItem) {
        invoiceItemRepository.save(invoiceItem);
    }

    public void deleteItem(InvoiceItem invoiceItem) {
        invoiceItemRepository.delete(invoiceItem);
    }
    
    @Override
    public InvoiceItemRepository getInvoiceItemRepository() {
        return invoiceItemRepository;
    }

    @Override
    public void setInvoiceItemRepository(InvoiceItemRepository invoiceItemRepository) {
        this.invoiceItemRepository = invoiceItemRepository;
    }
}
