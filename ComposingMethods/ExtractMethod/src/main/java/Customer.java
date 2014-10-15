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
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    private void printBanner() {
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }

    private double getOutstanding() {
        Enumeration _enum = _orders.elements();
        double result = 0;
        while (_enum.hasMoreElements()) {
            Order each = (Order) _enum.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    private void printDetails(double outstanding) {
        System.out.println("name:" + _name);
        System.out.println("amount" + outstanding);
    }
}
