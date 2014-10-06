/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author lkozlows
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class User extends BaseEntity {

    @Size(max = 128)
    @NotEmpty
    private String userName;
    @Email
    private String userEmail;
    @Size(max = 32)
    @NotEmpty
    private String userLogin;
    @Size(max = 32)
    @NotEmpty
    private String userPassword;

    public String getUserName() {
        return userName;
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

    public void setUserName(String userName) {
        this.userName = userName;
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
