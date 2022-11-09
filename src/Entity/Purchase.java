
package Entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Purchase {
    private Product product;
    private Client client;
    private Date date;
    private int quantity;

    public Purchase() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" + "product=" + product + ", client=" + client + ", date=" + date + ", quantity=" + quantity + '}';
    }  
}

