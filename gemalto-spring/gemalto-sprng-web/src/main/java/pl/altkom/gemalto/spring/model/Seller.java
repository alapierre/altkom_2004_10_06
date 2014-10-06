/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author mmierzyn
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Seller extends BaseEntity {
    
    @Size(max = 128)
    @NotEmpty
    private String name;
    @Size(max = 64)
    private String phoneNumber;
    @Size(max = 32)
    @NotEmpty
    private String nip;
    
    @Embedded()
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNip() {
        return nip;
    }
    
}
