import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by L.x on 14-10-15.
 */
public class Customer {
    private Vector<Order> _orders = new Vector<Order>();
    private String _name;

    void printOwing() {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        printBanner();

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        printDetails(outstanding);
    }

    private void printBanner() {
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }

    private void printDetails(double outstanding) {
        System.out.println("name:" + _name);
        System.out.println("amount" + outstanding);
    }
}
