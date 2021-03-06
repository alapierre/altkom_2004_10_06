/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author lkozlows
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
@Table(name = "users")
public class User extends BaseEntity {

    @Size(max = 128)
    @NotEmpty
    private String name;
    
    @Size(max = 128)
    @NotEmpty
    private String lastName;
    
    @Email
    private String userEmail;
    @Size(max = 32)
    @NotEmpty
    @Column(name = "username", unique = true)
    private String userLogin;
    @Size(max = 32)
    @NotEmpty
    @Column(name = "password")
    private String userPassword;

    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
