/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoplubnin;

import Entity.Client;
import Entity.Product;
import Manager.clientmanager;
import Manager.productmanager;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private Client[] client;
    private Product[] product;
    private final productmanager productManager;
    private final clientmanager clientManager;
    
    public App(){
    this.product = new Product[0];
    this.client = new Client[0];
    
    productManager = new productmanager();
    clientManager = new clientmanager();
    
    }
    
    public void run(){
        boolean repeat = true; 
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Spisok zadatch");
            System.out.println("0. zakrit jprogrammu");
            System.out.println("1. dobavitj product");
            System.out.println("2. spisok poductov");
            System.out.println("3. dobavitj pokupatelja");
            System.out.println("4. spisok zaregestrirovannix pokupatelei");
            System.out.println("5. pokupka pokupatelem producta");
            System.out.println("6. doxod magazina za vse vremja");
            System.out.println("7. dabavitj deneg pokupatelju");
            System.out.println("Viderite nomer zada4i");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("___________________");
            switch (task){
                case 0: 
                    repeat = false;
                    System.out.println("Zada4a 0. zaktritj programmu");
                    break;
                case 1: 
                    productmanager productmanager = new  productmanager();
                    System.out.println("zada4a 1. dobavitj product");
                    this.product = Arrays.copyOf(this.product, this.product.length+1);
                    this.product[this.product.length-1] = productmanager.addproduct();
                    break;
                case 2:
                    System.out.println("zada4a 2. spisok produktov");
                    productManager.printListProduct(product);
                    break;
                case 3: 
                    System.out.println("zada4a 3. dobavitj pokupetelja");
                    this.client =  Arrays.copyOf(this.client, this.client.length+1);
                    this.client[this.client.length-1] = clientManager.addClient();
                    break;  
                case 4:
                    System.out.println("zada4a 4. spiusok zaregestrirovannix poljzovatelei");
                    clientManager.printListClients(client);
                    break;
                case 5: 
                    System.out.println("zada4a 5. pokupka pokupatelem producta");
                    System.out.println("spisok pokupatelej: ");
                    for(int i = 0; i < client.length; i++){
                        System.out.println(i+1);
                    }
                    int buy1 = scanner.nextInt();
                    System.out.println("spisok productov: ");
                    for(int j = 0; j< product.length; j++){
                        System.out.println(j+1);
                    }
                    int buy2 = scanner.nextInt();
                    int pur = client[buy1-1].getCash() - product[buy2-1].getPrice();
                    client[buy1-1].setCash(pur);
                    
                    break;
                case 6:
                    System.out.println("zada4a 6. doxod magazina za vse vremja");

                    break;
                case 7:
                    System.out.println("zada4a 7.dobavitj denjag pokupatelju");
                    System.out.println("viberite pokupatelja dlja pereda4i deneg");
                    System.out.println(" spisok pokupatelej");
                    for(int i = 0; i< client.length; i++){
                        System.out.println(i+1);
                    }
                    int turn = scanner.nextInt();
                    System.out.println("skoljko deneg?");
                    int addMoney = scanner.nextInt();
                    int TotalMoney = client[turn -1].getCash()+ addMoney;
                   client[turn -1].setCash(TotalMoney);
                    break;
            }
        System.out.println("=======---------========");
        }while(repeat);  
    }
}


                
        
    
       
        
