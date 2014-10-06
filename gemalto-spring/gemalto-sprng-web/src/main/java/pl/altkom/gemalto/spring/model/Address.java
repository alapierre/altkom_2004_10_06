/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author esiedlecki
 */
@Embeddable 
public class Address{
    
    @Size(max = 128)
    @NotEmpty
    private String street;
    @Size(max = 128)
    @NotEmpty
    private String town;
    @Size(max = 8)
    @NotEmpty
    private String postalCode;
    
     public void setStreet(String street) {
        this.street = street;
    }
     
    public void setTown(String town) {
        this.town = town;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", town=" + town + ", postalCode=" + postalCode + '}';
    }

    
    
}
