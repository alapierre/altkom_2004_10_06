/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import java.util.logging.Logger;

/**
 *
 * @author mmierzyn
 */
public class Seller {
    private String name;
    private String phoneNumber;
    private String nip;

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
