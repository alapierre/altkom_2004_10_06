/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.ws.client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 *
 * @author admin
 */
public class WSAuthenticator extends Authenticator {
    
    protected PasswordAuthentication getPasswordAuthentication() {
        
        System.out.println("trying to auth...");
        
        //"admin", "test.112"
        PasswordAuthentication pass = new PasswordAuthentication("user", "user".toCharArray());
        
        return pass;
    }
    
}
