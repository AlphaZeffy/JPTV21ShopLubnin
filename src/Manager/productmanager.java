/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.Product;
import java.util.Scanner;


public class productmanager {
    private Scanner scanner;

    
    public productmanager(){
        this.scanner = new Scanner(System.in);
    }
    
    public Product addproduct(){
        Product product = new Product();
        System.out.println(" vvedite nazvanie produkta");
        product.setProductName(scanner.nextLine());
        System.out.println(" vvedite tsenu za product");
        product.setPrice(scanner.nextInt());scanner.nextLine();
        System.out.println(" vvedite koli4estvo tovara");
        product.setPrice(scanner.nextInt());scanner.nextLine();
        return product;
    }
    public void printListProduct(Product[] product){
        for (int i = 0; i < product.length; i++) {
            Product pr  = product[i];
            System.out.printf(i+1+".  %s%n",pr.getProductName() +" - "+ pr.getPrice());
        }

    }
    
}