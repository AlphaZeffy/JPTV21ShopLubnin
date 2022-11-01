
package Entity;

/**
 *
 * @author Admin
 */
public class History {
    private String Purchase;

    public History() {
    }

    public String getPurchase() {
        return Purchase;
    }

    public void setPurchase(String Purchase) {
        this.Purchase = Purchase;
    }

    @Override
    public String toString() {
        return "History{" 
                + "Purchase=" + Purchase 
                + '}';
    }
    
}
