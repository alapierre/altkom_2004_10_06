/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import javax.persistence.Entity;

/**
 *
 * @author esiedlecki
 */
@Entity 
public class Address extends BaseEntity{
    
    private String street;
    private String town;
    private String postal_code;
    
     public void setStreet(String street) {
        this.street = street;
    }
     
    public void setTown(String town) {
        this.town = town;
    }
          
    public void setPostal_code(String PC) {
        this.postal_code = PC;
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
