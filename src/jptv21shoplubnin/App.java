/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoplubnin;

import Entity.Client;
import Entity.Product;
import Entity.Purchase;
import Manager.ClientManager;
import Manager.productmanager;
import Manager.PurchaseManager;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private Client[] clients;
    private Product[] products;
    private Purchase[] purchases;
    private final productmanager productManager;
    private final ClientManager clientManager;
    private final PurchaseManager purchaseManager;
    
    public App(){
    this.products = new Product[0];
    this.clients = new Client[0];
    this.purchases = new Purchase[0];
    productManager = new productmanager();
    clientManager = new ClientManager();
    purchaseManager = new PurchaseManager();
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
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = productmanager.addproduct();
                    break;
                case 2:
                    System.out.println("zada4a 2. spisok produktov");
                    productManager.printListProducts(products);
                    break;
                case 3: 
                    System.out.println("zada4a 3. dobavitj pokupetelja");
                    this.clients =  Arrays.copyOf(this.clients, this.clients.length+1);
                    this.clients[this.clients.length-1] = clientManager.addClient();
                    break;  
                case 4:
                    System.out.println("zada4a 4. spiusok zaregestrirovannix poljzovatelei");
                    clientManager.printListClients(clients);
                    break;
                case 5: 
                    System.out.println("zada4a 5. pokupka pokupatelem producta");

                    this.purchases = Arrays.copyOf(this.purchases,this.purchases.length+1);
                    this.purchases[this.purchases.length-1]=purchaseManager.buyProduct(products,clients);
                    break;
                case 6:
                    System.out.println("zada4a 6. doxod magazina za vse vremja");
                    purchaseManager.printProfit(purchases);
                    
                    break;
                case 7:
                    System.out.println("zada4a 7.dobavitj denjag pokupatelju");
                    System.out.println("viberite pokupatelja dlja pereda4i deneg");
                    System.out.println(" spisok pokupatelej");
                    for(int i = 0; i < clients.length; i++){
                        System.out.printf("%d %s %s. money: %s %n",
                                i+1
                                ,clients[i].getFirstname()
                                ,clients[i].getLastname()
                                ,clients[i].getCash()
                        );
                    }
                    int turn = scanner.nextInt();
                    System.out.println("skoljko deneg?");
                    int addMoney = scanner.nextInt();
                    int TotalMoney = clients[turn -1].getCash()+ addMoney;
                   clients[turn -1].setCash(TotalMoney);
                    break;
            }
        System.out.println("=======---------========");
        }while(repeat);  
    }
}


                
        
    
       
        
