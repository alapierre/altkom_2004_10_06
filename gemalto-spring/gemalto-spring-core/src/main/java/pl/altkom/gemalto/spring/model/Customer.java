/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Student
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
@XmlRootElement
@NamedQuery(name = "Customer.findAll", query = "select c from Customer c")
public class Customer extends BaseEntity {

    @Size(max = 128)
    @NotEmpty
    private String name;

    @Size(max = 32)
    @NotEmpty
    private String nip;

    @Embedded
    private Address address;
    
    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    

}
