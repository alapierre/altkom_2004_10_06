/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author mchodun
 */
@Entity
public class InvoiceItem extends BaseEntity {
    
    private long InvoiceId;
    private float priceNet;
    private float priceGross;
    @Size(max = 128)
    @NotEmpty
    private String name;
    @Size(max = 128)
    private String description;

    public long getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(long InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    public float getPriceNet() {
        return priceNet;
    }

    public void setPriceNet(float priceNet) {
        this.priceNet = priceNet;
    }

    public float getPriceGross() {
        return priceGross;
    }

    public void setPriceGross(float priceGross) {
        this.priceGross = priceGross;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
