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
 * @author esiedlecki
 */
@Entity 
public class Address extends BaseEntity{
    
    @Size(max = 128)
    @NotEmpty
    private String street;
    @Size(max = 128)
    @NotEmpty
    private String town;
    @Size(max = 8)
    @NotEmpty
    private String postal_code;
    
     public void setStreet(String street) {
        this.street = street;
    }
     
    public void setTown(String town) {
        this.town = town;
    }
          
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getPostal_code() {
        return postal_code;
    }
}
