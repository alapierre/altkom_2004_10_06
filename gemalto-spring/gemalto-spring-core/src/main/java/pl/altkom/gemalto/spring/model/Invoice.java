/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Student
 */
@Entity
public class Invoice extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    private BigDecimal totalSumNet;
    private BigDecimal totalSumGross;
    
    @OneToOne
    private Customer customer;
    @OneToOne
    private Seller seller;

    @OneToMany
    @JoinColumn(name = "invoice_id")
    private List<InvoiceItem> invoiceItems;
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public BigDecimal getTotalSumNet() {
        return totalSumNet;
    }

    public void setTotalSumNet(BigDecimal totalSumNet) {
        this.totalSumNet = totalSumNet;
    }

    public BigDecimal getTotalSumGross() {
        return totalSumGross;
    }

    public void setTotalSumGross(BigDecimal totalSumGross) {
        this.totalSumGross = totalSumGross;
    }
 
}
