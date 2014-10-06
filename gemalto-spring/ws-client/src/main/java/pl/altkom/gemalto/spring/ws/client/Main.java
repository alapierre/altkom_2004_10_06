/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.gemalto.spring.ws.client;

import pl.altkom.gemalto.spring.ws.HelloServiceImplService;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {

        HelloServiceImplService service = new HelloServiceImplService();

        String res = service.getHelloServiceImplPort().sayHallo("Alicja");

        System.out.println("res -> " + res);
    }

}
