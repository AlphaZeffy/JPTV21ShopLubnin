/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoplubnin;

import Entity.Client;
import Entity.Product;
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
    clientManager = new clientManager();
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
                    System.out.println("zada4a 2. pisok knig");
                    productManager.printListProduct(product);
                case 3: 
                    System.out.println("Задача 2. Добавить читателя");
                    this.readers = 
                            Arrays.copyOf(this.readers, this.readers.length+1);
                    this.readers[this.readers.length-1] = readerManager.createReader();
                    break;  
            }
        System.out.println("=======---------========");
        }while(repeat);  
    }
}


                
        
    
       
        
