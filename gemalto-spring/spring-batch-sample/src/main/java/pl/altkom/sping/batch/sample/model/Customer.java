/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.sping.batch.sample.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Student
 */

@XmlRootElement(name = "record")
public class Customer  {
    
    private String name;

    private String nip;

    private Address address;
    
    private double margin;
    
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

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }
    
    

}
