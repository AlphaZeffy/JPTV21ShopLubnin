
package Manager;

import Entity.Client;
import Entity.Product;
import Entity.Purchase;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class purchasemanager {
    private final Scanner scanner = new Scanner(System.in);
    
    public Purchase buyProduct(Product[] products, Client[] clients){
        Purchase purchase = new Purchase();
 
        
        System.out.println("spisok pokupatelej");
        ClientManager clientManager = new ClientManager();
        clientManager.printListClients(clients);
        System.out.println(" vibirite nomer pokupatelja");
        int numberClient = scanner.nextInt();scanner.nextLine();
        
        System.out.println("spisok producktov");
        productmanager productmanager = new productmanager();
        productmanager.printListProducts(products);
        System.out.print("viberite nomer producta iz spiska: ");
        int numberProduct = scanner.nextInt();scanner.nextLine();
        System.out.println("skoljko ekzempljarov tovara? ");
        int quantity = scanner.nextInt();
        if(!products[numberProduct-1].quantityMinuss(quantity)){
            System.out.println("Продукта нет");
            return null;
        }
//        for(int i = 0; i < clients.length; i++){
//            System.out.printf("%d %s %s. money: %s %n",i+1);
//        int buy1 = scanner.nextInt();
//        for(int j = 0; j< products.length; j++){
//        System.out.println(j+1);
//        }

        
        
        clients[numberClient-1].setCash(clients[numberClient-1].getCash()- products[numberProduct-1].getPrice()*quantity);
        purchase.setProduct(products[numberProduct-1]);
        purchase.setClient(clients[numberClient-1]);
        purchase.setDate(new GregorianCalendar().getTime());
        purchase.setQuantity(quantity);
        
        
        return purchase;
        
    } 
}
