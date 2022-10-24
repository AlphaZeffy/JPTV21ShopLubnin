/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.Client;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class clientmanager {
    private final Scanner scanner = new Scanner(System.in);
    public Client addClient(){
        Client client = new Client();
        System.out.println("First name");
        client.setFirstname(scanner.nextLine());
        System.out.println("Surname");
        client.setLastname(scanner.nextLine());
        return client;
    }
    
}
