/**
 * Created by L.x on 14-10-15.
 */
public class Example {
    private int _numberOfLateDeliveries;

    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
